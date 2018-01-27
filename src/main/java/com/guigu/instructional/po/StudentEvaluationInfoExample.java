package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.List;

public class StudentEvaluationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentEvaluationInfoExample() {
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

        public Criteria andStudentEvaluationIdIsNull() {
            addCriterion("student_evaluation_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationIdIsNotNull() {
            addCriterion("student_evaluation_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationIdEqualTo(Integer value) {
            addCriterion("student_evaluation_id =", value, "studentEvaluationId");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationIdNotEqualTo(Integer value) {
            addCriterion("student_evaluation_id <>", value, "studentEvaluationId");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationIdGreaterThan(Integer value) {
            addCriterion("student_evaluation_id >", value, "studentEvaluationId");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_evaluation_id >=", value, "studentEvaluationId");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationIdLessThan(Integer value) {
            addCriterion("student_evaluation_id <", value, "studentEvaluationId");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_evaluation_id <=", value, "studentEvaluationId");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationIdIn(List<Integer> values) {
            addCriterion("student_evaluation_id in", values, "studentEvaluationId");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationIdNotIn(List<Integer> values) {
            addCriterion("student_evaluation_id not in", values, "studentEvaluationId");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationIdBetween(Integer value1, Integer value2) {
            addCriterion("student_evaluation_id between", value1, value2, "studentEvaluationId");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_evaluation_id not between", value1, value2, "studentEvaluationId");
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

        public Criteria andStudentEvaluationClassContentIsNull() {
            addCriterion("student_evaluation_class_content is null");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentIsNotNull() {
            addCriterion("student_evaluation_class_content is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentEqualTo(String value) {
            addCriterion("student_evaluation_class_content =", value, "studentEvaluationClassContent");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentNotEqualTo(String value) {
            addCriterion("student_evaluation_class_content <>", value, "studentEvaluationClassContent");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentGreaterThan(String value) {
            addCriterion("student_evaluation_class_content >", value, "studentEvaluationClassContent");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentGreaterThanOrEqualTo(String value) {
            addCriterion("student_evaluation_class_content >=", value, "studentEvaluationClassContent");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentLessThan(String value) {
            addCriterion("student_evaluation_class_content <", value, "studentEvaluationClassContent");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentLessThanOrEqualTo(String value) {
            addCriterion("student_evaluation_class_content <=", value, "studentEvaluationClassContent");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentLike(String value) {
            addCriterion("student_evaluation_class_content like", value, "studentEvaluationClassContent");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentNotLike(String value) {
            addCriterion("student_evaluation_class_content not like", value, "studentEvaluationClassContent");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentIn(List<String> values) {
            addCriterion("student_evaluation_class_content in", values, "studentEvaluationClassContent");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentNotIn(List<String> values) {
            addCriterion("student_evaluation_class_content not in", values, "studentEvaluationClassContent");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentBetween(String value1, String value2) {
            addCriterion("student_evaluation_class_content between", value1, value2, "studentEvaluationClassContent");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassContentNotBetween(String value1, String value2) {
            addCriterion("student_evaluation_class_content not between", value1, value2, "studentEvaluationClassContent");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityIsNull() {
            addCriterion("student_evaluation_class_activity is null");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityIsNotNull() {
            addCriterion("student_evaluation_class_activity is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityEqualTo(String value) {
            addCriterion("student_evaluation_class_activity =", value, "studentEvaluationClassActivity");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityNotEqualTo(String value) {
            addCriterion("student_evaluation_class_activity <>", value, "studentEvaluationClassActivity");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityGreaterThan(String value) {
            addCriterion("student_evaluation_class_activity >", value, "studentEvaluationClassActivity");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityGreaterThanOrEqualTo(String value) {
            addCriterion("student_evaluation_class_activity >=", value, "studentEvaluationClassActivity");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityLessThan(String value) {
            addCriterion("student_evaluation_class_activity <", value, "studentEvaluationClassActivity");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityLessThanOrEqualTo(String value) {
            addCriterion("student_evaluation_class_activity <=", value, "studentEvaluationClassActivity");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityLike(String value) {
            addCriterion("student_evaluation_class_activity like", value, "studentEvaluationClassActivity");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityNotLike(String value) {
            addCriterion("student_evaluation_class_activity not like", value, "studentEvaluationClassActivity");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityIn(List<String> values) {
            addCriterion("student_evaluation_class_activity in", values, "studentEvaluationClassActivity");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityNotIn(List<String> values) {
            addCriterion("student_evaluation_class_activity not in", values, "studentEvaluationClassActivity");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityBetween(String value1, String value2) {
            addCriterion("student_evaluation_class_activity between", value1, value2, "studentEvaluationClassActivity");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationClassActivityNotBetween(String value1, String value2) {
            addCriterion("student_evaluation_class_activity not between", value1, value2, "studentEvaluationClassActivity");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyIsNull() {
            addCriterion("student_evaluation_answer_patiently is null");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyIsNotNull() {
            addCriterion("student_evaluation_answer_patiently is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyEqualTo(String value) {
            addCriterion("student_evaluation_answer_patiently =", value, "studentEvaluationAnswerPatiently");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyNotEqualTo(String value) {
            addCriterion("student_evaluation_answer_patiently <>", value, "studentEvaluationAnswerPatiently");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyGreaterThan(String value) {
            addCriterion("student_evaluation_answer_patiently >", value, "studentEvaluationAnswerPatiently");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyGreaterThanOrEqualTo(String value) {
            addCriterion("student_evaluation_answer_patiently >=", value, "studentEvaluationAnswerPatiently");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyLessThan(String value) {
            addCriterion("student_evaluation_answer_patiently <", value, "studentEvaluationAnswerPatiently");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyLessThanOrEqualTo(String value) {
            addCriterion("student_evaluation_answer_patiently <=", value, "studentEvaluationAnswerPatiently");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyLike(String value) {
            addCriterion("student_evaluation_answer_patiently like", value, "studentEvaluationAnswerPatiently");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyNotLike(String value) {
            addCriterion("student_evaluation_answer_patiently not like", value, "studentEvaluationAnswerPatiently");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyIn(List<String> values) {
            addCriterion("student_evaluation_answer_patiently in", values, "studentEvaluationAnswerPatiently");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyNotIn(List<String> values) {
            addCriterion("student_evaluation_answer_patiently not in", values, "studentEvaluationAnswerPatiently");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyBetween(String value1, String value2) {
            addCriterion("student_evaluation_answer_patiently between", value1, value2, "studentEvaluationAnswerPatiently");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationAnswerPatientlyNotBetween(String value1, String value2) {
            addCriterion("student_evaluation_answer_patiently not between", value1, value2, "studentEvaluationAnswerPatiently");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateIsNull() {
            addCriterion("student_evaluation_extra_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateIsNotNull() {
            addCriterion("student_evaluation_extra_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateEqualTo(String value) {
            addCriterion("student_evaluation_extra_evaluate =", value, "studentEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateNotEqualTo(String value) {
            addCriterion("student_evaluation_extra_evaluate <>", value, "studentEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateGreaterThan(String value) {
            addCriterion("student_evaluation_extra_evaluate >", value, "studentEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("student_evaluation_extra_evaluate >=", value, "studentEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateLessThan(String value) {
            addCriterion("student_evaluation_extra_evaluate <", value, "studentEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateLessThanOrEqualTo(String value) {
            addCriterion("student_evaluation_extra_evaluate <=", value, "studentEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateLike(String value) {
            addCriterion("student_evaluation_extra_evaluate like", value, "studentEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateNotLike(String value) {
            addCriterion("student_evaluation_extra_evaluate not like", value, "studentEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateIn(List<String> values) {
            addCriterion("student_evaluation_extra_evaluate in", values, "studentEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateNotIn(List<String> values) {
            addCriterion("student_evaluation_extra_evaluate not in", values, "studentEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateBetween(String value1, String value2) {
            addCriterion("student_evaluation_extra_evaluate between", value1, value2, "studentEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationExtraEvaluateNotBetween(String value1, String value2) {
            addCriterion("student_evaluation_extra_evaluate not between", value1, value2, "studentEvaluationExtraEvaluate");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateIsNull() {
            addCriterion("student_evaluation_state is null");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateIsNotNull() {
            addCriterion("student_evaluation_state is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateEqualTo(String value) {
            addCriterion("student_evaluation_state =", value, "studentEvaluationState");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateNotEqualTo(String value) {
            addCriterion("student_evaluation_state <>", value, "studentEvaluationState");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateGreaterThan(String value) {
            addCriterion("student_evaluation_state >", value, "studentEvaluationState");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateGreaterThanOrEqualTo(String value) {
            addCriterion("student_evaluation_state >=", value, "studentEvaluationState");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateLessThan(String value) {
            addCriterion("student_evaluation_state <", value, "studentEvaluationState");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateLessThanOrEqualTo(String value) {
            addCriterion("student_evaluation_state <=", value, "studentEvaluationState");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateLike(String value) {
            addCriterion("student_evaluation_state like", value, "studentEvaluationState");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateNotLike(String value) {
            addCriterion("student_evaluation_state not like", value, "studentEvaluationState");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateIn(List<String> values) {
            addCriterion("student_evaluation_state in", values, "studentEvaluationState");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateNotIn(List<String> values) {
            addCriterion("student_evaluation_state not in", values, "studentEvaluationState");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateBetween(String value1, String value2) {
            addCriterion("student_evaluation_state between", value1, value2, "studentEvaluationState");
            return (Criteria) this;
        }

        public Criteria andStudentEvaluationStateNotBetween(String value1, String value2) {
            addCriterion("student_evaluation_state not between", value1, value2, "studentEvaluationState");
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