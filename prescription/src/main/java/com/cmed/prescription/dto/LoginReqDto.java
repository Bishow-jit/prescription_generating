package com.cmed.prescription.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginReqDto{

    @NotBlank(message = "USERNAME CANNOT BE BLANK")
    private String username;

    @NotBlank(message = "PASSWORD CANNOT BE BLANK")
    private String password;
}
