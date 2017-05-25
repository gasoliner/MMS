package cn.mms.po;

import java.util.ArrayList;
import java.util.List;

public class SystemddlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemddlExample() {
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

        public Criteria andSysidIsNull() {
            addCriterion("sysid is null");
            return (Criteria) this;
        }

        public Criteria andSysidIsNotNull() {
            addCriterion("sysid is not null");
            return (Criteria) this;
        }

        public Criteria andSysidEqualTo(Integer value) {
            addCriterion("sysid =", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotEqualTo(Integer value) {
            addCriterion("sysid <>", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThan(Integer value) {
            addCriterion("sysid >", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysid >=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThan(Integer value) {
            addCriterion("sysid <", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThanOrEqualTo(Integer value) {
            addCriterion("sysid <=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidIn(List<Integer> values) {
            addCriterion("sysid in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotIn(List<Integer> values) {
            addCriterion("sysid not in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidBetween(Integer value1, Integer value2) {
            addCriterion("sysid between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotBetween(Integer value1, Integer value2) {
            addCriterion("sysid not between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andDdlnameIsNull() {
            addCriterion("ddlName is null");
            return (Criteria) this;
        }

        public Criteria andDdlnameIsNotNull() {
            addCriterion("ddlName is not null");
            return (Criteria) this;
        }

        public Criteria andDdlnameEqualTo(String value) {
            addCriterion("ddlName =", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameNotEqualTo(String value) {
            addCriterion("ddlName <>", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameGreaterThan(String value) {
            addCriterion("ddlName >", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameGreaterThanOrEqualTo(String value) {
            addCriterion("ddlName >=", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameLessThan(String value) {
            addCriterion("ddlName <", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameLessThanOrEqualTo(String value) {
            addCriterion("ddlName <=", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameLike(String value) {
            addCriterion("ddlName like", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameNotLike(String value) {
            addCriterion("ddlName not like", value, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameIn(List<String> values) {
            addCriterion("ddlName in", values, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameNotIn(List<String> values) {
            addCriterion("ddlName not in", values, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameBetween(String value1, String value2) {
            addCriterion("ddlName between", value1, value2, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlnameNotBetween(String value1, String value2) {
            addCriterion("ddlName not between", value1, value2, "ddlname");
            return (Criteria) this;
        }

        public Criteria andDdlremarksIsNull() {
            addCriterion("ddlRemarks is null");
            return (Criteria) this;
        }

        public Criteria andDdlremarksIsNotNull() {
            addCriterion("ddlRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andDdlremarksEqualTo(String value) {
            addCriterion("ddlRemarks =", value, "ddlremarks");
            return (Criteria) this;
        }

        public Criteria andDdlremarksNotEqualTo(String value) {
            addCriterion("ddlRemarks <>", value, "ddlremarks");
            return (Criteria) this;
        }

        public Criteria andDdlremarksGreaterThan(String value) {
            addCriterion("ddlRemarks >", value, "ddlremarks");
            return (Criteria) this;
        }

        public Criteria andDdlremarksGreaterThanOrEqualTo(String value) {
            addCriterion("ddlRemarks >=", value, "ddlremarks");
            return (Criteria) this;
        }

        public Criteria andDdlremarksLessThan(String value) {
            addCriterion("ddlRemarks <", value, "ddlremarks");
            return (Criteria) this;
        }

        public Criteria andDdlremarksLessThanOrEqualTo(String value) {
            addCriterion("ddlRemarks <=", value, "ddlremarks");
            return (Criteria) this;
        }

        public Criteria andDdlremarksLike(String value) {
            addCriterion("ddlRemarks like", value, "ddlremarks");
            return (Criteria) this;
        }

        public Criteria andDdlremarksNotLike(String value) {
            addCriterion("ddlRemarks not like", value, "ddlremarks");
            return (Criteria) this;
        }

        public Criteria andDdlremarksIn(List<String> values) {
            addCriterion("ddlRemarks in", values, "ddlremarks");
            return (Criteria) this;
        }

        public Criteria andDdlremarksNotIn(List<String> values) {
            addCriterion("ddlRemarks not in", values, "ddlremarks");
            return (Criteria) this;
        }

        public Criteria andDdlremarksBetween(String value1, String value2) {
            addCriterion("ddlRemarks between", value1, value2, "ddlremarks");
            return (Criteria) this;
        }

        public Criteria andDdlremarksNotBetween(String value1, String value2) {
            addCriterion("ddlRemarks not between", value1, value2, "ddlremarks");
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