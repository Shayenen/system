package com.manage.system.authority.entity;

import lombok.Data;

import java.util.List;

@Data
public class RoleWithMenu extends Role{

	private static final long serialVersionUID = 2013847071068967187L;
	
	private Long menuId;
	
	private List<Long> menuIds;
}
