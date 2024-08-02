package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.entity.Event;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventDetailVO;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventListItem;
import ca.ontario.conestoga.volunteer_hub.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

  private final EventService eventService;

  @Autowired
  public EventController(EventService eventService) {
    this.eventService = eventService;
  }

  @GetMapping("/{id}")
  public Result<Event> getEvent(@PathVariable Integer id) {
    Event Event = eventService.getEventById(id);
    if (Event == null) {
      return Result.error("Volunteer event not found for ID: " + id);
    }
    return Result.success(Event);
  }

  @GetMapping("/")
  public Result<List<Event>> getAllEvents() {
    List<Event> volunteerEvents = eventService.getAllEvents();
    return Result.success(volunteerEvents);
  }

  @PutMapping("/{id}")
  public Result<Void> updateEvent(@PathVariable Integer id, @RequestBody Event event) {
    event.setId(id);
    try {
      eventService.updateEvent(event);
    } catch (HubException e) {
      return Result.error(e.getMessage());
    }
    return Result.success();
  }

  @DeleteMapping("/{id}")
  public Result<Void> deleteEvent(@PathVariable Integer id) {
    try {
      eventService.deleteEvent(id);
    } catch (HubException e) {
      return Result.error(e.getMessage());
    }
    return Result.success();
  }

//  ---- interfaces above are all only about the single table
  @GetMapping("/backend")
  public Result<List<EventListItem>> listEvents(@RequestParam(required = false) Integer orgId) {
    return Result.success(eventService.getEventListByOrgId(orgId));
  }

  @GetMapping("/{id}/detail")
  public Result<EventDetailVO> getEventDetail(@PathVariable Integer id) {
    return Result.success(eventService.getEventDetailById(id));
  }

  @PostMapping
  public Result<Void> saveEvent(@RequestBody EventDetailVO event) {
    eventService.saveEvent(event);
    return Result.success();
  }

  public Result<EventListItem> getVolsJoinedEvents(@RequestParam Integer volunteerId) {
    return null;
  }
}
