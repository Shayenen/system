package com.manage.system.authority.mapper;

import com.manage.system.authority.entity.Menu;
import com.manage.system.common.base.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface MenuMapper extends BaseMapper<Menu> {
	
	List<Menu> findUserPermissions(String userName);
	
	List<Menu> findUserMenus(String userName);
	
	// 删除父节点，子节点变成顶级节点（根据实际业务调整）
	void changeToTop(List<String> menuIds);
}