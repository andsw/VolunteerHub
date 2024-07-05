package ca.ontario.conestoga.volunteer_hub.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NewAccount {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String confirmPassword;
    private String userType;
}
