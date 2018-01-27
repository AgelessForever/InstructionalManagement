package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.List;

public class TeacherEvaluationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherEvaluationInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTeacherEvaluationIdIsNull() {
            addCriterion("teacher_evaluation_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationIdIsNotNull() {
            addCriterion("teacher_evaluation_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationIdEqualTo(Integer value) {
            addCriterion("teacher_evaluation_id =", value, "teacherEvaluationId");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationIdNotEqualTo(Integer value) {
            addCriterion("teacher_evaluation_id <>", value, "teacherEvaluationId");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationIdGreaterThan(Integer value) {
            addCriterion("teacher_evaluation_id >", value, "teacherEvaluationId");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_evaluation_id >=", value, "teacherEvaluationId");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationIdLessThan(Integer value) {
            addCriterion("teacher_evaluation_id <", value, "teacherEvaluationId");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_evaluation_id <=", value, "teacherEvaluationId");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationIdIn(List<Integer> values) {
            addCriterion("teacher_evaluation_id in", values, "teacherEvaluationId");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationIdNotIn(List<Integer> values) {
            addCriterion("teacher_evaluation_id not in", values, "teacherEvaluationId");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_evaluation_id between", value1, value2, "teacherEvaluationId");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_evaluation_id not between", value1, value2, "teacherEvaluationId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeIsNull() {
            addCriterion("teacher_evaluation_class_attitude is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeIsNotNull() {
            addCriterion("teacher_evaluation_class_attitude is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeEqualTo(String value) {
            addCriterion("teacher_evaluation_class_attitude =", value, "teacherEvaluationClassAttitude");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeNotEqualTo(String value) {
            addCriterion("teacher_evaluation_class_attitude <>", value, "teacherEvaluationClassAttitude");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeGreaterThan(String value) {
            addCriterion("teacher_evaluation_class_attitude >", value, "teacherEvaluationClassAttitude");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_evaluation_class_attitude >=", value, "teacherEvaluationClassAttitude");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeLessThan(String value) {
            addCriterion("teacher_evaluation_class_attitude <", value, "teacherEvaluationClassAttitude");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeLessThanOrEqualTo(String value) {
            addCriterion("teacher_evaluation_class_attitude <=", value, "teacherEvaluationClassAttitude");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeLike(String value) {
            addCriterion("teacher_evaluation_class_attitude like", value, "teacherEvaluationClassAttitude");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeNotLike(String value) {
            addCriterion("teacher_evaluation_class_attitude not like", value, "teacherEvaluationClassAttitude");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeIn(List<String> values) {
            addCriterion("teacher_evaluation_class_attitude in", values, "teacherEvaluationClassAttitude");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeNotIn(List<String> values) {
            addCriterion("teacher_evaluation_class_attitude not in", values, "teacherEvaluationClassAttitude");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeBetween(String value1, String value2) {
            addCriterion("teacher_evaluation_class_attitude between", value1, value2, "teacherEvaluationClassAttitude");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationClassAttitudeNotBetween(String value1, String value2) {
            addCriterion("teacher_evaluation_class_attitude not between", value1, value2, "teacherEvaluationClassAttitude");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeIsNull() {
            addCriterion("teacher_evaluation_workontime is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeIsNotNull() {
            addCriterion("teacher_evaluation_workontime is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeEqualTo(String value) {
            addCriterion("teacher_evaluation_workontime =", value, "teacherEvaluationWorkontime");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeNotEqualTo(String value) {
            addCriterion("teacher_evaluation_workontime <>", value, "teacherEvaluationWorkontime");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeGreaterThan(String value) {
            addCriterion("teacher_evaluation_workontime >", value, "teacherEvaluationWorkontime");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_evaluation_workontime >=", value, "teacherEvaluationWorkontime");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeLessThan(String value) {
            addCriterion("teacher_evaluation_workontime <", value, "teacherEvaluationWorkontime");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeLessThanOrEqualTo(String value) {
            addCriterion("teacher_evaluation_workontime <=", value, "teacherEvaluationWorkontime");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeLike(String value) {
            addCriterion("teacher_evaluation_workontime like", value, "teacherEvaluationWorkontime");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeNotLike(String value) {
            addCriterion("teacher_evaluation_workontime not like", value, "teacherEvaluationWorkontime");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeIn(List<String> values) {
            addCriterion("teacher_evaluation_workontime in", values, "teacherEvaluationWorkontime");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeNotIn(List<String> values) {
            addCriterion("teacher_evaluation_workontime not in", values, "teacherEvaluationWorkontime");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeBetween(String value1, String value2) {
            addCriterion("teacher_evaluation_workontime between", value1, value2, "teacherEvaluationWorkontime");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationWorkontimeNotBetween(String value1, String value2) {
            addCriterion("teacher_evaluation_workontime not between", value1, value2, "teacherEvaluationWorkontime");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsIsNull() {
            addCriterion("teacher_evaluation_bekins is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsIsNotNull() {
            addCriterion("teacher_evaluation_bekins is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsEqualTo(String value) {
            addCriterion("teacher_evaluation_bekins =", value, "teacherEvaluationBekins");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsNotEqualTo(String value) {
            addCriterion("teacher_evaluation_bekins <>", value, "teacherEvaluationBekins");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsGreaterThan(String value) {
            addCriterion("teacher_evaluation_bekins >", value, "teacherEvaluationBekins");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_evaluation_bekins >=", value, "teacherEvaluationBekins");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsLessThan(String value) {
            addCriterion("teacher_evaluation_bekins <", value, "teacherEvaluationBekins");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsLessThanOrEqualTo(String value) {
            addCriterion("teacher_evaluation_bekins <=", value, "teacherEvaluationBekins");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsLike(String value) {
            addCriterion("teacher_evaluation_bekins like", value, "teacherEvaluationBekins");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsNotLike(String value) {
            addCriterion("teacher_evaluation_bekins not like", value, "teacherEvaluationBekins");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsIn(List<String> values) {
            addCriterion("teacher_evaluation_bekins in", values, "teacherEvaluationBekins");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsNotIn(List<String> values) {
            addCriterion("teacher_evaluation_bekins not in", values, "teacherEvaluationBekins");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsBetween(String value1, String value2) {
            addCriterion("teacher_evaluation_bekins between", value1, value2, "teacherEvaluationBekins");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationBekinsNotBetween(String value1, String value2) {
            addCriterion("teacher_evaluation_bekins not between", value1, value2, "teacherEvaluationBekins");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateIsNull() {
            addCriterion("teacher_evaluation_extra_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateIsNotNull() {
            addCriterion("teacher_evaluation_extra_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateEqualTo(String value) {
            addCriterion("teacher_evaluation_extra_evaluate =", value, "teacherEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateNotEqualTo(String value) {
            addCriterion("teacher_evaluation_extra_evaluate <>", value, "teacherEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateGreaterThan(String value) {
            addCriterion("teacher_evaluation_extra_evaluate >", value, "teacherEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_evaluation_extra_evaluate >=", value, "teacherEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateLessThan(String value) {
            addCriterion("teacher_evaluation_extra_evaluate <", value, "teacherEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateLessThanOrEqualTo(String value) {
            addCriterion("teacher_evaluation_extra_evaluate <=", value, "teacherEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateLike(String value) {
            addCriterion("teacher_evaluation_extra_evaluate like", value, "teacherEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateNotLike(String value) {
            addCriterion("teacher_evaluation_extra_evaluate not like", value, "teacherEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateIn(List<String> values) {
            addCriterion("teacher_evaluation_extra_evaluate in", values, "teacherEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateNotIn(List<String> values) {
            addCriterion("teacher_evaluation_extra_evaluate not in", values, "teacherEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateBetween(String value1, String value2) {
            addCriterion("teacher_evaluation_extra_evaluate between", value1, value2, "teacherEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationExtraEvaluateNotBetween(String value1, String value2) {
            addCriterion("teacher_evaluation_extra_evaluate not between", value1, value2, "teacherEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateIsNull() {
            addCriterion("teacher_evaluation_state is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateIsNotNull() {
            addCriterion("teacher_evaluation_state is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateEqualTo(String value) {
            addCriterion("teacher_evaluation_state =", value, "teacherEvaluationState");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateNotEqualTo(String value) {
            addCriterion("teacher_evaluation_state <>", value, "teacherEvaluationState");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateGreaterThan(String value) {
            addCriterion("teacher_evaluation_state >", value, "teacherEvaluationState");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_evaluation_state >=", value, "teacherEvaluationState");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateLessThan(String value) {
            addCriterion("teacher_evaluation_state <", value, "teacherEvaluationState");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateLessThanOrEqualTo(String value) {
            addCriterion("teacher_evaluation_state <=", value, "teacherEvaluationState");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateLike(String value) {
            addCriterion("teacher_evaluation_state like", value, "teacherEvaluationState");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateNotLike(String value) {
            addCriterion("teacher_evaluation_state not like", value, "teacherEvaluationState");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateIn(List<String> values) {
            addCriterion("teacher_evaluation_state in", values, "teacherEvaluationState");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateNotIn(List<String> values) {
            addCriterion("teacher_evaluation_state not in", values, "teacherEvaluationState");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateBetween(String value1, String value2) {
            addCriterion("teacher_evaluation_state between", value1, value2, "teacherEvaluationState");
            return (Criteria) this;
        }

        public Criteria andTeacherEvaluationStateNotBetween(String value1, String value2) {
            addCriterion("teacher_evaluation_state not between", value1, value2, "teacherEvaluationState");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}