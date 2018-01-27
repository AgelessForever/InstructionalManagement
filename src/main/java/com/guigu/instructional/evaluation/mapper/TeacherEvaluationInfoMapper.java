package com.guigu.instructional.evaluation.mapper;

import com.guigu.instructional.po.TeacherEvaluationInfo;
import com.guigu.instructional.po.TeacherEvaluationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherEvaluationInfoMapper {
    int countByExample(TeacherEvaluationInfoExample example);

    int deleteByExample(TeacherEvaluationInfoExample example);

    int deleteByPrimaryKey(Integer teacherEvaluationId);

    int insert(TeacherEvaluationInfo record);

    int insertSelective(TeacherEvaluationInfo record);

    List<TeacherEvaluationInfo> selectByExample(TeacherEvaluationInfoExample example);

    TeacherEvaluationInfo selectByPrimaryKey(Integer teacherEvaluationId);

    int updateByExampleSelective(@Param("record") TeacherEvaluationInfo record, @Param("example") TeacherEvaluationInfoExample example);

    int updateByExample(@Param("record") TeacherEvaluationInfo record, @Param("example") TeacherEvaluationInfoExample example);

    int updateByPrimaryKeySelective(TeacherEvaluationInfo record);

    int updateByPrimaryKey(TeacherEvaluationInfo record);
}