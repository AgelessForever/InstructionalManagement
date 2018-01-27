package com.guigu.instructional.evaluation.service;

import java.util.List;

import com.guigu.instructional.po.TeacherEvaluationInfo;

public interface TeacherEvaluationInfoService {
	
	//添加教师评价
	public boolean addTeacherEvaluation(TeacherEvaluationInfo teacherEvaluationInfo);
	
	//更新教师评价
	public boolean updateTeacherEvaluation(TeacherEvaluationInfo teacherEvaluationInfo);
	
	//根据条件查询教师评价
	public List<TeacherEvaluationInfo> getTeacherEvaluationInfoList(TeacherEvaluationInfo teacherEvaluationInfo);
	
	//根据编号查询教师评价
	public TeacherEvaluationInfo getTeacherEvaluationInfo(Integer teacherEvaluationId);
	
}
