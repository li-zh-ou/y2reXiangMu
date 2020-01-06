package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamExample() {
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

        public Criteria andStuidIsNull() {
            addCriterion("stuid is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuid =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuid <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuid >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuid >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuid <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuid <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuid in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuid not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuid between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuid not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andKeidIsNull() {
            addCriterion("keid is null");
            return (Criteria) this;
        }

        public Criteria andKeidIsNotNull() {
            addCriterion("keid is not null");
            return (Criteria) this;
        }

        public Criteria andKeidEqualTo(Integer value) {
            addCriterion("keid =", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidNotEqualTo(Integer value) {
            addCriterion("keid <>", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidGreaterThan(Integer value) {
            addCriterion("keid >", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("keid >=", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidLessThan(Integer value) {
            addCriterion("keid <", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidLessThanOrEqualTo(Integer value) {
            addCriterion("keid <=", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidIn(List<Integer> values) {
            addCriterion("keid in", values, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidNotIn(List<Integer> values) {
            addCriterion("keid not in", values, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidBetween(Integer value1, Integer value2) {
            addCriterion("keid between", value1, value2, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidNotBetween(Integer value1, Integer value2) {
            addCriterion("keid not between", value1, value2, "keid");
            return (Criteria) this;
        }

        public Criteria andExamscoreIsNull() {
            addCriterion("examscore is null");
            return (Criteria) this;
        }

        public Criteria andExamscoreIsNotNull() {
            addCriterion("examscore is not null");
            return (Criteria) this;
        }

        public Criteria andExamscoreEqualTo(Integer value) {
            addCriterion("examscore =", value, "examscore");
            return (Criteria) this;
        }

        public Criteria andExamscoreNotEqualTo(Integer value) {
            addCriterion("examscore <>", value, "examscore");
            return (Criteria) this;
        }

        public Criteria andExamscoreGreaterThan(Integer value) {
            addCriterion("examscore >", value, "examscore");
            return (Criteria) this;
        }

        public Criteria andExamscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("examscore >=", value, "examscore");
            return (Criteria) this;
        }

        public Criteria andExamscoreLessThan(Integer value) {
            addCriterion("examscore <", value, "examscore");
            return (Criteria) this;
        }

        public Criteria andExamscoreLessThanOrEqualTo(Integer value) {
            addCriterion("examscore <=", value, "examscore");
            return (Criteria) this;
        }

        public Criteria andExamscoreIn(List<Integer> values) {
            addCriterion("examscore in", values, "examscore");
            return (Criteria) this;
        }

        public Criteria andExamscoreNotIn(List<Integer> values) {
            addCriterion("examscore not in", values, "examscore");
            return (Criteria) this;
        }

        public Criteria andExamscoreBetween(Integer value1, Integer value2) {
            addCriterion("examscore between", value1, value2, "examscore");
            return (Criteria) this;
        }

        public Criteria andExamscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("examscore not between", value1, value2, "examscore");
            return (Criteria) this;
        }

        public Criteria andExamtimeIsNull() {
            addCriterion("examtime is null");
            return (Criteria) this;
        }

        public Criteria andExamtimeIsNotNull() {
            addCriterion("examtime is not null");
            return (Criteria) this;
        }

        public Criteria andExamtimeEqualTo(Date value) {
            addCriterion("examtime =", value, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeNotEqualTo(Date value) {
            addCriterion("examtime <>", value, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeGreaterThan(Date value) {
            addCriterion("examtime >", value, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("examtime >=", value, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeLessThan(Date value) {
            addCriterion("examtime <", value, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeLessThanOrEqualTo(Date value) {
            addCriterion("examtime <=", value, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeIn(List<Date> values) {
            addCriterion("examtime in", values, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeNotIn(List<Date> values) {
            addCriterion("examtime not in", values, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeBetween(Date value1, Date value2) {
            addCriterion("examtime between", value1, value2, "examtime");
            return (Criteria) this;
        }

        public Criteria andExamtimeNotBetween(Date value1, Date value2) {
            addCriterion("examtime not between", value1, value2, "examtime");
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