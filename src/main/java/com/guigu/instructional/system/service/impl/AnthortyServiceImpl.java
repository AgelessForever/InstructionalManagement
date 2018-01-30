package com.guigu.instructional.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.AnthortyInfo;
import com.guigu.instructional.po.AnthortyInfoExample;
import com.guigu.instructional.po.AnthortyInfoExample.Criteria;
import com.guigu.instructional.system.mapper.AnthortyInfoMapper;
import com.guigu.instructional.system.service.AnthortyService;

@Service(value = "anthortyServiceImpl")
public class AnthortyServiceImpl implements AnthortyService{

	@Resource(name="anthortyInfoMapper")
	private AnthortyInfoMapper anthortyInfoMapper;
	
	@Override
	public boolean addAnthorty(AnthortyInfo anthortyInfo) {
		
		int i = anthortyInfoMapper.insertSelective(anthortyInfo);
		if(i>0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean updateAnthorty(AnthortyInfo anthortyInfo) {
		int i = anthortyInfoMapper.updateByPrimaryKeySelective(anthortyInfo);
		if(i>0) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<AnthortyInfo> getAnthortyInfo(AnthortyInfo anthortyInfo) {
		
		AnthortyInfoExample anthortyInfoExample = new AnthortyInfoExample();
		Criteria criteria = anthortyInfoExample.createCriteria();
		
		if(anthortyInfo!=null) {
			
			if(anthortyInfo.getAnthortyId()!=null) {
				criteria.andAnthortyIdEqualTo(anthortyInfo.getAnthortyId());
			}
			
		}
		
		return anthortyInfoMapper.selectByExample(anthortyInfoExample);
	}

	@Override
	public AnthortyInfo getAnthortyInfo(Integer anthortyId) {
		return anthortyInfoMapper.selectByPrimaryKey(anthortyId);
	}

}
