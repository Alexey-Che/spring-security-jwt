package com.example.springsecurityjwt.entity.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class RegistrationRequestDto {

    @NotEmpty
    private String login;

    @NotEmpty
    private String password;
}
