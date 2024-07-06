package ca.ontario.conestoga.volunteer_hub.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {
  @GetMapping("/login")
  public String login(HttpServletRequest request) {
    HttpSession session = request.getSession(false);
    if (session != null && session.getAttribute("username") != null) {
      // User is logged in, redirect to homepage
      return "redirect:/home";
    } else {
      return "login";
    }
  }

  @GetMapping("/register")
  public String register(HttpServletRequest request) {
    HttpSession session = request.getSession(false);
    if (session != null && session.getAttribute("username") != null) {
      // User is logged in, redirect to homepage
      return "redirect:/home";
    } else {
      return "register";
    }
  }

  @GetMapping("/home")
  public String home(HttpServletRequest request) {
    return "index";
  }

  @GetMapping("/about")
  public String about() {
    return "about";
  }

  @GetMapping("/activity_detail")
  public String activityDetail() {
    return "activity_detail";
  }

  @GetMapping("/activity_list")
  public String activityList() {
    return "activity_list";
  }

  @GetMapping("/contact")
  public String contact() {
    return "contact";
  }

  @GetMapping("/join_activity")
  public String joinActivity() {
    return "join_activity";
  }

  @GetMapping("/msg_confirmation")
  public String msgConfirmation() {
    return "msg_confirmation";
  }

  @GetMapping("/post_activity")
  public String postActivity() {
    return "post_activity";
  }

  @GetMapping("/review_activity")
  public String reviewActivity() {
    return "review_activity";
  }

  @GetMapping("/review_confirmation")
  public String reviewConfirmation() {
    return "review_confirmation";
  }

}
