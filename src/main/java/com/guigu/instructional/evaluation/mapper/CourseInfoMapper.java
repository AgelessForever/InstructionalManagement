package com.guigu.instructional.evaluation.mapper;

import com.guigu.instructional.po.CourseInfo;
import com.guigu.instructional.po.CourseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseInfoMapper {
    int countByExample(CourseInfoExample example);

    int deleteByExample(CourseInfoExample example);

    int deleteByPrimaryKey(Integer courseId);

    int insert(CourseInfo record);

    int insertSelective(CourseInfo record);

    List<CourseInfo> selectByExample(CourseInfoExample example);

    CourseInfo selectByPrimaryKey(Integer courseId);

    int updateByExampleSelective(@Param("record") CourseInfo record, @Param("example") CourseInfoExample example);

    int updateByExample(@Param("record") CourseInfo record, @Param("example") CourseInfoExample example);

    int updateByPrimaryKeySelective(CourseInfo record);

    int updateByPrimaryKey(CourseInfo record);
}