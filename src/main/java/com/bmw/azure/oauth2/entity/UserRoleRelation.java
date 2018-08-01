package com.bmw.azure.oauth2.entity;

import lombok.Data;

@Data
public class UserRoleRelation {

    private String relationId;

    private String userId;

    private String roleId;


}