package com.bmw.azure.oauth2.mapper;

import com.bmw.azure.oauth2.common.base.BaseMapper;
import com.bmw.azure.oauth2.entity.Role;
import org.springframework.stereotype.Repository;

@Repository("roleMapper")
public interface RoleMapper extends BaseMapper<Role, String> {

}