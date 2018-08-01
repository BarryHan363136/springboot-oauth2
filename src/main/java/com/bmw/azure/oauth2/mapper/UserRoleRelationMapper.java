package com.bmw.azure.oauth2.mapper;

import com.bmw.azure.oauth2.common.base.BaseMapper;
import com.bmw.azure.oauth2.entity.UserRoleRelation;
import org.springframework.stereotype.Repository;

@Repository("userRoleRelationMapper")
public interface UserRoleRelationMapper extends BaseMapper<UserRoleRelation, String> {

}