package com.guigu.instructional.system.service;

import java.util.List;

import com.guigu.instructional.po.RoleAnthortyInfo;

public interface RoleAnthortyService {

	public boolean addRoleAnthorty(RoleAnthortyInfo roleAnthortyInfo);
	
	public boolean updateRoleAnthorty(RoleAnthortyInfo roleAnthortyInfo);
	
	public List<RoleAnthortyInfo> getRoleAnthortyInfoList(RoleAnthortyInfo roleAnthortyInfo);
	
	public RoleAnthortyInfo getRoleAnthorty(Integer roleAnthortyId);
	
	public List<RoleAnthortyInfo> getRoleAnthortyByRoleId(Integer roleId);
	
}
