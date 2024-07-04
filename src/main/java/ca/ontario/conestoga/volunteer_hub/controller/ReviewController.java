package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.entity.Review;
import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

  private final ReviewService reviewService;

  @Autowired
  public ReviewController(ReviewService reviewService) {
    this.reviewService = reviewService;
  }

  @GetMapping("/{id}")
  public Result<Review> getReview(@PathVariable Integer id) {
    Review review = reviewService.getReviewById(id);
    if (review == null) {
      return Result.error("Review not found for ID: " + id);
    }
    return Result.success(review);
  }

  @GetMapping("/")
  public Result<List<Review>> getAllReviews() {
    List<Review> reviews = reviewService.getAllReviews();
    return Result.success(reviews);
  }

  @PostMapping("/")
  public Result<Void> createReview(@RequestBody Review review) {
    reviewService.saveReview(review);
    return Result.success();
  }

  @PutMapping("/{id}")
  public Result<Void> updateReview(@PathVariable Integer id, @RequestBody Review review) {
    review.setId(id);
    reviewService.updateReview(review);
    return Result.success();
  }

  @DeleteMapping("/{id}")
  public Result<Void> deleteReview(@PathVariable Integer id) {
    reviewService.deleteReview(id);
    return Result.success();
  }
}
