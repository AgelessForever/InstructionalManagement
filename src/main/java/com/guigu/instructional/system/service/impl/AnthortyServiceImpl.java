package com.guigu.instructional.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.AnthortyInfo;
import com.guigu.instructional.po.AnthortyInfoExample;
import com.guigu.instructional.po.RoleAnthortyInfoExample;
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
	public List<AnthortyInfo> getAnthortyInfoList(AnthortyInfo anthortyInfo) {
		
		AnthortyInfoExample anthortyInfoExample = new AnthortyInfoExample();
		Criteria criteria = anthortyInfoExample.createCriteria();
		
		if(anthortyInfo!=null) {
			
			if(anthortyInfo.getAnthortyId()!=null) {
				criteria.andAnthortyIdEqualTo(anthortyInfo.getAnthortyId());
			}
			
			if(anthortyInfo.getAnthortyNane()!=null) {
				anthortyInfo.setAnthortyNane("%"+anthortyInfo.getAnthortyNane()+"%");
				criteria.andAnthortyNaneLike(anthortyInfo.getAnthortyNane());
			}
			
		}
		
//		criteria.andAnthortyIdIsNotNull();
		
		return anthortyInfoMapper.selectByExample(anthortyInfoExample);
	}

	@Override
	public AnthortyInfo getAnthortyInfo(Integer anthortyId) {
		return anthortyInfoMapper.selectByPrimaryKey(anthortyId);
	}

	@Override
	public List<AnthortyInfo> getAnthortyByAnthortyId(Integer anthortyId) {
		AnthortyInfoExample anthortyInfoExample = new AnthortyInfoExample();
		Criteria criteria = anthortyInfoExample.createCriteria();
		
		
		criteria.andAnthortyIdEqualTo(anthortyId);
		
		return anthortyInfoMapper.selectByExample(anthortyInfoExample);
	}

}
