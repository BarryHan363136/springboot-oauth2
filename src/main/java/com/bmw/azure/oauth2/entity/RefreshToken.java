package com.bmw.azure.oauth2.entity;

import lombok.Data;

@Data
public class RefreshToken {

    private String tokenId;

    private byte[] token;

    private byte[] authentication;


}