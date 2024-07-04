package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.Review;

import java.util.List;

public interface ReviewService {
  Review getReviewById(Integer id);
  List<Review> getAllReviews();
  void saveReview(Review review);
  void updateReview(Review review);
  void deleteReview(Integer id);
}
