package ca.ontario.conestoga.volunteerhub.controller;

import ca.ontario.conestoga.volunteerhub.entity.Test;
import ca.ontario.conestoga.volunteerhub.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
  @Autowired
  private TestService testService;

  @GetMapping("/test")
  public String welcomeBackToJavaWorld() {
    List<Test> allTests = testService.getAllTests();
    return "Hello, Welcome back to Java World! this is the testName: " + allTests.get(0).getName();
  }
}
