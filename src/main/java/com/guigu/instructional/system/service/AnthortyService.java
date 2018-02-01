package com.guigu.instructional.system.service;

import java.util.List;

import com.guigu.instructional.po.AnthortyInfo;
import com.guigu.instructional.po.RoleAnthortyInfo;

public interface AnthortyService {
	
	public boolean addAnthorty(AnthortyInfo anthortyInfo);
	
	public boolean updateAnthorty(AnthortyInfo anthortyInfo);
	
	public List<AnthortyInfo> getAnthortyInfoList(AnthortyInfo anthortyInfo);
	
	public AnthortyInfo getAnthortyInfo(Integer anthortyId);
	
	public List<AnthortyInfo> getAnthortyByAnthortyId(Integer anthortyId);
	
}
