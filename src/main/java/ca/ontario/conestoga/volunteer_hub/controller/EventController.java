package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.entity.Event;
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
  public Result<List<Event>> getAllVolunteerEvents() {
    List<Event> volunteerEvents = eventService.getAllEvents();
    return Result.success(volunteerEvents);
  }

  @PostMapping("/")
  public Result<Void> createEvent(@RequestBody Event Event) {
    eventService.saveEvent(Event);
    return Result.success();
  }

  @PutMapping("/{id}")
  public Result<Void> updateEvent(@PathVariable Integer id, @RequestBody Event Event) {
    Event.setId(id);
    eventService.updateEvent(Event);
    return Result.success();
  }

  @DeleteMapping("/{id}")
  public Result<Void> deleteEvent(@PathVariable Integer id) {
    eventService.deleteEvent(id);
    return Result.success();
  }

//  ---- interfaces above are all only about the single table
  @GetMapping("/backend")
  public Result<List<EventListItem>> listEvents(@RequestParam(required = false) Integer hostId) {
    return Result.success(eventService.getEventListByHostId(hostId));
  }
}
