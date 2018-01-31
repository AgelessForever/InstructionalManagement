package com.guigu.instructional.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.RoleAnthortyInfo;
import com.guigu.instructional.po.RoleAnthortyInfoExample;
import com.guigu.instructional.po.RoleAnthortyInfoExample.Criteria;
import com.guigu.instructional.system.mapper.RoleAnthortyInfoMapper;
import com.guigu.instructional.system.mapper.RoleInfoMapper;
import com.guigu.instructional.system.service.RoleAnthortyService;

@Service(value = "roleAnthortyServiceImpl")
public class RoleAnthortyServiceImpl implements RoleAnthortyService{

	@Resource(name="roleAnthortyInfoMapper")
	private RoleAnthortyInfoMapper roleAnthortyInfoMapper;
	
	@Override
	public boolean addRoleAnthorty(RoleAnthortyInfo roleAnthortyInfo) {
		
		int i = roleAnthortyInfoMapper.insertSelective(roleAnthortyInfo);
		if(i>0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean updateRoleAnthorty(RoleAnthortyInfo roleAnthortyInfo) {
		int i = roleAnthortyInfoMapper.updateByPrimaryKeySelective(roleAnthortyInfo);
		if(i>0) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<RoleAnthortyInfo> getRoleAnthortyInfoList(RoleAnthortyInfo roleAnthortyInfo) {
		
		RoleAnthortyInfoExample roleAnthortyInfoExample = new RoleAnthortyInfoExample();
		Criteria criteria = roleAnthortyInfoExample.createCriteria();
		
		if(roleAnthortyInfo!=null) {
			if(roleAnthortyInfo.getRoleId()!=null) {
				criteria.andAnthortyIdEqualTo(roleAnthortyInfo.getAnthortyId());
			}
		}
		
		return roleAnthortyInfoMapper.selectByExample(roleAnthortyInfoExample);
	}

	@Override
	public RoleAnthortyInfo getRoleAnthorty(Integer roleAnthortyId) {
		return roleAnthortyInfoMapper.selectByPrimaryKey(roleAnthortyId);
	}
	
}
