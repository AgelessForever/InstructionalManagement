package com.guigu.instructional.evaluation.service;

import java.util.List;

import com.guigu.instructional.po.CourseInfo;

public interface CourseInfoService {

	/**
	 * addCourse:��ӿγ���Ϣ
	 * @param Course
	 * @return
	 */
	public boolean addCourse(CourseInfo courseInfo);
	
	/**
	 * updateCourse:���¿γ���Ϣ
	 * @param Course
	 * @return
	 */
	public boolean updateCourse(CourseInfo courseInfo);
	
	/**
	 * getCourseList:����������ѯ�γ���Ϣ
	 * @param Course
	 * @return
	 */
	public List<CourseInfo> getCourseInfoList(CourseInfo courseInfo);
	
	/**
	 * getCourse:���ݿγ̱�Ų�ѯ�γ���Ϣ
	 * @param Course
	 * @return
	 */
	public CourseInfo getCourseInfo(Integer courseId);
	
}
