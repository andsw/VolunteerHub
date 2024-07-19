package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.ActivitiesReview;
import ca.ontario.conestoga.volunteer_hub.entity.ActivitiesReviewExample;
import ca.ontario.conestoga.volunteer_hub.mapper.ActivitiesReviewMapper;
import ca.ontario.conestoga.volunteer_hub.service.ActivitiesReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivitiesReviewServiceImpl implements ActivitiesReviewService {

  private final ActivitiesReviewMapper activitiesReviewMapper;

  @Autowired
  public ActivitiesReviewServiceImpl(ActivitiesReviewMapper activitiesReviewMapper) {
    this.activitiesReviewMapper = activitiesReviewMapper;
  }

  @Override
  public ActivitiesReview getActivitiesReviewById(Integer id) {
    return activitiesReviewMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<ActivitiesReview> getAllActivitiesReviews() {
    ActivitiesReviewExample example = new ActivitiesReviewExample();
    return activitiesReviewMapper.selectByExample(example);
  }

  @Override
  public void saveActivitiesReview(ActivitiesReview activitiesReview) {
    activitiesReviewMapper.insertSelective(activitiesReview);
  }

  @Override
  public void updateActivitiesReview(ActivitiesReview activitiesReview) {
    activitiesReviewMapper.updateByPrimaryKeySelective(activitiesReview);
  }

  @Override
  public void deleteActivitiesReview(Integer id) {
    activitiesReviewMapper.deleteByPrimaryKey(id);
  }
}
