package ca.conestoga.VolunteerHub.volunteer;

import ca.ontario.conestoga.volunteer_hub.entity.Volunteer;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventDetailVO;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionVO;
import ca.ontario.conestoga.volunteer_hub.service.impl.VolunteerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PositionApplicationValidatorTest {

    @Mock
    private Volunteer applicant;

    @Mock
    private PositionVO position;

    @Mock
    private EventDetailVO event;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testApplicantType() {
        setupValidScenario();

        assertThrows(HubException.class,
            () -> VolunteerServiceImpl.validPositionApplication(null, position),
            "Only volunteers can submit a position application!");
    }

    @Test
    void testPositionExistence() {
        setupValidScenario();

        assertThrows(HubException.class,
            () -> VolunteerServiceImpl.validPositionApplication(applicant, null),
            "Position can not be found!");
    }

    @Test
    void testValidApplication() {
        setupValidScenario();

        assertDoesNotThrow(() -> VolunteerServiceImpl.validPositionApplication(applicant, position));
    }

    @Test
    void testApplicationTimeBeforeAvailable() {
        setupValidScenario();
        when(position.getApplicationAvailableTime()).thenReturn(getFutureDate(1));

        assertThrows(HubException.class,
            () -> VolunteerServiceImpl.validPositionApplication(applicant, position),
            "Application is not currently available for this position.");
    }

    @Test
    void testApplicationTimeAfterDeadline() {
        setupValidScenario();
        when(position.getApplicationDeadline()).thenReturn(getPastDate(1));

        assertThrows(HubException.class,
            () -> VolunteerServiceImpl.validPositionApplication(applicant, position),
            "Application is not currently available for this position.");
    }

    @Test
    void testPositionFilled() {
        setupValidScenario();
        when(position.getRecruitNum()).thenReturn(10);
        when(position.getRecruitedNum()).thenReturn(10);

        assertThrows(HubException.class,
            () -> VolunteerServiceImpl.validPositionApplication(applicant, position),
            "This position is no longer vacant.");
    }

    @Test
    void testApplicantTooYoung() {
        setupValidScenario();
        when(applicant.getDob()).thenReturn(getDateYearsAgo(17));
        when(position.getMinAge()).thenReturn(18);

        assertThrows(HubException.class,
            () -> VolunteerServiceImpl.validPositionApplication(applicant, position),
            "Applicant's age does not meet the position requirements.");
    }

    @Test
    void testApplicantTooOld() {
        setupValidScenario();
        when(applicant.getDob()).thenReturn(getDateYearsAgo(41));
        when(position.getMaxAge()).thenReturn(40);

        assertThrows(HubException.class,
            () -> VolunteerServiceImpl.validPositionApplication(applicant, position),
            "Applicant's age does not meet the position requirements.");
    }

    @Test
    void testEventAlreadyStarted() {
        setupValidScenario();
        when(event.getEventStartTime()).thenReturn(getPastDate(1));

        assertThrows(HubException.class,
            () -> VolunteerServiceImpl.validPositionApplication(applicant, position),
            "The event has already started or ended.");
    }

    @Test
    void testEventAlreadyEnded() {
        setupValidScenario();
        when(event.getEventEndTime()).thenReturn(getPastDate(1));

        assertThrows(HubException.class,
            () -> VolunteerServiceImpl.validPositionApplication(applicant, position),
            "The event has already started or ended.");
    }

    @Test
    void testMissingEventDetails() {
        setupValidScenario();
        when(position.getEvent()).thenReturn(null);

        assertThrows(HubException.class,
            () -> VolunteerServiceImpl.validPositionApplication(applicant, position),
            "Event details are missing for this position.");
    }

    private void setupValidScenario() {
        when(position.getApplicationAvailableTime()).thenReturn(getPastDate(10));
        when(position.getApplicationDeadline()).thenReturn(getFutureDate(10));
        when(position.getRecruitNum()).thenReturn(10);
        when(position.getRecruitedNum()).thenReturn(5);
        when(position.getMinAge()).thenReturn(18);
        when(position.getMaxAge()).thenReturn(60);
        when(applicant.getDob()).thenReturn(getDateYearsAgo(30));
        when(position.getEvent()).thenReturn(event);
        when(event.getEventStartTime()).thenReturn(getFutureDate(5));
        when(event.getEventEndTime()).thenReturn(getFutureDate(7));
    }

    private Date getPastDate(int days) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -days);
        return cal.getTime();
    }

    private Date getFutureDate(int days) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }

    private Date getDateYearsAgo(int years) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -years);
        return cal.getTime();
    }
}