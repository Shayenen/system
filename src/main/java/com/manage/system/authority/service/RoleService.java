package com.manage.system.authority.service;

import com.manage.system.authority.entity.Role;
import com.manage.system.authority.entity.RoleWithMenu;
import com.manage.system.common.service.IService;

import java.util.List;

public interface RoleService extends IService<Role> {

	List<Role> findUserRole(String userName);

	List<Role> findAllRole(Role role);
	
	RoleWithMenu findRoleWithMenus(Long roleId);

	Role findByName(String roleName);

	void addRole(Role role, Long[] menuIds);
	
	void updateRole(Role role, Long[] menuIds);

	void deleteRoles(String roleIds);
}
