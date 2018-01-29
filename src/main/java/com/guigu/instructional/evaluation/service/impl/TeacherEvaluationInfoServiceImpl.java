package com.guigu.instructional.evaluation.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.evaluation.mapper.TeacherEvaluationInfoMapper;
import com.guigu.instructional.evaluation.service.TeacherEvaluationInfoService;
import com.guigu.instructional.po.TeacherEvaluationInfo;
import com.guigu.instructional.po.TeacherEvaluationInfoExample;
import com.guigu.instructional.po.TeacherEvaluationInfoExample.Criteria;

@Service("teacherEvaluationInfoServiceImpl")
public class TeacherEvaluationInfoServiceImpl implements TeacherEvaluationInfoService {

	
	@Resource(name = "teacherEvaluationInfoMapper")
	private TeacherEvaluationInfoMapper teacherEvaluationInfoMapper;
	
	
	@Override
	public boolean addTeacherEvaluation(TeacherEvaluationInfo teacherEvaluationInfo) {
		
		if(teacherEvaluationInfo!=null) {
			teacherEvaluationInfo.setTeacherEvaluationState("1");
		}
		int i = teacherEvaluationInfoMapper.insertSelective(teacherEvaluationInfo);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateTeacherEvaluation(TeacherEvaluationInfo teacherEvaluationInfo) {
		
		int i = teacherEvaluationInfoMapper.updateByPrimaryKeySelective(teacherEvaluationInfo);
		if(i>0) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<TeacherEvaluationInfo> getTeacherEvaluationInfoList(TeacherEvaluationInfo teacherEvaluationInfo) {
		TeacherEvaluationInfoExample teacherEvaluationInfoExample = new TeacherEvaluationInfoExample();
		Criteria criteria = teacherEvaluationInfoExample.createCriteria();
		
		if(teacherEvaluationInfo!=null) {
			//�������۱�id��ѯ
			if(teacherEvaluationInfo.getTeacherEvaluationId()!=null) {
				criteria.andTeacherEvaluationIdEqualTo(teacherEvaluationInfo.getTeacherEvaluationId());
			}
			//����Ա�����Ʋ�ѯ
			if(teacherEvaluationInfo.getStaffName()!=null) {
				teacherEvaluationInfo.setStaffName("%"+teacherEvaluationInfo.getStaffName()+"%");
				criteria.andStaffNameLike(teacherEvaluationInfo.getStaffName());
			}
			//����ѧԱ���Ʋ�ѯ
			if(teacherEvaluationInfo.getStudentName()!=null) {
				teacherEvaluationInfo.setStudentName("%"+teacherEvaluationInfo.getStudentName()+"%");
				criteria.andStudentNameLike(teacherEvaluationInfo.getStudentName());
			}
			//���ݿγ����Ʋ�ѯ
			if(teacherEvaluationInfo.getCourseName()!=null) {
				teacherEvaluationInfo.setCourseName("%"+teacherEvaluationInfo.getCourseName()+"%");
				criteria.andCourseNameLike(teacherEvaluationInfo.getCourseName());
			}
		}
		
		criteria.andTeacherEvaluationStateEqualTo("1");
		
		return teacherEvaluationInfoMapper.selectByExample(teacherEvaluationInfoExample);
	}

	@Override
	public TeacherEvaluationInfo getTeacherEvaluationInfo(Integer teacherEvaluationId) {
		return teacherEvaluationInfoMapper.selectByPrimaryKey(teacherEvaluationId);
	}

}