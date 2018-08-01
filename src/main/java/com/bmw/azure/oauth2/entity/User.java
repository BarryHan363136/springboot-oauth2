package com.bmw.azure.oauth2.entity;

import lombok.Data;

@Data
public class User {

    private String userId;

    private String userName;

    private String email;

    private String password;

    private Boolean activated;

    private String activationKey;

    private String resetPasswordKey;


}