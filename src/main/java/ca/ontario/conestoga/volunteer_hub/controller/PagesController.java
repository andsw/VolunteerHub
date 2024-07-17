package ca.ontario.conestoga.volunteer_hub.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {
  @GetMapping("/login.html")
  public String login(HttpServletRequest request) {
    HttpSession session = request.getSession(false);
    if (session != null && session.getAttribute("username") != null) {
      // User is logged in, redirect to homepage
      return "redirect:/home";
    } else {
      return "login";
    }
  }

  @GetMapping("/register.html")
  public String register(HttpServletRequest request) {
    HttpSession session = request.getSession(false);
    if (session != null && session.getAttribute("username") != null) {
      // User is logged in, redirect to homepage
      return "redirect:/home";
    } else {
      return "register";
    }
  }

  @GetMapping("/home.html")
  public String home(HttpServletRequest request) {
    return "index";
  }

  @GetMapping("/about.html")
  public String about() {
    return "about";
  }

  @GetMapping("/activity_detail.html")
  public String activityDetail() {
    return "activity_detail";
  }

  @GetMapping("/activity_list.html")
  public String activityList() {
    return "activity_list";
  }

  @GetMapping("/contact.html")
  public String contact() {
    return "contact";
  }

  @GetMapping("/join_activity.html")
  public String joinActivity() {
    return "join_activity";
  }

  @GetMapping("/msg_confirmation.html")
  public String msgConfirmation() {
    return "msg_confirmation";
  }

  @GetMapping("/post_activity.html")
  public String postActivity() {
    return "post_activity";
  }

  @GetMapping("/review_activity.html")
  public String reviewActivity() {
    return "review_activity";
  }

  @GetMapping("/review_confirmation.html")
  public String reviewConfirmation() {
    return "review_confirmation";
  }

}
