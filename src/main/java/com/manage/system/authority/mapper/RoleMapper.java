package com.manage.system.authority.mapper;

import com.manage.system.authority.entity.Role;
import com.manage.system.authority.entity.RoleWithMenu;
import com.manage.system.common.base.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoleMapper extends BaseMapper<Role> {
	
	List<Role> findUserRole(String userName);
	
	List<RoleWithMenu> findById(Long roleId);
}