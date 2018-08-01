package com.bmw.azure.oauth2.entity;

import lombok.Data;

@Data
public class AccessTokenWithBLOBs extends AccessToken {

    private byte[] token;

    private byte[] authentication;


}