package com.manage.system.authority.service;


import com.manage.system.authority.entity.RoleMenu;
import com.manage.system.common.service.IService;

public interface RoleMenuServie extends IService<RoleMenu> {

	void deleteRoleMenusByRoleId(String roleIds);

	void deleteRoleMenusByMenuId(String menuIds);
}
