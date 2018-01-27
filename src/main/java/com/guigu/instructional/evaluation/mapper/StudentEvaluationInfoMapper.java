package com.guigu.instructional.evaluation.mapper;

import com.guigu.instructional.po.StudentEvaluationInfo;
import com.guigu.instructional.po.StudentEvaluationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentEvaluationInfoMapper {
    int countByExample(StudentEvaluationInfoExample example);

    int deleteByExample(StudentEvaluationInfoExample example);

    int deleteByPrimaryKey(Integer studentEvaluationId);

    int insert(StudentEvaluationInfo record);

    int insertSelective(StudentEvaluationInfo record);

    List<StudentEvaluationInfo> selectByExample(StudentEvaluationInfoExample example);

    StudentEvaluationInfo selectByPrimaryKey(Integer studentEvaluationId);

    int updateByExampleSelective(@Param("record") StudentEvaluationInfo record, @Param("example") StudentEvaluationInfoExample example);

    int updateByExample(@Param("record") StudentEvaluationInfo record, @Param("example") StudentEvaluationInfoExample example);

    int updateByPrimaryKeySelective(StudentEvaluationInfo record);

    int updateByPrimaryKey(StudentEvaluationInfo record);
}