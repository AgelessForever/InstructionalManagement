package com.guigu.instructional.po;

public class TeacherEvaluationInfo {
    private Integer teacherEvaluationId;

    private Integer staffId;

    private Integer studentId;

    private Integer courseId;

    private String teacherEvaluationClassAttitude;

    private String teacherEvaluationWorkontime;

    private String teacherEvaluationBekins;

    private String teacherEvaluationExtraEvaluate;

    private String teacherEvaluationState;

    public Integer getTeacherEvaluationId() {
        return teacherEvaluationId;
    }

    public void setTeacherEvaluationId(Integer teacherEvaluationId) {
        this.teacherEvaluationId = teacherEvaluationId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getTeacherEvaluationClassAttitude() {
        return teacherEvaluationClassAttitude;
    }

    public void setTeacherEvaluationClassAttitude(String teacherEvaluationClassAttitude) {
        this.teacherEvaluationClassAttitude = teacherEvaluationClassAttitude == null ? null : teacherEvaluationClassAttitude.trim();
    }

    public String getTeacherEvaluationWorkontime() {
        return teacherEvaluationWorkontime;
    }

    public void setTeacherEvaluationWorkontime(String teacherEvaluationWorkontime) {
        this.teacherEvaluationWorkontime = teacherEvaluationWorkontime == null ? null : teacherEvaluationWorkontime.trim();
    }

    public String getTeacherEvaluationBekins() {
        return teacherEvaluationBekins;
    }

    public void setTeacherEvaluationBekins(String teacherEvaluationBekins) {
        this.teacherEvaluationBekins = teacherEvaluationBekins == null ? null : teacherEvaluationBekins.trim();
    }

    public String getTeacherEvaluationExtraEvaluate() {
        return teacherEvaluationExtraEvaluate;
    }

    public void setTeacherEvaluationExtraEvaluate(String teacherEvaluationExtraEvaluate) {
        this.teacherEvaluationExtraEvaluate = teacherEvaluationExtraEvaluate == null ? null : teacherEvaluationExtraEvaluate.trim();
    }

    public String getTeacherEvaluationState() {
        return teacherEvaluationState;
    }

    public void setTeacherEvaluationState(String teacherEvaluationState) {
        this.teacherEvaluationState = teacherEvaluationState == null ? null : teacherEvaluationState.trim();
    }
}