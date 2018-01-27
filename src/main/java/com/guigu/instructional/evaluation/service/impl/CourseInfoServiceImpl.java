package com.guigu.instructional.evaluation.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.evaluation.mapper.CourseInfoMapper;
import com.guigu.instructional.evaluation.service.CourseInfoService;
import com.guigu.instructional.po.CourseInfo;
import com.guigu.instructional.po.CourseInfoExample;
import com.guigu.instructional.po.CourseInfoExample.Criteria;

@Service("courseInfoServiceImpl")
public class CourseInfoServiceImpl implements CourseInfoService{

	@Resource(name="courseInfoMapper")
	private CourseInfoMapper courseInfoMapper;
	
	@Override
	public boolean addCourse(CourseInfo courseInfo) {
		
		try {
			int i = courseInfoMapper.insertSelective(courseInfo);
			if(i>0) {
				return true;
			}
		} catch (Exception e) {
		}
		return false;
	}

	@Override
	public boolean updateCourse(CourseInfo courseInfo) {
		
		try {
			int i = courseInfoMapper.insertSelective(courseInfo);
			if(i>0) {
				return true;
			}
		} catch (Exception e) {
		}
		
		return false;
	}

	@Override
	public List<CourseInfo> getCourseList(CourseInfo courseInfo) {
		
		CourseInfoExample courseInfoExample = new CourseInfoExample();
		
		Criteria criteria = courseInfoExample.createCriteria();
		
		if(courseInfo!=null) {
			
//			if(course.getCourseId()!=null) {
//				criteria.andCourseIdEqualTo(course.getCourseId());
//			}
			
			if(courseInfo.getCourseName()!=null) {
				
				courseInfo.setCourseName("%"+courseInfo.getCourseName()+"%");
				criteria.andCourseNameLike(courseInfo.getCourseName());
			}
			
		}
		criteria.andCourseStateEqualTo("1");
		
		return courseInfoMapper.selectByExample(courseInfoExample);
	}

	@Override
	public CourseInfo getCourse(Integer courseId) {
		return courseInfoMapper.selectByPrimaryKey(courseId);
	}

}
