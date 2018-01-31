package com.guigu.instructional.system.mapper;

import java.util.List;

import com.guigu.instructional.po.AnthortyInfo;
import com.guigu.instructional.po.AnthortyInfoExample;

public interface RoleRAAnthortyVO {

	List<AnthortyInfo> selectByExample(AnthortyInfoExample example);

    AnthortyInfo selectByPrimaryKey(Integer anthortyId);
	
}
