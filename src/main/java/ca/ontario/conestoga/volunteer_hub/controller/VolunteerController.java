package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.entity.Volunteer;
import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/volunteer")
public class VolunteerController {
  private final VolunteerService volunteerService;

  @Autowired
  public VolunteerController(VolunteerService volunteerService) {
    this.volunteerService = volunteerService;
  }

  @GetMapping("/{id}")
  public Result<Volunteer> getVolunteer(@PathVariable Integer id) {
    Volunteer volunteer = volunteerService.getVolunteerById(id);
    if (volunteer == null) {
      return Result.error("Volunteer not found for ID: " + id);
    }
    return Result.success(volunteer);
  }

  @GetMapping("/")
  public Result<List<Volunteer>> getAllVolunteers() {
    List<Volunteer> volunteers = volunteerService.getAllVolunteers();
    return Result.success(volunteers);
  }

  @PostMapping("/")
  public Result<Void> createVolunteer(@RequestBody Volunteer volunteer) {
    volunteerService.saveVolunteer(volunteer);
    return Result.success();
  }

  @PutMapping("/{id}")
  public Result<Void> updateVolunteer(@PathVariable Integer id, @RequestBody Volunteer volunteer) {
    volunteer.setId(id);
    volunteerService.updateVolunteer(volunteer);
    return Result.success();
  }

  @DeleteMapping("/{id}")
  public Result<Void> deleteVolunteer(@PathVariable Integer id) {
    volunteerService.deleteVolunteer(id);
    return Result.success();
  }
}
