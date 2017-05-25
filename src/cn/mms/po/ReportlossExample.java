package cn.mms.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportlossExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportlossExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRlidIsNull() {
            addCriterion("rlid is null");
            return (Criteria) this;
        }

        public Criteria andRlidIsNotNull() {
            addCriterion("rlid is not null");
            return (Criteria) this;
        }

        public Criteria andRlidEqualTo(Integer value) {
            addCriterion("rlid =", value, "rlid");
            return (Criteria) this;
        }

        public Criteria andRlidNotEqualTo(Integer value) {
            addCriterion("rlid <>", value, "rlid");
            return (Criteria) this;
        }

        public Criteria andRlidGreaterThan(Integer value) {
            addCriterion("rlid >", value, "rlid");
            return (Criteria) this;
        }

        public Criteria andRlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rlid >=", value, "rlid");
            return (Criteria) this;
        }

        public Criteria andRlidLessThan(Integer value) {
            addCriterion("rlid <", value, "rlid");
            return (Criteria) this;
        }

        public Criteria andRlidLessThanOrEqualTo(Integer value) {
            addCriterion("rlid <=", value, "rlid");
            return (Criteria) this;
        }

        public Criteria andRlidIn(List<Integer> values) {
            addCriterion("rlid in", values, "rlid");
            return (Criteria) this;
        }

        public Criteria andRlidNotIn(List<Integer> values) {
            addCriterion("rlid not in", values, "rlid");
            return (Criteria) this;
        }

        public Criteria andRlidBetween(Integer value1, Integer value2) {
            addCriterion("rlid between", value1, value2, "rlid");
            return (Criteria) this;
        }

        public Criteria andRlidNotBetween(Integer value1, Integer value2) {
            addCriterion("rlid not between", value1, value2, "rlid");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andRpobjectIsNull() {
            addCriterion("rpobject is null");
            return (Criteria) this;
        }

        public Criteria andRpobjectIsNotNull() {
            addCriterion("rpobject is not null");
            return (Criteria) this;
        }

        public Criteria andRpobjectEqualTo(String value) {
            addCriterion("rpobject =", value, "rpobject");
            return (Criteria) this;
        }

        public Criteria andRpobjectNotEqualTo(String value) {
            addCriterion("rpobject <>", value, "rpobject");
            return (Criteria) this;
        }

        public Criteria andRpobjectGreaterThan(String value) {
            addCriterion("rpobject >", value, "rpobject");
            return (Criteria) this;
        }

        public Criteria andRpobjectGreaterThanOrEqualTo(String value) {
            addCriterion("rpobject >=", value, "rpobject");
            return (Criteria) this;
        }

        public Criteria andRpobjectLessThan(String value) {
            addCriterion("rpobject <", value, "rpobject");
            return (Criteria) this;
        }

        public Criteria andRpobjectLessThanOrEqualTo(String value) {
            addCriterion("rpobject <=", value, "rpobject");
            return (Criteria) this;
        }

        public Criteria andRpobjectLike(String value) {
            addCriterion("rpobject like", value, "rpobject");
            return (Criteria) this;
        }

        public Criteria andRpobjectNotLike(String value) {
            addCriterion("rpobject not like", value, "rpobject");
            return (Criteria) this;
        }

        public Criteria andRpobjectIn(List<String> values) {
            addCriterion("rpobject in", values, "rpobject");
            return (Criteria) this;
        }

        public Criteria andRpobjectNotIn(List<String> values) {
            addCriterion("rpobject not in", values, "rpobject");
            return (Criteria) this;
        }

        public Criteria andRpobjectBetween(String value1, String value2) {
            addCriterion("rpobject between", value1, value2, "rpobject");
            return (Criteria) this;
        }

        public Criteria andRpobjectNotBetween(String value1, String value2) {
            addCriterion("rpobject not between", value1, value2, "rpobject");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Float value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Float value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Float value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Float value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Float value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Float value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Float> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Float> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Float value1, Float value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Float value1, Float value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andRptimeIsNull() {
            addCriterion("rptime is null");
            return (Criteria) this;
        }

        public Criteria andRptimeIsNotNull() {
            addCriterion("rptime is not null");
            return (Criteria) this;
        }

        public Criteria andRptimeEqualTo(Date value) {
            addCriterionForJDBCDate("rptime =", value, "rptime");
            return (Criteria) this;
        }

        public Criteria andRptimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("rptime <>", value, "rptime");
            return (Criteria) this;
        }

        public Criteria andRptimeGreaterThan(Date value) {
            addCriterionForJDBCDate("rptime >", value, "rptime");
            return (Criteria) this;
        }

        public Criteria andRptimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rptime >=", value, "rptime");
            return (Criteria) this;
        }

        public Criteria andRptimeLessThan(Date value) {
            addCriterionForJDBCDate("rptime <", value, "rptime");
            return (Criteria) this;
        }

        public Criteria andRptimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rptime <=", value, "rptime");
            return (Criteria) this;
        }

        public Criteria andRptimeIn(List<Date> values) {
            addCriterionForJDBCDate("rptime in", values, "rptime");
            return (Criteria) this;
        }

        public Criteria andRptimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("rptime not in", values, "rptime");
            return (Criteria) this;
        }

        public Criteria andRptimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rptime between", value1, value2, "rptime");
            return (Criteria) this;
        }

        public Criteria andRptimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rptime not between", value1, value2, "rptime");
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