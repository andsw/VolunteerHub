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
    HttpSession session = request.getSession(false);
    if (session != null && session.getAttribute("username") != null) {
      return "index";
    } else {
      return "redirect:/login";
    }
  }
}
