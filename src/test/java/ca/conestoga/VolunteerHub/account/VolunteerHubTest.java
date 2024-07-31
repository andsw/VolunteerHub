package ca.conestoga.VolunteerHub.account;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import ca.ontario.conestoga.volunteer_hub.entity.Account;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.AccountVO;
import ca.ontario.conestoga.volunteer_hub.service.impl.AccountServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VolunteerHubTest {

    private AccountVO accountVO;
    private Account existingAccount;

    @BeforeEach
    public void setUp() {
        accountVO = new AccountVO();
        existingAccount = new Account();
    }

    @Test
    public void testInvalidAccountType() {
        accountVO.setAccountType("invalidType");
        assertThrows(HubException.class, () -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null),
                "Invalid accountType. Must be 'volunteer' or 'organization'.");
    }

    @Test
    public void testVolunteerMissingFirstName() {
        accountVO.setAccountType("volunteer");
        accountVO.setLastName("Doe");
        assertThrows(HubException.class, () -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null),
                "First name cannot be empty for volunteers.");
    }

    @Test
    public void testVolunteerMissingLastName() {
        accountVO.setAccountType("volunteer");
        accountVO.setFirstName("John");
        assertThrows(HubException.class, () -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null),
                "Last name cannot be empty for volunteers.");
    }

    @Test
    public void testOrganizationMissingName() {
        accountVO.setAccountType("organization");
        assertThrows(HubException.class, () -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null),
                "Organization name cannot be empty.");
    }

    @Test
    public void testEmailEmpty() {
        accountVO.setAccountType("volunteer");
        accountVO.setFirstName("John");
        accountVO.setLastName("Doe");
        assertThrows(HubException.class, () -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null),
                "Email cannot be empty.");
    }

    @Test
    public void testEmailChanged() {
        accountVO.setEmail("newEmail@example.com");
        accountVO.setAccountType("volunteer");
        accountVO.setFirstName("John");
        accountVO.setLastName("Doe");
        existingAccount.setUsername("oldEmail@example.com");
        assertThrows(HubException.class, () -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, existingAccount),
                "Email cannot be changed.");
    }

    @Test
    public void testAccountTypeMismatch() {
        accountVO.setEmail("email@example.com");
        accountVO.setAccountType("volunteer");
        existingAccount.setUsername("email@example.com");
        existingAccount.setAccountType("organization");
        assertThrows(HubException.class, () -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, existingAccount),
                "Account type or email does not match the existing account.");
    }

    @Test
    public void testAddressFieldsPartiallyFilled() {
        accountVO.setAccountType("volunteer");
        accountVO.setFirstName("John");
        accountVO.setLastName("Doe");
        accountVO.setEmail("john@example.com");
        accountVO.setAddress("123 Street");
        accountVO.setCity("City");
        assertThrows(HubException.class, () -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null),
                "Address fields must be either all empty or all filled.");
    }

    @Test
    public void testInvalidSex() {
        accountVO.setAccountType("volunteer");
        accountVO.setFirstName("John");
        accountVO.setLastName("Doe");
        accountVO.setEmail("john@example.com");
        accountVO.setSex("invalid");
        assertThrows(HubException.class, () -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null),
                "Sex must be 'male', 'female', or 'other'.");
    }

    @Test
    public void testInvalidMaritalStatus() {
        accountVO.setAccountType("volunteer");
        accountVO.setFirstName("John");
        accountVO.setLastName("Doe");
        accountVO.setEmail("john@example.com");
        accountVO.setMaritalStatus("invalid");
        assertThrows(HubException.class, () -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null),
                "Marital status must be 'single', 'married', 'divorced', or 'widowed'.");
    }

    @Test
    public void testInvalidOccupationStatus() {
        accountVO.setAccountType("volunteer");
        accountVO.setFirstName("John");
        accountVO.setLastName("Doe");
        accountVO.setEmail("john@example.com");
        accountVO.setOccupationStatus("invalid");
        assertThrows(HubException.class, () -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null),
                "Occupation status must be 'employed', 'unemployed', or 'student'.");
    }

    @Test
    public void testFutureDateOfBirth() {
        accountVO.setAccountType("volunteer");
        accountVO.setFirstName("John");
        accountVO.setLastName("Doe");
        accountVO.setEmail("john@example.com");
        accountVO.setDob(new Date(System.currentTimeMillis() + 86400000)); // Tomorrow
        assertThrows(HubException.class, () -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null),
                "Date of birth must be in the past.");
    }

    @Test
    public void testValidVolunteerAccount() throws HubException {
        accountVO.setAccountType("volunteer");
        accountVO.setFirstName("John");
        accountVO.setLastName("Doe");
        accountVO.setEmail("john.doe@example.com");
        accountVO.setAddress("123 Street");
        accountVO.setCity("City");
        accountVO.setProvince("Province");
        accountVO.setCountry("Country");
        accountVO.setPostcode("12345");
        accountVO.setSex("male");
        accountVO.setMaritalStatus("single");
        accountVO.setOccupationStatus("employed");
        accountVO.setDob(new Date(System.currentTimeMillis() - 86400000)); // Yesterday
        assertDoesNotThrow(() -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null));
    }

    @Test
    public void testValidOrganizationAccount() throws HubException {
        accountVO.setAccountType("organization");
        accountVO.setName("OrgName");
        accountVO.setEmail("org@example.com");
        accountVO.setAddress("456 Avenue");
        accountVO.setCity("City");
        accountVO.setProvince("Province");
        accountVO.setCountry("Country");
        accountVO.setPostcode("67890");
        assertDoesNotThrow(() -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null));
    }

    @Test
    public void testValidAccountWithAllFieldsEmpty() throws HubException {
        accountVO.setAccountType("volunteer");
        accountVO.setFirstName("John");
        accountVO.setLastName("Doe");
        accountVO.setEmail("john@example.com");
        assertDoesNotThrow(() -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null));
    }

    @Test
    public void testValidAccountWithAllOptionalFieldsFilled() throws HubException {
        accountVO.setAccountType("volunteer");
        accountVO.setFirstName("John");
        accountVO.setLastName("Doe");
        accountVO.setEmail("john@example.com");
        accountVO.setAddress("123 Street");
        accountVO.setCity("City");
        accountVO.setProvince("Province");
        accountVO.setCountry("Country");
        accountVO.setPostcode("12345");
        accountVO.setSex("other");
        accountVO.setMaritalStatus("divorced");
        accountVO.setOccupationStatus("student");
        accountVO.setDob(new Date(System.currentTimeMillis() - 86400000)); // Yesterday
        assertDoesNotThrow(() -> AccountServiceImpl.checkAccountBeforeSaving(accountVO, null));
    }
}