package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.VolunteerReview;

import java.util.List;

public interface VolunteerReviewService {
  VolunteerReview getVolunteerReviewById(Integer id);
  List<VolunteerReview> getAllVolunteerReviews();
  void saveVolunteerReview(VolunteerReview volunteerReview);
  void updateVolunteerReview(VolunteerReview volunteerReview);
  void deleteVolunteerReview(Integer id);
}
