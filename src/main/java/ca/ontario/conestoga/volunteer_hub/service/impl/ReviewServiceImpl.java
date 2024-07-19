package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.Review;
import ca.ontario.conestoga.volunteer_hub.entity.ReviewExample;
import ca.ontario.conestoga.volunteer_hub.mapper.ReviewMapper;
import ca.ontario.conestoga.volunteer_hub.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

  private final ReviewMapper reviewMapper;

  @Autowired
  public ReviewServiceImpl(ReviewMapper reviewMapper) {
    this.reviewMapper = reviewMapper;
  }

  @Override
  public Review getReviewById(Integer id) {
    return reviewMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<Review> getAllReviews() {
    ReviewExample example = new ReviewExample();
    return reviewMapper.selectByExample(example);
  }

  @Override
  public void saveReview(Review review) {
    reviewMapper.insertSelective(review);
  }

  @Override
  public void updateReview(Review review) {
    reviewMapper.updateByPrimaryKeySelective(review);
  }

  @Override
  public void deleteReview(Integer id) {
    reviewMapper.deleteByPrimaryKey(id);
  }
}
