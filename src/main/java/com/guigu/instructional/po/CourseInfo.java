package com.guigu.instructional.po;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


public class CourseInfo {
    
	private Integer courseId;
	
	@NotEmpty(message="{courseInfo.name.length.error}")
    private String courseName;

	@Min(value=0,message="{courseInfo.hour.amount.error}")
    private Integer courseHour;

    private String courseDesc;

    private Integer courseDifficulty;

    private String courseState;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(Integer courseHour) {
        this.courseHour = courseHour;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc == null ? null : courseDesc.trim();
    }

    public Integer getCourseDifficulty() {
        return courseDifficulty;
    }

    public void setCourseDifficulty(Integer courseDifficulty) {
        this.courseDifficulty = courseDifficulty;
    }

    public String getCourseState() {
        return courseState;
    }

    public void setCourseState(String courseState) {
        this.courseState = courseState == null ? null : courseState.trim();
    }
}