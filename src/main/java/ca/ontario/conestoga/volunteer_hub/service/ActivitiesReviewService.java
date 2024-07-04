package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.ActivitiesReview;

import java.util.List;

public interface ActivitiesReviewService {
  ActivitiesReview getActivitiesReviewById(Integer id);
  List<ActivitiesReview> getAllActivitiesReviews();
  void saveActivitiesReview(ActivitiesReview activitiesReview);
  void updateActivitiesReview(ActivitiesReview activitiesReview);
  void deleteActivitiesReview(Integer id);
}
