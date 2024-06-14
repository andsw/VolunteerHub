package ca.ontario.conestoga.volunteerhub.service.impl;

import ca.ontario.conestoga.volunteerhub.entity.Test;
import ca.ontario.conestoga.volunteerhub.entity.TestExample;
import ca.ontario.conestoga.volunteerhub.mapper.TestMapper;
import ca.ontario.conestoga.volunteerhub.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
  @Autowired
  private TestMapper testMapper;

  @Override
  public List<Test> getAllTests() {
    return testMapper.selectByExample(new TestExample());
  }
}
