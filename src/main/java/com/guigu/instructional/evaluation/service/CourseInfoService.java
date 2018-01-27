package com.guigu.instructional.evaluation.service;

import java.util.List;

import com.guigu.instructional.po.CourseInfo;

public interface CourseInfoService {

	/**
	 * addCourse:添加课程信息
	 * @param Course
	 * @return
	 */
	public boolean addCourse(CourseInfo courseInfo);
	
	/**
	 * updateCourse:更新课程信息
	 * @param Course
	 * @return
	 */
	public boolean updateCourse(CourseInfo courseInfo);
	
	/**
	 * getCourseList:根据条件查询课程信息
	 * @param Course
	 * @return
	 */
	public List<CourseInfo> getCourseList(CourseInfo courseInfo);
	
	/**
	 * getCourse:根据课程编号查询课程信息
	 * @param Course
	 * @return
	 */
	public CourseInfo getCourse(Integer courseId);
	
}
