package com.manage.system.authority.mapper;


import com.manage.system.authority.entity.User;
import com.manage.system.authority.entity.UserWithRole;
import com.manage.system.common.base.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserMapper extends BaseMapper<User> {

	List<User> findUserWithDept(User user);
	
	List<UserWithRole> findUserWithRole(Long userId);
	
	User findUserProfile(User user);
}