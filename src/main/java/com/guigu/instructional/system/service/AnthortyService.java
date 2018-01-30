package com.guigu.instructional.system.service;

import java.util.List;

import com.guigu.instructional.po.AnthortyInfo;

public interface AnthortyService {
	
	public boolean addAnthorty(AnthortyInfo anthortyInfo);
	
	public boolean updateAnthorty(AnthortyInfo anthortyInfo);
	
	public List<AnthortyInfo> getAnthortyInfo(AnthortyInfo anthortyInfo);
	
	public AnthortyInfo getAnthortyInfo(Integer anthortyId);
	
}
