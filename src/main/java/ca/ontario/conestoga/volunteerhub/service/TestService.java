package ca.ontario.conestoga.volunteerhub.service;

import ca.ontario.conestoga.volunteerhub.entity.Test;
import ca.ontario.conestoga.volunteerhub.entity.TestExample;
import ca.ontario.conestoga.volunteerhub.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {

  List<Test> getAllTests();
}
