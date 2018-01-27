package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.List;

public class CourseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseInfoExample() {
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

        public Criteria andCourseHourIsNull() {
            addCriterion("course_hour is null");
            return (Criteria) this;
        }

        public Criteria andCourseHourIsNotNull() {
            addCriterion("course_hour is not null");
            return (Criteria) this;
        }

        public Criteria andCourseHourEqualTo(Integer value) {
            addCriterion("course_hour =", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourNotEqualTo(Integer value) {
            addCriterion("course_hour <>", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourGreaterThan(Integer value) {
            addCriterion("course_hour >", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_hour >=", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourLessThan(Integer value) {
            addCriterion("course_hour <", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourLessThanOrEqualTo(Integer value) {
            addCriterion("course_hour <=", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourIn(List<Integer> values) {
            addCriterion("course_hour in", values, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourNotIn(List<Integer> values) {
            addCriterion("course_hour not in", values, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourBetween(Integer value1, Integer value2) {
            addCriterion("course_hour between", value1, value2, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourNotBetween(Integer value1, Integer value2) {
            addCriterion("course_hour not between", value1, value2, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseDescIsNull() {
            addCriterion("course_desc is null");
            return (Criteria) this;
        }

        public Criteria andCourseDescIsNotNull() {
            addCriterion("course_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDescEqualTo(String value) {
            addCriterion("course_desc =", value, "courseDesc");
            return (Criteria) this;
        }

        public Criteria andCourseDescNotEqualTo(String value) {
            addCriterion("course_desc <>", value, "courseDesc");
            return (Criteria) this;
        }

        public Criteria andCourseDescGreaterThan(String value) {
            addCriterion("course_desc >", value, "courseDesc");
            return (Criteria) this;
        }

        public Criteria andCourseDescGreaterThanOrEqualTo(String value) {
            addCriterion("course_desc >=", value, "courseDesc");
            return (Criteria) this;
        }

        public Criteria andCourseDescLessThan(String value) {
            addCriterion("course_desc <", value, "courseDesc");
            return (Criteria) this;
        }

        public Criteria andCourseDescLessThanOrEqualTo(String value) {
            addCriterion("course_desc <=", value, "courseDesc");
            return (Criteria) this;
        }

        public Criteria andCourseDescLike(String value) {
            addCriterion("course_desc like", value, "courseDesc");
            return (Criteria) this;
        }

        public Criteria andCourseDescNotLike(String value) {
            addCriterion("course_desc not like", value, "courseDesc");
            return (Criteria) this;
        }

        public Criteria andCourseDescIn(List<String> values) {
            addCriterion("course_desc in", values, "courseDesc");
            return (Criteria) this;
        }

        public Criteria andCourseDescNotIn(List<String> values) {
            addCriterion("course_desc not in", values, "courseDesc");
            return (Criteria) this;
        }

        public Criteria andCourseDescBetween(String value1, String value2) {
            addCriterion("course_desc between", value1, value2, "courseDesc");
            return (Criteria) this;
        }

        public Criteria andCourseDescNotBetween(String value1, String value2) {
            addCriterion("course_desc not between", value1, value2, "courseDesc");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyIsNull() {
            addCriterion("course_difficulty is null");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyIsNotNull() {
            addCriterion("course_difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyEqualTo(Integer value) {
            addCriterion("course_difficulty =", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyNotEqualTo(Integer value) {
            addCriterion("course_difficulty <>", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyGreaterThan(Integer value) {
            addCriterion("course_difficulty >", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_difficulty >=", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyLessThan(Integer value) {
            addCriterion("course_difficulty <", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyLessThanOrEqualTo(Integer value) {
            addCriterion("course_difficulty <=", value, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyIn(List<Integer> values) {
            addCriterion("course_difficulty in", values, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyNotIn(List<Integer> values) {
            addCriterion("course_difficulty not in", values, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyBetween(Integer value1, Integer value2) {
            addCriterion("course_difficulty between", value1, value2, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseDifficultyNotBetween(Integer value1, Integer value2) {
            addCriterion("course_difficulty not between", value1, value2, "courseDifficulty");
            return (Criteria) this;
        }

        public Criteria andCourseStateIsNull() {
            addCriterion("course_state is null");
            return (Criteria) this;
        }

        public Criteria andCourseStateIsNotNull() {
            addCriterion("course_state is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStateEqualTo(String value) {
            addCriterion("course_state =", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateNotEqualTo(String value) {
            addCriterion("course_state <>", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateGreaterThan(String value) {
            addCriterion("course_state >", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateGreaterThanOrEqualTo(String value) {
            addCriterion("course_state >=", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateLessThan(String value) {
            addCriterion("course_state <", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateLessThanOrEqualTo(String value) {
            addCriterion("course_state <=", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateLike(String value) {
            addCriterion("course_state like", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateNotLike(String value) {
            addCriterion("course_state not like", value, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateIn(List<String> values) {
            addCriterion("course_state in", values, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateNotIn(List<String> values) {
            addCriterion("course_state not in", values, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateBetween(String value1, String value2) {
            addCriterion("course_state between", value1, value2, "courseState");
            return (Criteria) this;
        }

        public Criteria andCourseStateNotBetween(String value1, String value2) {
            addCriterion("course_state not between", value1, value2, "courseState");
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