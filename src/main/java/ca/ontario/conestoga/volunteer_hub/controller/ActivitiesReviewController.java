package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.entity.ActivitiesReview;
import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.service.ActivitiesReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activitiesReview")
public class ActivitiesReviewController {

    private final ActivitiesReviewService activitiesReviewService;

    @Autowired
    public ActivitiesReviewController(ActivitiesReviewService activitiesReviewService) {
        this.activitiesReviewService = activitiesReviewService;
    }

    @GetMapping("/{id}")
    public Result<ActivitiesReview> getActivitiesReview(@PathVariable Integer id) {
        ActivitiesReview activitiesReview = activitiesReviewService.getActivitiesReviewById(id);
        if (activitiesReview == null) {
            return Result.error("Activities review not found for ID: " + id);
        }
        return Result.success(activitiesReview);
    }

    @GetMapping("/")
    public Result<List<ActivitiesReview>> getAllActivitiesReviews() {
        List<ActivitiesReview> activitiesReviews = activitiesReviewService.getAllActivitiesReviews();
        return Result.success(activitiesReviews);
    }

    @PostMapping("/")
    public Result<Void> createActivitiesReview(@RequestBody ActivitiesReview activitiesReview) {
        activitiesReviewService.saveActivitiesReview(activitiesReview);
        return Result.success();
    }

    @PutMapping("/{id}")
    public Result<Void> updateActivitiesReview(@PathVariable Integer id, @RequestBody ActivitiesReview activitiesReview) {
        activitiesReview.setId(id);
        activitiesReviewService.updateActivitiesReview(activitiesReview);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result<Void> deleteActivitiesReview(@PathVariable Integer id) {
        activitiesReviewService.deleteActivitiesReview(id);
        return Result.success();
    }
}
