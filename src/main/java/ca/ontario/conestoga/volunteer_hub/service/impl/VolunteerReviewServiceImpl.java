package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.VolunteerReview;
import ca.ontario.conestoga.volunteer_hub.entity.VolunteerReviewExample;
import ca.ontario.conestoga.volunteer_hub.mapper.VolunteerReviewMapper;
import ca.ontario.conestoga.volunteer_hub.service.VolunteerReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerReviewServiceImpl implements VolunteerReviewService {

  private final VolunteerReviewMapper volunteerReviewMapper;

  @Autowired
  public VolunteerReviewServiceImpl(VolunteerReviewMapper volunteerReviewMapper) {
    this.volunteerReviewMapper = volunteerReviewMapper;
  }

  @Override
  public VolunteerReview getVolunteerReviewById(Integer id) {
    return volunteerReviewMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<VolunteerReview> getAllVolunteerReviews() {
    VolunteerReviewExample example = new VolunteerReviewExample();
    return volunteerReviewMapper.selectByExample(example);
  }

  @Override
  public void saveVolunteerReview(VolunteerReview volunteerReview) {
    volunteerReviewMapper.insertSelective(volunteerReview);
  }

  @Override
  public void updateVolunteerReview(VolunteerReview volunteerReview) {
    volunteerReviewMapper.updateByPrimaryKeySelective(volunteerReview);
  }

  @Override
  public void deleteVolunteerReview(Integer id) {
    volunteerReviewMapper.deleteByPrimaryKey(id);
  }
}
