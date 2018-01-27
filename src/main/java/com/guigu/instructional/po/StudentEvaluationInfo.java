package com.guigu.instructional.po;

public class StudentEvaluationInfo {
    private Integer studentEvaluationId;

    private Integer staffId;

    private Integer studentId;

    private Integer courseId;

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