package com.manage.system.authority.service;

import com.manage.system.authority.entity.UserRole;
import com.manage.system.common.service.IService;
import org.springframework.stereotype.Component;

@Component
public interface UserRoleService extends IService<UserRole> {

	void deleteUserRolesByRoleId(String roleIds);

	void deleteUserRolesByUserId(String userIds);
}
