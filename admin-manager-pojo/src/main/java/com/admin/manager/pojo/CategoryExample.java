package com.admin.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Long value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Long value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Long value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Long value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Long value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Long> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Long> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Long value1, Long value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Long value1, Long value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCKeyIsNull() {
            addCriterion("c_key is null");
            return (Criteria) this;
        }

        public Criteria andCKeyIsNotNull() {
            addCriterion("c_key is not null");
            return (Criteria) this;
        }

        public Criteria andCKeyEqualTo(String value) {
            addCriterion("c_key =", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyNotEqualTo(String value) {
            addCriterion("c_key <>", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyGreaterThan(String value) {
            addCriterion("c_key >", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyGreaterThanOrEqualTo(String value) {
            addCriterion("c_key >=", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyLessThan(String value) {
            addCriterion("c_key <", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyLessThanOrEqualTo(String value) {
            addCriterion("c_key <=", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyLike(String value) {
            addCriterion("c_key like", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyNotLike(String value) {
            addCriterion("c_key not like", value, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyIn(List<String> values) {
            addCriterion("c_key in", values, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyNotIn(List<String> values) {
            addCriterion("c_key not in", values, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyBetween(String value1, String value2) {
            addCriterion("c_key between", value1, value2, "cKey");
            return (Criteria) this;
        }

        public Criteria andCKeyNotBetween(String value1, String value2) {
            addCriterion("c_key not between", value1, value2, "cKey");
            return (Criteria) this;
        }

        public Criteria andCValueIsNull() {
            addCriterion("c_value is null");
            return (Criteria) this;
        }

        public Criteria andCValueIsNotNull() {
            addCriterion("c_value is not null");
            return (Criteria) this;
        }

        public Criteria andCValueEqualTo(String value) {
            addCriterion("c_value =", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotEqualTo(String value) {
            addCriterion("c_value <>", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueGreaterThan(String value) {
            addCriterion("c_value >", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueGreaterThanOrEqualTo(String value) {
            addCriterion("c_value >=", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueLessThan(String value) {
            addCriterion("c_value <", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueLessThanOrEqualTo(String value) {
            addCriterion("c_value <=", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueLike(String value) {
            addCriterion("c_value like", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotLike(String value) {
            addCriterion("c_value not like", value, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueIn(List<String> values) {
            addCriterion("c_value in", values, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotIn(List<String> values) {
            addCriterion("c_value not in", values, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueBetween(String value1, String value2) {
            addCriterion("c_value between", value1, value2, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValueNotBetween(String value1, String value2) {
            addCriterion("c_value not between", value1, value2, "cValue");
            return (Criteria) this;
        }

        public Criteria andCValidIsNull() {
            addCriterion("c_valid is null");
            return (Criteria) this;
        }

        public Criteria andCValidIsNotNull() {
            addCriterion("c_valid is not null");
            return (Criteria) this;
        }

        public Criteria andCValidEqualTo(Integer value) {
            addCriterion("c_valid =", value, "cValid");
            return (Criteria) this;
        }

        public Criteria andCValidNotEqualTo(Integer value) {
            addCriterion("c_valid <>", value, "cValid");
            return (Criteria) this;
        }

        public Criteria andCValidGreaterThan(Integer value) {
            addCriterion("c_valid >", value, "cValid");
            return (Criteria) this;
        }

        public Criteria andCValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_valid >=", value, "cValid");
            return (Criteria) this;
        }

        public Criteria andCValidLessThan(Integer value) {
            addCriterion("c_valid <", value, "cValid");
            return (Criteria) this;
        }

        public Criteria andCValidLessThanOrEqualTo(Integer value) {
            addCriterion("c_valid <=", value, "cValid");
            return (Criteria) this;
        }

        public Criteria andCValidIn(List<Integer> values) {
            addCriterion("c_valid in", values, "cValid");
            return (Criteria) this;
        }

        public Criteria andCValidNotIn(List<Integer> values) {
            addCriterion("c_valid not in", values, "cValid");
            return (Criteria) this;
        }

        public Criteria andCValidBetween(Integer value1, Integer value2) {
            addCriterion("c_valid between", value1, value2, "cValid");
            return (Criteria) this;
        }

        public Criteria andCValidNotBetween(Integer value1, Integer value2) {
            addCriterion("c_valid not between", value1, value2, "cValid");
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