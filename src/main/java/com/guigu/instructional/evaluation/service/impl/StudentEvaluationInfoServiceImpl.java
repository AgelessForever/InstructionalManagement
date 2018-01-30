package com.guigu.instructional.evaluation.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.evaluation.mapper.StudentEvaluationInfoMapper;
import com.guigu.instructional.evaluation.service.StudentEvaluationInfoService;
import com.guigu.instructional.po.StudentEvaluationInfo;
import com.guigu.instructional.po.StudentEvaluationInfoExample;
import com.guigu.instructional.po.StudentEvaluationInfoExample.Criteria;



@Service(value="studentEvaluationServiceImpl")
public class StudentEvaluationInfoServiceImpl implements StudentEvaluationInfoService{

	@Resource(name="studentEvaluationInfoMapper")
	private StudentEvaluationInfoMapper studentEvaluationInfoMapper;
	
	//����
	@Override
	public boolean addStudentEvaluationInfo(StudentEvaluationInfo studentEvaluationInfo) {
		 if (studentEvaluationInfo != null) {
	            // 1 ����Ч 0����Ч
			 studentEvaluationInfo.setStudentEvaluationState("1");
	        }
	        int i = studentEvaluationInfoMapper.insertSelective(studentEvaluationInfo);
	        if (i > 0) {
	            return true;
	        }
	        return false;
	}
	
	//����
	@Override
	public boolean updateStudentEvaluation(StudentEvaluationInfo studentEvaluationInfo) {
        int i=studentEvaluationInfoMapper.updateByPrimaryKeySelective(studentEvaluationInfo);
        if(i>0) {
            return true;
        }
        return false;
	}
	
	//��ѯ����
	@Override
	public List<StudentEvaluationInfo> getStudentEvaluationList(StudentEvaluationInfo studentEvaluationInfo) {
		 
		 StudentEvaluationInfoExample studentEvaluationInfoExample = new StudentEvaluationInfoExample();		 
	     Criteria criteria =studentEvaluationInfoExample.createCriteria();
	     
	        if(studentEvaluationInfo!=null) {  
  
	        	//����id��ѯ
	            if(studentEvaluationInfo.getStaffId()!=null) {
	                criteria.andStaffIdEqualTo(studentEvaluationInfo.getStaffId());
	            }
  	
	        	//����name��ѯ
	            if(studentEvaluationInfo.getStaffName()!=null) {
	            	studentEvaluationInfo.setStaffName("%"+studentEvaluationInfo.getStaffName()+"%");
	                criteria.andStaffNameLike(studentEvaluationInfo.getStaffName());
	            }
	            
	            //����name��ѯ
	            if(studentEvaluationInfo.getStudentName()!=null) {
	            	studentEvaluationInfo.setStudentName("%"+studentEvaluationInfo.getStudentName()+"%");
	                criteria.andStudentNameLike(studentEvaluationInfo.getStaffName());
	            }
	        	
	        }	
	       
	        criteria.andStudentEvaluationStateEqualTo("1");
	        return studentEvaluationInfoMapper.selectByExample(studentEvaluationInfoExample);

	        }

	@Override
	public StudentEvaluationInfo getStudentEvaluation(Integer studentEvaluationInfoId) {
		return studentEvaluationInfoMapper.selectByPrimaryKey(studentEvaluationInfoId);
	}


}
