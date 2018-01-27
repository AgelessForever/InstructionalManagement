package com.guigu.instructional.evaluation.service;

import java.util.List;

import com.guigu.instructional.po.TeacherEvaluationInfo;

public interface TeacherEvaluationInfoService {
	
	//��ӽ�ʦ����
	public boolean addTeacherEvaluation(TeacherEvaluationInfo teacherEvaluationInfo);
	
	//���½�ʦ����
	public boolean updateTeacherEvaluation(TeacherEvaluationInfo teacherEvaluationInfo);
	
	//����������ѯ��ʦ����
	public List<TeacherEvaluationInfo> getTeacherEvaluationInfoList(TeacherEvaluationInfo teacherEvaluationInfo);
	
	//���ݱ�Ų�ѯ��ʦ����
	public TeacherEvaluationInfo getTeacherEvaluationInfo(Integer teacherEvaluationId);
	
}
