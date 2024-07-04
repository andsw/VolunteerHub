package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.entity.VolunteerReview;
import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.service.VolunteerReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/volunteerReview")
public class VolunteerReviewController {

  private final VolunteerReviewService volunteerReviewService;

  @Autowired
  public VolunteerReviewController(VolunteerReviewService volunteerReviewService) {
    this.volunteerReviewService = volunteerReviewService;
  }

  @GetMapping("/{id}")
  public Result<VolunteerReview> getVolunteerReview(@PathVariable Integer id) {
    VolunteerReview volunteerReview = volunteerReviewService.getVolunteerReviewById(id);
    if (volunteerReview == null) {
      return Result.error("Volunteer review not found for ID: " + id);
    }
    return Result.success(volunteerReview);
  }

  @GetMapping("/")
  public Result<List<VolunteerReview>> getAllVolunteerReviews() {
    List<VolunteerReview> volunteerReviews = volunteerReviewService.getAllVolunteerReviews();
    return Result.success(volunteerReviews);
  }

  @PostMapping("/")
  public Result<Void> createVolunteerReview(@RequestBody VolunteerReview volunteerReview) {
    volunteerReviewService.saveVolunteerReview(volunteerReview);
    return Result.success();
  }

  @PutMapping("/{id}")
  public Result<Void> updateVolunteerReview(@PathVariable Integer id, @RequestBody VolunteerReview volunteerReview) {
    volunteerReview.setId(id);
    volunteerReviewService.updateVolunteerReview(volunteerReview);
    return Result.success();
  }

  @DeleteMapping("/{id}")
  public Result<Void> deleteVolunteerReview(@PathVariable Integer id) {
    volunteerReviewService.deleteVolunteerReview(id);
    return Result.success();
  }
}
