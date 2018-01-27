package com.guigu.instructional.po;

public class StudentEvaluationInfo {
    private Integer studentEvaluationId;

    private Integer staffId;

    private String staffName;

    private Integer studentId;

    private String studentName;

    private Integer courseId;

    private String courseName;

    private String studentEvaluationClassContent;

    private String studentEvaluationClassActivity;

    private String studentEvaluationAnswerPatiently;

    private String studentEvaluationExtraEvaluate;

    private String studentEvaluationState;

    public Integer getStudentEvaluationId() {
        return studentEvaluationId;
    }

    public void setStudentEvaluationId(Integer studentEvaluationId) {
        this.studentEvaluationId = studentEvaluationId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

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

    public String getStudentEvaluationClassContent() {
        return studentEvaluationClassContent;
    }

    public void setStudentEvaluationClassContent(String studentEvaluationClassContent) {
        this.studentEvaluationClassContent = studentEvaluationClassContent == null ? null : studentEvaluationClassContent.trim();
    }

    public String getStudentEvaluationClassActivity() {
        return studentEvaluationClassActivity;
    }

    public void setStudentEvaluationClassActivity(String studentEvaluationClassActivity) {
        this.studentEvaluationClassActivity = studentEvaluationClassActivity == null ? null : studentEvaluationClassActivity.trim();
    }

    public String getStudentEvaluationAnswerPatiently() {
        return studentEvaluationAnswerPatiently;
    }

    public void setStudentEvaluationAnswerPatiently(String studentEvaluationAnswerPatiently) {
        this.studentEvaluationAnswerPatiently = studentEvaluationAnswerPatiently == null ? null : studentEvaluationAnswerPatiently.trim();
    }

    public String getStudentEvaluationExtraEvaluate() {
        return studentEvaluationExtraEvaluate;
    }

    public void setStudentEvaluationExtraEvaluate(String studentEvaluationExtraEvaluate) {
        this.studentEvaluationExtraEvaluate = studentEvaluationExtraEvaluate == null ? null : studentEvaluationExtraEvaluate.trim();
    }

    public String getStudentEvaluationState() {
        return studentEvaluationState;
    }

    public void setStudentEvaluationState(String studentEvaluationState) {
        this.studentEvaluationState = studentEvaluationState == null ? null : studentEvaluationState.trim();
    }
}