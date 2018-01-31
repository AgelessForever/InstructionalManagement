package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.List;

public class RoleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleInfoExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleDescIsNull() {
            addCriterion("role_desc is null");
            return (Criteria) this;
        }

        public Criteria andRoleDescIsNotNull() {
            addCriterion("role_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDescEqualTo(String value) {
            addCriterion("role_desc =", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotEqualTo(String value) {
            addCriterion("role_desc <>", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescGreaterThan(String value) {
            addCriterion("role_desc >", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescGreaterThanOrEqualTo(String value) {
            addCriterion("role_desc >=", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescLessThan(String value) {
            addCriterion("role_desc <", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescLessThanOrEqualTo(String value) {
            addCriterion("role_desc <=", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescLike(String value) {
            addCriterion("role_desc like", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotLike(String value) {
            addCriterion("role_desc not like", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescIn(List<String> values) {
            addCriterion("role_desc in", values, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotIn(List<String> values) {
            addCriterion("role_desc not in", values, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescBetween(String value1, String value2) {
            addCriterion("role_desc between", value1, value2, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotBetween(String value1, String value2) {
            addCriterion("role_desc not between", value1, value2, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleStateIsNull() {
            addCriterion("role_state is null");
            return (Criteria) this;
        }

        public Criteria andRoleStateIsNotNull() {
            addCriterion("role_state is not null");
            return (Criteria) this;
        }

        public Criteria andRoleStateEqualTo(String value) {
            addCriterion("role_state =", value, "roleState");
            return (Criteria) this;
        }

        public Criteria andRoleStateNotEqualTo(String value) {
            addCriterion("role_state <>", value, "roleState");
            return (Criteria) this;
        }

        public Criteria andRoleStateGreaterThan(String value) {
            addCriterion("role_state >", value, "roleState");
            return (Criteria) this;
        }

        public Criteria andRoleStateGreaterThanOrEqualTo(String value) {
            addCriterion("role_state >=", value, "roleState");
            return (Criteria) this;
        }

        public Criteria andRoleStateLessThan(String value) {
            addCriterion("role_state <", value, "roleState");
            return (Criteria) this;
        }

        public Criteria andRoleStateLessThanOrEqualTo(String value) {
            addCriterion("role_state <=", value, "roleState");
            return (Criteria) this;
        }

        public Criteria andRoleStateLike(String value) {
            addCriterion("role_state like", value, "roleState");
            return (Criteria) this;
        }

        public Criteria andRoleStateNotLike(String value) {
            addCriterion("role_state not like", value, "roleState");
            return (Criteria) this;
        }

        public Criteria andRoleStateIn(List<String> values) {
            addCriterion("role_state in", values, "roleState");
            return (Criteria) this;
        }

        public Criteria andRoleStateNotIn(List<String> values) {
            addCriterion("role_state not in", values, "roleState");
            return (Criteria) this;
        }

        public Criteria andRoleStateBetween(String value1, String value2) {
            addCriterion("role_state between", value1, value2, "roleState");
            return (Criteria) this;
        }

        public Criteria andRoleStateNotBetween(String value1, String value2) {
            addCriterion("role_state not between", value1, value2, "roleState");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyOneIsNull() {
            addCriterion("role_anthorty_one is null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyOneIsNotNull() {
            addCriterion("role_anthorty_one is not null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyOneEqualTo(Integer value) {
            addCriterion("role_anthorty_one =", value, "roleAnthortyOne");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyOneNotEqualTo(Integer value) {
            addCriterion("role_anthorty_one <>", value, "roleAnthortyOne");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyOneGreaterThan(Integer value) {
            addCriterion("role_anthorty_one >", value, "roleAnthortyOne");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyOneGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_one >=", value, "roleAnthortyOne");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyOneLessThan(Integer value) {
            addCriterion("role_anthorty_one <", value, "roleAnthortyOne");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyOneLessThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_one <=", value, "roleAnthortyOne");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyOneIn(List<Integer> values) {
            addCriterion("role_anthorty_one in", values, "roleAnthortyOne");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyOneNotIn(List<Integer> values) {
            addCriterion("role_anthorty_one not in", values, "roleAnthortyOne");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyOneBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_one between", value1, value2, "roleAnthortyOne");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyOneNotBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_one not between", value1, value2, "roleAnthortyOne");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyTwoIsNull() {
            addCriterion("role_anthorty_two is null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyTwoIsNotNull() {
            addCriterion("role_anthorty_two is not null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyTwoEqualTo(Integer value) {
            addCriterion("role_anthorty_two =", value, "roleAnthortyTwo");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyTwoNotEqualTo(Integer value) {
            addCriterion("role_anthorty_two <>", value, "roleAnthortyTwo");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyTwoGreaterThan(Integer value) {
            addCriterion("role_anthorty_two >", value, "roleAnthortyTwo");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyTwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_two >=", value, "roleAnthortyTwo");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyTwoLessThan(Integer value) {
            addCriterion("role_anthorty_two <", value, "roleAnthortyTwo");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyTwoLessThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_two <=", value, "roleAnthortyTwo");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyTwoIn(List<Integer> values) {
            addCriterion("role_anthorty_two in", values, "roleAnthortyTwo");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyTwoNotIn(List<Integer> values) {
            addCriterion("role_anthorty_two not in", values, "roleAnthortyTwo");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyTwoBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_two between", value1, value2, "roleAnthortyTwo");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyTwoNotBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_two not between", value1, value2, "roleAnthortyTwo");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyThreeIsNull() {
            addCriterion("role_anthorty_three is null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyThreeIsNotNull() {
            addCriterion("role_anthorty_three is not null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyThreeEqualTo(Integer value) {
            addCriterion("role_anthorty_three =", value, "roleAnthortyThree");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyThreeNotEqualTo(Integer value) {
            addCriterion("role_anthorty_three <>", value, "roleAnthortyThree");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyThreeGreaterThan(Integer value) {
            addCriterion("role_anthorty_three >", value, "roleAnthortyThree");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyThreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_three >=", value, "roleAnthortyThree");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyThreeLessThan(Integer value) {
            addCriterion("role_anthorty_three <", value, "roleAnthortyThree");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyThreeLessThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_three <=", value, "roleAnthortyThree");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyThreeIn(List<Integer> values) {
            addCriterion("role_anthorty_three in", values, "roleAnthortyThree");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyThreeNotIn(List<Integer> values) {
            addCriterion("role_anthorty_three not in", values, "roleAnthortyThree");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyThreeBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_three between", value1, value2, "roleAnthortyThree");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyThreeNotBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_three not between", value1, value2, "roleAnthortyThree");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFourIsNull() {
            addCriterion("role_anthorty_four is null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFourIsNotNull() {
            addCriterion("role_anthorty_four is not null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFourEqualTo(Integer value) {
            addCriterion("role_anthorty_four =", value, "roleAnthortyFour");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFourNotEqualTo(Integer value) {
            addCriterion("role_anthorty_four <>", value, "roleAnthortyFour");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFourGreaterThan(Integer value) {
            addCriterion("role_anthorty_four >", value, "roleAnthortyFour");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFourGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_four >=", value, "roleAnthortyFour");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFourLessThan(Integer value) {
            addCriterion("role_anthorty_four <", value, "roleAnthortyFour");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFourLessThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_four <=", value, "roleAnthortyFour");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFourIn(List<Integer> values) {
            addCriterion("role_anthorty_four in", values, "roleAnthortyFour");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFourNotIn(List<Integer> values) {
            addCriterion("role_anthorty_four not in", values, "roleAnthortyFour");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFourBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_four between", value1, value2, "roleAnthortyFour");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFourNotBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_four not between", value1, value2, "roleAnthortyFour");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFiveIsNull() {
            addCriterion("role_anthorty_five is null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFiveIsNotNull() {
            addCriterion("role_anthorty_five is not null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFiveEqualTo(Integer value) {
            addCriterion("role_anthorty_five =", value, "roleAnthortyFive");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFiveNotEqualTo(Integer value) {
            addCriterion("role_anthorty_five <>", value, "roleAnthortyFive");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFiveGreaterThan(Integer value) {
            addCriterion("role_anthorty_five >", value, "roleAnthortyFive");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_five >=", value, "roleAnthortyFive");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFiveLessThan(Integer value) {
            addCriterion("role_anthorty_five <", value, "roleAnthortyFive");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFiveLessThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_five <=", value, "roleAnthortyFive");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFiveIn(List<Integer> values) {
            addCriterion("role_anthorty_five in", values, "roleAnthortyFive");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFiveNotIn(List<Integer> values) {
            addCriterion("role_anthorty_five not in", values, "roleAnthortyFive");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFiveBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_five between", value1, value2, "roleAnthortyFive");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyFiveNotBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_five not between", value1, value2, "roleAnthortyFive");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySixIsNull() {
            addCriterion("role_anthorty_six is null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySixIsNotNull() {
            addCriterion("role_anthorty_six is not null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySixEqualTo(Integer value) {
            addCriterion("role_anthorty_six =", value, "roleAnthortySix");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySixNotEqualTo(Integer value) {
            addCriterion("role_anthorty_six <>", value, "roleAnthortySix");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySixGreaterThan(Integer value) {
            addCriterion("role_anthorty_six >", value, "roleAnthortySix");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySixGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_six >=", value, "roleAnthortySix");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySixLessThan(Integer value) {
            addCriterion("role_anthorty_six <", value, "roleAnthortySix");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySixLessThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_six <=", value, "roleAnthortySix");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySixIn(List<Integer> values) {
            addCriterion("role_anthorty_six in", values, "roleAnthortySix");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySixNotIn(List<Integer> values) {
            addCriterion("role_anthorty_six not in", values, "roleAnthortySix");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySixBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_six between", value1, value2, "roleAnthortySix");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySixNotBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_six not between", value1, value2, "roleAnthortySix");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySevenIsNull() {
            addCriterion("role_anthorty_seven is null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySevenIsNotNull() {
            addCriterion("role_anthorty_seven is not null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySevenEqualTo(Integer value) {
            addCriterion("role_anthorty_seven =", value, "roleAnthortySeven");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySevenNotEqualTo(Integer value) {
            addCriterion("role_anthorty_seven <>", value, "roleAnthortySeven");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySevenGreaterThan(Integer value) {
            addCriterion("role_anthorty_seven >", value, "roleAnthortySeven");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySevenGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_seven >=", value, "roleAnthortySeven");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySevenLessThan(Integer value) {
            addCriterion("role_anthorty_seven <", value, "roleAnthortySeven");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySevenLessThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_seven <=", value, "roleAnthortySeven");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySevenIn(List<Integer> values) {
            addCriterion("role_anthorty_seven in", values, "roleAnthortySeven");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySevenNotIn(List<Integer> values) {
            addCriterion("role_anthorty_seven not in", values, "roleAnthortySeven");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySevenBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_seven between", value1, value2, "roleAnthortySeven");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortySevenNotBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_seven not between", value1, value2, "roleAnthortySeven");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyEightIsNull() {
            addCriterion("role_anthorty_eight is null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyEightIsNotNull() {
            addCriterion("role_anthorty_eight is not null");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyEightEqualTo(Integer value) {
            addCriterion("role_anthorty_eight =", value, "roleAnthortyEight");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyEightNotEqualTo(Integer value) {
            addCriterion("role_anthorty_eight <>", value, "roleAnthortyEight");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyEightGreaterThan(Integer value) {
            addCriterion("role_anthorty_eight >", value, "roleAnthortyEight");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyEightGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_eight >=", value, "roleAnthortyEight");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyEightLessThan(Integer value) {
            addCriterion("role_anthorty_eight <", value, "roleAnthortyEight");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyEightLessThanOrEqualTo(Integer value) {
            addCriterion("role_anthorty_eight <=", value, "roleAnthortyEight");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyEightIn(List<Integer> values) {
            addCriterion("role_anthorty_eight in", values, "roleAnthortyEight");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyEightNotIn(List<Integer> values) {
            addCriterion("role_anthorty_eight not in", values, "roleAnthortyEight");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyEightBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_eight between", value1, value2, "roleAnthortyEight");
            return (Criteria) this;
        }

        public Criteria andRoleAnthortyEightNotBetween(Integer value1, Integer value2) {
            addCriterion("role_anthorty_eight not between", value1, value2, "roleAnthortyEight");
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