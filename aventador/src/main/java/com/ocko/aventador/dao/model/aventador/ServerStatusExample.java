package com.ocko.aventador.dao.model.aventador;

import java.util.ArrayList;
import java.util.List;

public class ServerStatusExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table {0}
     *
     * @mbggenerated
     */
    private Integer limit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table {0}
     *
     * @mbggenerated
     */
    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    public ServerStatusExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table {0}
     *
     * @mbggenerated
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table {0}
     *
     * @mbggenerated
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table {0}
     *
     * @mbggenerated
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table {0}
     *
     * @mbggenerated
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andStatusCodeIsNull() {
            addCriterion("status_code is null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNotNull() {
            addCriterion("status_code is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeEqualTo(String value) {
            addCriterion("status_code =", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotEqualTo(String value) {
            addCriterion("status_code <>", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThan(String value) {
            addCriterion("status_code >", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("status_code >=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThan(String value) {
            addCriterion("status_code <", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThanOrEqualTo(String value) {
            addCriterion("status_code <=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLike(String value) {
            addCriterion("status_code like", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotLike(String value) {
            addCriterion("status_code not like", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIn(List<String> values) {
            addCriterion("status_code in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotIn(List<String> values) {
            addCriterion("status_code not in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeBetween(String value1, String value2) {
            addCriterion("status_code between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotBetween(String value1, String value2) {
            addCriterion("status_code not between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusValueIsNull() {
            addCriterion("status_value is null");
            return (Criteria) this;
        }

        public Criteria andStatusValueIsNotNull() {
            addCriterion("status_value is not null");
            return (Criteria) this;
        }

        public Criteria andStatusValueEqualTo(String value) {
            addCriterion("status_value =", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueNotEqualTo(String value) {
            addCriterion("status_value <>", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueGreaterThan(String value) {
            addCriterion("status_value >", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueGreaterThanOrEqualTo(String value) {
            addCriterion("status_value >=", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueLessThan(String value) {
            addCriterion("status_value <", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueLessThanOrEqualTo(String value) {
            addCriterion("status_value <=", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueLike(String value) {
            addCriterion("status_value like", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueNotLike(String value) {
            addCriterion("status_value not like", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueIn(List<String> values) {
            addCriterion("status_value in", values, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueNotIn(List<String> values) {
            addCriterion("status_value not in", values, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueBetween(String value1, String value2) {
            addCriterion("status_value between", value1, value2, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueNotBetween(String value1, String value2) {
            addCriterion("status_value not between", value1, value2, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionIsNull() {
            addCriterion("status_description is null");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionIsNotNull() {
            addCriterion("status_description is not null");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionEqualTo(String value) {
            addCriterion("status_description =", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionNotEqualTo(String value) {
            addCriterion("status_description <>", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionGreaterThan(String value) {
            addCriterion("status_description >", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("status_description >=", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionLessThan(String value) {
            addCriterion("status_description <", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionLessThanOrEqualTo(String value) {
            addCriterion("status_description <=", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionLike(String value) {
            addCriterion("status_description like", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionNotLike(String value) {
            addCriterion("status_description not like", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionIn(List<String> values) {
            addCriterion("status_description in", values, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionNotIn(List<String> values) {
            addCriterion("status_description not in", values, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionBetween(String value1, String value2) {
            addCriterion("status_description between", value1, value2, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionNotBetween(String value1, String value2) {
            addCriterion("status_description not between", value1, value2, "statusDescription");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aventador.server_status
     *
     * @mbg.generated do_not_delete_during_merge Wed Mar 29 11:58:10 KST 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aventador.server_status
     *
     * @mbg.generated Wed Mar 29 11:58:10 KST 2023
     */
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