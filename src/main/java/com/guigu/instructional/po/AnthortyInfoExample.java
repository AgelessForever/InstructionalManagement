package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.List;

public class AnthortyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnthortyInfoExample() {
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

        public Criteria andAnthortyIdIsNull() {
            addCriterion("anthorty_id is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdIsNotNull() {
            addCriterion("anthorty_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdEqualTo(Integer value) {
            addCriterion("anthorty_id =", value, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdNotEqualTo(Integer value) {
            addCriterion("anthorty_id <>", value, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdGreaterThan(Integer value) {
            addCriterion("anthorty_id >", value, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_id >=", value, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdLessThan(Integer value) {
            addCriterion("anthorty_id <", value, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_id <=", value, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdIn(List<Integer> values) {
            addCriterion("anthorty_id in", values, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdNotIn(List<Integer> values) {
            addCriterion("anthorty_id not in", values, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_id between", value1, value2, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_id not between", value1, value2, "anthortyId");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidIsNull() {
            addCriterion("anthorty_pid is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidIsNotNull() {
            addCriterion("anthorty_pid is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidEqualTo(Integer value) {
            addCriterion("anthorty_pid =", value, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidNotEqualTo(Integer value) {
            addCriterion("anthorty_pid <>", value, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidGreaterThan(Integer value) {
            addCriterion("anthorty_pid >", value, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_pid >=", value, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidLessThan(Integer value) {
            addCriterion("anthorty_pid <", value, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_pid <=", value, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidIn(List<Integer> values) {
            addCriterion("anthorty_pid in", values, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidNotIn(List<Integer> values) {
            addCriterion("anthorty_pid not in", values, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_pid between", value1, value2, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyPidNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_pid not between", value1, value2, "anthortyPid");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneIsNull() {
            addCriterion("anthorty_nane is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneIsNotNull() {
            addCriterion("anthorty_nane is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneEqualTo(String value) {
            addCriterion("anthorty_nane =", value, "anthortyNane");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneNotEqualTo(String value) {
            addCriterion("anthorty_nane <>", value, "anthortyNane");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneGreaterThan(String value) {
            addCriterion("anthorty_nane >", value, "anthortyNane");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneGreaterThanOrEqualTo(String value) {
            addCriterion("anthorty_nane >=", value, "anthortyNane");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneLessThan(String value) {
            addCriterion("anthorty_nane <", value, "anthortyNane");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneLessThanOrEqualTo(String value) {
            addCriterion("anthorty_nane <=", value, "anthortyNane");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneLike(String value) {
            addCriterion("anthorty_nane like", value, "anthortyNane");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneNotLike(String value) {
            addCriterion("anthorty_nane not like", value, "anthortyNane");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneIn(List<String> values) {
            addCriterion("anthorty_nane in", values, "anthortyNane");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneNotIn(List<String> values) {
            addCriterion("anthorty_nane not in", values, "anthortyNane");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneBetween(String value1, String value2) {
            addCriterion("anthorty_nane between", value1, value2, "anthortyNane");
            return (Criteria) this;
        }

        public Criteria andAnthortyNaneNotBetween(String value1, String value2) {
            addCriterion("anthorty_nane not between", value1, value2, "anthortyNane");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescIsNull() {
            addCriterion("anthorty_desc is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescIsNotNull() {
            addCriterion("anthorty_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescEqualTo(String value) {
            addCriterion("anthorty_desc =", value, "anthortyDesc");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescNotEqualTo(String value) {
            addCriterion("anthorty_desc <>", value, "anthortyDesc");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescGreaterThan(String value) {
            addCriterion("anthorty_desc >", value, "anthortyDesc");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescGreaterThanOrEqualTo(String value) {
            addCriterion("anthorty_desc >=", value, "anthortyDesc");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescLessThan(String value) {
            addCriterion("anthorty_desc <", value, "anthortyDesc");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescLessThanOrEqualTo(String value) {
            addCriterion("anthorty_desc <=", value, "anthortyDesc");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescLike(String value) {
            addCriterion("anthorty_desc like", value, "anthortyDesc");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescNotLike(String value) {
            addCriterion("anthorty_desc not like", value, "anthortyDesc");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescIn(List<String> values) {
            addCriterion("anthorty_desc in", values, "anthortyDesc");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescNotIn(List<String> values) {
            addCriterion("anthorty_desc not in", values, "anthortyDesc");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescBetween(String value1, String value2) {
            addCriterion("anthorty_desc between", value1, value2, "anthortyDesc");
            return (Criteria) this;
        }

        public Criteria andAnthortyDescNotBetween(String value1, String value2) {
            addCriterion("anthorty_desc not between", value1, value2, "anthortyDesc");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlIsNull() {
            addCriterion("anthorty_url is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlIsNotNull() {
            addCriterion("anthorty_url is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlEqualTo(String value) {
            addCriterion("anthorty_url =", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlNotEqualTo(String value) {
            addCriterion("anthorty_url <>", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlGreaterThan(String value) {
            addCriterion("anthorty_url >", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("anthorty_url >=", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlLessThan(String value) {
            addCriterion("anthorty_url <", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlLessThanOrEqualTo(String value) {
            addCriterion("anthorty_url <=", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlLike(String value) {
            addCriterion("anthorty_url like", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlNotLike(String value) {
            addCriterion("anthorty_url not like", value, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlIn(List<String> values) {
            addCriterion("anthorty_url in", values, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlNotIn(List<String> values) {
            addCriterion("anthorty_url not in", values, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlBetween(String value1, String value2) {
            addCriterion("anthorty_url between", value1, value2, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyUrlNotBetween(String value1, String value2) {
            addCriterion("anthorty_url not between", value1, value2, "anthortyUrl");
            return (Criteria) this;
        }

        public Criteria andAnthortyOneIsNull() {
            addCriterion("anthorty_one is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyOneIsNotNull() {
            addCriterion("anthorty_one is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyOneEqualTo(Integer value) {
            addCriterion("anthorty_one =", value, "anthortyOne");
            return (Criteria) this;
        }

        public Criteria andAnthortyOneNotEqualTo(Integer value) {
            addCriterion("anthorty_one <>", value, "anthortyOne");
            return (Criteria) this;
        }

        public Criteria andAnthortyOneGreaterThan(Integer value) {
            addCriterion("anthorty_one >", value, "anthortyOne");
            return (Criteria) this;
        }

        public Criteria andAnthortyOneGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_one >=", value, "anthortyOne");
            return (Criteria) this;
        }

        public Criteria andAnthortyOneLessThan(Integer value) {
            addCriterion("anthorty_one <", value, "anthortyOne");
            return (Criteria) this;
        }

        public Criteria andAnthortyOneLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_one <=", value, "anthortyOne");
            return (Criteria) this;
        }

        public Criteria andAnthortyOneIn(List<Integer> values) {
            addCriterion("anthorty_one in", values, "anthortyOne");
            return (Criteria) this;
        }

        public Criteria andAnthortyOneNotIn(List<Integer> values) {
            addCriterion("anthorty_one not in", values, "anthortyOne");
            return (Criteria) this;
        }

        public Criteria andAnthortyOneBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_one between", value1, value2, "anthortyOne");
            return (Criteria) this;
        }

        public Criteria andAnthortyOneNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_one not between", value1, value2, "anthortyOne");
            return (Criteria) this;
        }

        public Criteria andAnthortyTwoIsNull() {
            addCriterion("anthorty_two is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyTwoIsNotNull() {
            addCriterion("anthorty_two is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyTwoEqualTo(Integer value) {
            addCriterion("anthorty_two =", value, "anthortyTwo");
            return (Criteria) this;
        }

        public Criteria andAnthortyTwoNotEqualTo(Integer value) {
            addCriterion("anthorty_two <>", value, "anthortyTwo");
            return (Criteria) this;
        }

        public Criteria andAnthortyTwoGreaterThan(Integer value) {
            addCriterion("anthorty_two >", value, "anthortyTwo");
            return (Criteria) this;
        }

        public Criteria andAnthortyTwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_two >=", value, "anthortyTwo");
            return (Criteria) this;
        }

        public Criteria andAnthortyTwoLessThan(Integer value) {
            addCriterion("anthorty_two <", value, "anthortyTwo");
            return (Criteria) this;
        }

        public Criteria andAnthortyTwoLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_two <=", value, "anthortyTwo");
            return (Criteria) this;
        }

        public Criteria andAnthortyTwoIn(List<Integer> values) {
            addCriterion("anthorty_two in", values, "anthortyTwo");
            return (Criteria) this;
        }

        public Criteria andAnthortyTwoNotIn(List<Integer> values) {
            addCriterion("anthorty_two not in", values, "anthortyTwo");
            return (Criteria) this;
        }

        public Criteria andAnthortyTwoBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_two between", value1, value2, "anthortyTwo");
            return (Criteria) this;
        }

        public Criteria andAnthortyTwoNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_two not between", value1, value2, "anthortyTwo");
            return (Criteria) this;
        }

        public Criteria andAnthortyThreeIsNull() {
            addCriterion("anthorty_three is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyThreeIsNotNull() {
            addCriterion("anthorty_three is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyThreeEqualTo(Integer value) {
            addCriterion("anthorty_three =", value, "anthortyThree");
            return (Criteria) this;
        }

        public Criteria andAnthortyThreeNotEqualTo(Integer value) {
            addCriterion("anthorty_three <>", value, "anthortyThree");
            return (Criteria) this;
        }

        public Criteria andAnthortyThreeGreaterThan(Integer value) {
            addCriterion("anthorty_three >", value, "anthortyThree");
            return (Criteria) this;
        }

        public Criteria andAnthortyThreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_three >=", value, "anthortyThree");
            return (Criteria) this;
        }

        public Criteria andAnthortyThreeLessThan(Integer value) {
            addCriterion("anthorty_three <", value, "anthortyThree");
            return (Criteria) this;
        }

        public Criteria andAnthortyThreeLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_three <=", value, "anthortyThree");
            return (Criteria) this;
        }

        public Criteria andAnthortyThreeIn(List<Integer> values) {
            addCriterion("anthorty_three in", values, "anthortyThree");
            return (Criteria) this;
        }

        public Criteria andAnthortyThreeNotIn(List<Integer> values) {
            addCriterion("anthorty_three not in", values, "anthortyThree");
            return (Criteria) this;
        }

        public Criteria andAnthortyThreeBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_three between", value1, value2, "anthortyThree");
            return (Criteria) this;
        }

        public Criteria andAnthortyThreeNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_three not between", value1, value2, "anthortyThree");
            return (Criteria) this;
        }

        public Criteria andAnthortyFourIsNull() {
            addCriterion("anthorty_four is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyFourIsNotNull() {
            addCriterion("anthorty_four is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyFourEqualTo(Integer value) {
            addCriterion("anthorty_four =", value, "anthortyFour");
            return (Criteria) this;
        }

        public Criteria andAnthortyFourNotEqualTo(Integer value) {
            addCriterion("anthorty_four <>", value, "anthortyFour");
            return (Criteria) this;
        }

        public Criteria andAnthortyFourGreaterThan(Integer value) {
            addCriterion("anthorty_four >", value, "anthortyFour");
            return (Criteria) this;
        }

        public Criteria andAnthortyFourGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_four >=", value, "anthortyFour");
            return (Criteria) this;
        }

        public Criteria andAnthortyFourLessThan(Integer value) {
            addCriterion("anthorty_four <", value, "anthortyFour");
            return (Criteria) this;
        }

        public Criteria andAnthortyFourLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_four <=", value, "anthortyFour");
            return (Criteria) this;
        }

        public Criteria andAnthortyFourIn(List<Integer> values) {
            addCriterion("anthorty_four in", values, "anthortyFour");
            return (Criteria) this;
        }

        public Criteria andAnthortyFourNotIn(List<Integer> values) {
            addCriterion("anthorty_four not in", values, "anthortyFour");
            return (Criteria) this;
        }

        public Criteria andAnthortyFourBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_four between", value1, value2, "anthortyFour");
            return (Criteria) this;
        }

        public Criteria andAnthortyFourNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_four not between", value1, value2, "anthortyFour");
            return (Criteria) this;
        }

        public Criteria andAnthortyFiveIsNull() {
            addCriterion("anthorty_five is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyFiveIsNotNull() {
            addCriterion("anthorty_five is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyFiveEqualTo(Integer value) {
            addCriterion("anthorty_five =", value, "anthortyFive");
            return (Criteria) this;
        }

        public Criteria andAnthortyFiveNotEqualTo(Integer value) {
            addCriterion("anthorty_five <>", value, "anthortyFive");
            return (Criteria) this;
        }

        public Criteria andAnthortyFiveGreaterThan(Integer value) {
            addCriterion("anthorty_five >", value, "anthortyFive");
            return (Criteria) this;
        }

        public Criteria andAnthortyFiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_five >=", value, "anthortyFive");
            return (Criteria) this;
        }

        public Criteria andAnthortyFiveLessThan(Integer value) {
            addCriterion("anthorty_five <", value, "anthortyFive");
            return (Criteria) this;
        }

        public Criteria andAnthortyFiveLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_five <=", value, "anthortyFive");
            return (Criteria) this;
        }

        public Criteria andAnthortyFiveIn(List<Integer> values) {
            addCriterion("anthorty_five in", values, "anthortyFive");
            return (Criteria) this;
        }

        public Criteria andAnthortyFiveNotIn(List<Integer> values) {
            addCriterion("anthorty_five not in", values, "anthortyFive");
            return (Criteria) this;
        }

        public Criteria andAnthortyFiveBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_five between", value1, value2, "anthortyFive");
            return (Criteria) this;
        }

        public Criteria andAnthortyFiveNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_five not between", value1, value2, "anthortyFive");
            return (Criteria) this;
        }

        public Criteria andAnthortySixIsNull() {
            addCriterion("anthorty_six is null");
            return (Criteria) this;
        }

        public Criteria andAnthortySixIsNotNull() {
            addCriterion("anthorty_six is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortySixEqualTo(Integer value) {
            addCriterion("anthorty_six =", value, "anthortySix");
            return (Criteria) this;
        }

        public Criteria andAnthortySixNotEqualTo(Integer value) {
            addCriterion("anthorty_six <>", value, "anthortySix");
            return (Criteria) this;
        }

        public Criteria andAnthortySixGreaterThan(Integer value) {
            addCriterion("anthorty_six >", value, "anthortySix");
            return (Criteria) this;
        }

        public Criteria andAnthortySixGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_six >=", value, "anthortySix");
            return (Criteria) this;
        }

        public Criteria andAnthortySixLessThan(Integer value) {
            addCriterion("anthorty_six <", value, "anthortySix");
            return (Criteria) this;
        }

        public Criteria andAnthortySixLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_six <=", value, "anthortySix");
            return (Criteria) this;
        }

        public Criteria andAnthortySixIn(List<Integer> values) {
            addCriterion("anthorty_six in", values, "anthortySix");
            return (Criteria) this;
        }

        public Criteria andAnthortySixNotIn(List<Integer> values) {
            addCriterion("anthorty_six not in", values, "anthortySix");
            return (Criteria) this;
        }

        public Criteria andAnthortySixBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_six between", value1, value2, "anthortySix");
            return (Criteria) this;
        }

        public Criteria andAnthortySixNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_six not between", value1, value2, "anthortySix");
            return (Criteria) this;
        }

        public Criteria andAnthortySevenIsNull() {
            addCriterion("anthorty_seven is null");
            return (Criteria) this;
        }

        public Criteria andAnthortySevenIsNotNull() {
            addCriterion("anthorty_seven is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortySevenEqualTo(Integer value) {
            addCriterion("anthorty_seven =", value, "anthortySeven");
            return (Criteria) this;
        }

        public Criteria andAnthortySevenNotEqualTo(Integer value) {
            addCriterion("anthorty_seven <>", value, "anthortySeven");
            return (Criteria) this;
        }

        public Criteria andAnthortySevenGreaterThan(Integer value) {
            addCriterion("anthorty_seven >", value, "anthortySeven");
            return (Criteria) this;
        }

        public Criteria andAnthortySevenGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_seven >=", value, "anthortySeven");
            return (Criteria) this;
        }

        public Criteria andAnthortySevenLessThan(Integer value) {
            addCriterion("anthorty_seven <", value, "anthortySeven");
            return (Criteria) this;
        }

        public Criteria andAnthortySevenLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_seven <=", value, "anthortySeven");
            return (Criteria) this;
        }

        public Criteria andAnthortySevenIn(List<Integer> values) {
            addCriterion("anthorty_seven in", values, "anthortySeven");
            return (Criteria) this;
        }

        public Criteria andAnthortySevenNotIn(List<Integer> values) {
            addCriterion("anthorty_seven not in", values, "anthortySeven");
            return (Criteria) this;
        }

        public Criteria andAnthortySevenBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_seven between", value1, value2, "anthortySeven");
            return (Criteria) this;
        }

        public Criteria andAnthortySevenNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_seven not between", value1, value2, "anthortySeven");
            return (Criteria) this;
        }

        public Criteria andAnthortyEightIsNull() {
            addCriterion("anthorty_eight is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyEightIsNotNull() {
            addCriterion("anthorty_eight is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyEightEqualTo(Integer value) {
            addCriterion("anthorty_eight =", value, "anthortyEight");
            return (Criteria) this;
        }

        public Criteria andAnthortyEightNotEqualTo(Integer value) {
            addCriterion("anthorty_eight <>", value, "anthortyEight");
            return (Criteria) this;
        }

        public Criteria andAnthortyEightGreaterThan(Integer value) {
            addCriterion("anthorty_eight >", value, "anthortyEight");
            return (Criteria) this;
        }

        public Criteria andAnthortyEightGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_eight >=", value, "anthortyEight");
            return (Criteria) this;
        }

        public Criteria andAnthortyEightLessThan(Integer value) {
            addCriterion("anthorty_eight <", value, "anthortyEight");
            return (Criteria) this;
        }

        public Criteria andAnthortyEightLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_eight <=", value, "anthortyEight");
            return (Criteria) this;
        }

        public Criteria andAnthortyEightIn(List<Integer> values) {
            addCriterion("anthorty_eight in", values, "anthortyEight");
            return (Criteria) this;
        }

        public Criteria andAnthortyEightNotIn(List<Integer> values) {
            addCriterion("anthorty_eight not in", values, "anthortyEight");
            return (Criteria) this;
        }

        public Criteria andAnthortyEightBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_eight between", value1, value2, "anthortyEight");
            return (Criteria) this;
        }

        public Criteria andAnthortyEightNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_eight not between", value1, value2, "anthortyEight");
            return (Criteria) this;
        }

        public Criteria andAnthortyNineIsNull() {
            addCriterion("anthorty_nine is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyNineIsNotNull() {
            addCriterion("anthorty_nine is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyNineEqualTo(Integer value) {
            addCriterion("anthorty_nine =", value, "anthortyNine");
            return (Criteria) this;
        }

        public Criteria andAnthortyNineNotEqualTo(Integer value) {
            addCriterion("anthorty_nine <>", value, "anthortyNine");
            return (Criteria) this;
        }

        public Criteria andAnthortyNineGreaterThan(Integer value) {
            addCriterion("anthorty_nine >", value, "anthortyNine");
            return (Criteria) this;
        }

        public Criteria andAnthortyNineGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_nine >=", value, "anthortyNine");
            return (Criteria) this;
        }

        public Criteria andAnthortyNineLessThan(Integer value) {
            addCriterion("anthorty_nine <", value, "anthortyNine");
            return (Criteria) this;
        }

        public Criteria andAnthortyNineLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_nine <=", value, "anthortyNine");
            return (Criteria) this;
        }

        public Criteria andAnthortyNineIn(List<Integer> values) {
            addCriterion("anthorty_nine in", values, "anthortyNine");
            return (Criteria) this;
        }

        public Criteria andAnthortyNineNotIn(List<Integer> values) {
            addCriterion("anthorty_nine not in", values, "anthortyNine");
            return (Criteria) this;
        }

        public Criteria andAnthortyNineBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_nine between", value1, value2, "anthortyNine");
            return (Criteria) this;
        }

        public Criteria andAnthortyNineNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_nine not between", value1, value2, "anthortyNine");
            return (Criteria) this;
        }

        public Criteria andAnthortyTenIsNull() {
            addCriterion("anthorty_ten is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyTenIsNotNull() {
            addCriterion("anthorty_ten is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyTenEqualTo(Integer value) {
            addCriterion("anthorty_ten =", value, "anthortyTen");
            return (Criteria) this;
        }

        public Criteria andAnthortyTenNotEqualTo(Integer value) {
            addCriterion("anthorty_ten <>", value, "anthortyTen");
            return (Criteria) this;
        }

        public Criteria andAnthortyTenGreaterThan(Integer value) {
            addCriterion("anthorty_ten >", value, "anthortyTen");
            return (Criteria) this;
        }

        public Criteria andAnthortyTenGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_ten >=", value, "anthortyTen");
            return (Criteria) this;
        }

        public Criteria andAnthortyTenLessThan(Integer value) {
            addCriterion("anthorty_ten <", value, "anthortyTen");
            return (Criteria) this;
        }

        public Criteria andAnthortyTenLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_ten <=", value, "anthortyTen");
            return (Criteria) this;
        }

        public Criteria andAnthortyTenIn(List<Integer> values) {
            addCriterion("anthorty_ten in", values, "anthortyTen");
            return (Criteria) this;
        }

        public Criteria andAnthortyTenNotIn(List<Integer> values) {
            addCriterion("anthorty_ten not in", values, "anthortyTen");
            return (Criteria) this;
        }

        public Criteria andAnthortyTenBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_ten between", value1, value2, "anthortyTen");
            return (Criteria) this;
        }

        public Criteria andAnthortyTenNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_ten not between", value1, value2, "anthortyTen");
            return (Criteria) this;
        }

        public Criteria andAnthortyElevenIsNull() {
            addCriterion("anthorty_eleven is null");
            return (Criteria) this;
        }

        public Criteria andAnthortyElevenIsNotNull() {
            addCriterion("anthorty_eleven is not null");
            return (Criteria) this;
        }

        public Criteria andAnthortyElevenEqualTo(Integer value) {
            addCriterion("anthorty_eleven =", value, "anthortyEleven");
            return (Criteria) this;
        }

        public Criteria andAnthortyElevenNotEqualTo(Integer value) {
            addCriterion("anthorty_eleven <>", value, "anthortyEleven");
            return (Criteria) this;
        }

        public Criteria andAnthortyElevenGreaterThan(Integer value) {
            addCriterion("anthorty_eleven >", value, "anthortyEleven");
            return (Criteria) this;
        }

        public Criteria andAnthortyElevenGreaterThanOrEqualTo(Integer value) {
            addCriterion("anthorty_eleven >=", value, "anthortyEleven");
            return (Criteria) this;
        }

        public Criteria andAnthortyElevenLessThan(Integer value) {
            addCriterion("anthorty_eleven <", value, "anthortyEleven");
            return (Criteria) this;
        }

        public Criteria andAnthortyElevenLessThanOrEqualTo(Integer value) {
            addCriterion("anthorty_eleven <=", value, "anthortyEleven");
            return (Criteria) this;
        }

        public Criteria andAnthortyElevenIn(List<Integer> values) {
            addCriterion("anthorty_eleven in", values, "anthortyEleven");
            return (Criteria) this;
        }

        public Criteria andAnthortyElevenNotIn(List<Integer> values) {
            addCriterion("anthorty_eleven not in", values, "anthortyEleven");
            return (Criteria) this;
        }

        public Criteria andAnthortyElevenBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_eleven between", value1, value2, "anthortyEleven");
            return (Criteria) this;
        }

        public Criteria andAnthortyElevenNotBetween(Integer value1, Integer value2) {
            addCriterion("anthorty_eleven not between", value1, value2, "anthortyEleven");
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