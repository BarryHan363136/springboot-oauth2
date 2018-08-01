package com.bmw.azure.oauth2.entity;

import lombok.Data;

@Data
public class AccessToken {
    private String tokenId;

    private String authenticationId;

    private String userId;

    private String clientId;

    private String refreshToken;


}