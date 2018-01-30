package com.guigu.instructional.evaluation.service;

import java.util.List;

import com.guigu.instructional.po.StudentEvaluationInfo;




public interface StudentEvaluationInfoService {


    public boolean addStudentEvaluationInfo(StudentEvaluationInfo studentEvaluationInfo);
    
   
    public boolean updateStudentEvaluation(StudentEvaluationInfo studentEvaluationInfo);
    
  
    public List<StudentEvaluationInfo> getStudentEvaluationList(StudentEvaluationInfo studentEvaluationInfo);
   
    public StudentEvaluationInfo getStudentEvaluation(Integer studentEvaluationInfoId);
	
	
}
