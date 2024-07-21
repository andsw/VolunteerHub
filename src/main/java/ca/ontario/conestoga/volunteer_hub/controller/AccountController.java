package ca.ontario.conestoga.volunteer_hub.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    // Assuming you have a service class to handle account operations
//    private final AccountService accountService;
//
//    @Autowired
//    public AccountController(AccountService accountService) {
//        this.accountService = accountService;
//    }
//
//    @PostMapping("/login")
//    public Result<String> login(HttpServletRequest request, HttpServletResponse response, @RequestBody Account loginRequest) {
//        Account account = accountService.getAccountByUsername(loginRequest.getUsername());
//        if (account != null && account.getPassword().equals(loginRequest.getPassword())) {
//            // Create session and store account information
//            HttpSession session = request.getSession(true);
//            session.setAttribute("username", loginRequest.getUsername());
//            session.setAttribute("account", account);
//
//            // Set login flag in cookie
//            Cookie loginCookie = new Cookie("loginFlag", "true");
//            loginCookie.setPath("/");
//            response.addCookie(loginCookie);
//
//            return Result.success("Login successful");
//        } else {
//            return Result.error("Invalid username or password");
//        }
//    }
//
//    @GetMapping("/secure/resource")
//    public Result<String> getSecureResource(HttpServletRequest request) {
//        HttpSession session = request.getSession(false);
//        if (session != null && session.getAttribute("username") != null) {
//            // User is authenticated
//            return Result.success("Access granted to secure resource");
//        } else {
//            // Redirect to login page or handle unauthorized access
//            return Result.error("Unauthorized access");
//        }
//    }
//
//    // Example logout endpoint
//    @PostMapping("/logout")
//    public Result<String> logout(HttpServletRequest request, HttpServletResponse response) {
//        HttpSession session = request.getSession(false);
//        if (session != null) {
//            session.invalidate(); // Invalidate session
//
//            // Remove login flag cookie
//            Cookie[] cookies = request.getCookies();
//            if (cookies != null) {
//                for (Cookie cookie : cookies) {
//                    if (cookie.getName().equals("loginFlag")) {
//                        cookie.setMaxAge(0);
//                        cookie.setPath("/");
//                        response.addCookie(cookie);
//                        break;
//                    }
//                }
//            }
//        }
//        return Result.success("Logged out successfully");
//    }
//
//    @PostMapping("/register")
//    public Result<String> registerUser(@RequestBody NewAccount account) {
//        // Validate password and other form data if necessary
////        if (!account.getPassword().equals(account.getConfirmPassword())) {
////            return Result.error("Passwords do not match");
////        }
////
////        // Save user to database or perform registration logic
////        try {
////            accountService.saveAccount(new Account(account.getId(), account.getUsername(), account.getPassword(), new Date(), account.getUserType()));
////            return Result.success("Registration successful");
////        } catch (Exception e) {
////            return Result.error("Registration failed: " + e.getMessage());
////        }
//        return Result.error("Registration failed: ");
//    }
}