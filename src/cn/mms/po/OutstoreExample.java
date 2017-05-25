package cn.mms.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OutstoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutstoreExample() {
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

        public Criteria andOsidIsNull() {
            addCriterion("osid is null");
            return (Criteria) this;
        }

        public Criteria andOsidIsNotNull() {
            addCriterion("osid is not null");
            return (Criteria) this;
        }

        public Criteria andOsidEqualTo(Integer value) {
            addCriterion("osid =", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotEqualTo(Integer value) {
            addCriterion("osid <>", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThan(Integer value) {
            addCriterion("osid >", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("osid >=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThan(Integer value) {
            addCriterion("osid <", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThanOrEqualTo(Integer value) {
            addCriterion("osid <=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidIn(List<Integer> values) {
            addCriterion("osid in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotIn(List<Integer> values) {
            addCriterion("osid not in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidBetween(Integer value1, Integer value2) {
            addCriterion("osid between", value1, value2, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotBetween(Integer value1, Integer value2) {
            addCriterion("osid not between", value1, value2, "osid");
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

        public Criteria andOutwayIsNull() {
            addCriterion("outway is null");
            return (Criteria) this;
        }

        public Criteria andOutwayIsNotNull() {
            addCriterion("outway is not null");
            return (Criteria) this;
        }

        public Criteria andOutwayEqualTo(String value) {
            addCriterion("outway =", value, "outway");
            return (Criteria) this;
        }

        public Criteria andOutwayNotEqualTo(String value) {
            addCriterion("outway <>", value, "outway");
            return (Criteria) this;
        }

        public Criteria andOutwayGreaterThan(String value) {
            addCriterion("outway >", value, "outway");
            return (Criteria) this;
        }

        public Criteria andOutwayGreaterThanOrEqualTo(String value) {
            addCriterion("outway >=", value, "outway");
            return (Criteria) this;
        }

        public Criteria andOutwayLessThan(String value) {
            addCriterion("outway <", value, "outway");
            return (Criteria) this;
        }

        public Criteria andOutwayLessThanOrEqualTo(String value) {
            addCriterion("outway <=", value, "outway");
            return (Criteria) this;
        }

        public Criteria andOutwayLike(String value) {
            addCriterion("outway like", value, "outway");
            return (Criteria) this;
        }

        public Criteria andOutwayNotLike(String value) {
            addCriterion("outway not like", value, "outway");
            return (Criteria) this;
        }

        public Criteria andOutwayIn(List<String> values) {
            addCriterion("outway in", values, "outway");
            return (Criteria) this;
        }

        public Criteria andOutwayNotIn(List<String> values) {
            addCriterion("outway not in", values, "outway");
            return (Criteria) this;
        }

        public Criteria andOutwayBetween(String value1, String value2) {
            addCriterion("outway between", value1, value2, "outway");
            return (Criteria) this;
        }

        public Criteria andOutwayNotBetween(String value1, String value2) {
            addCriterion("outway not between", value1, value2, "outway");
            return (Criteria) this;
        }

        public Criteria andLiableIsNull() {
            addCriterion("liable is null");
            return (Criteria) this;
        }

        public Criteria andLiableIsNotNull() {
            addCriterion("liable is not null");
            return (Criteria) this;
        }

        public Criteria andLiableEqualTo(String value) {
            addCriterion("liable =", value, "liable");
            return (Criteria) this;
        }

        public Criteria andLiableNotEqualTo(String value) {
            addCriterion("liable <>", value, "liable");
            return (Criteria) this;
        }

        public Criteria andLiableGreaterThan(String value) {
            addCriterion("liable >", value, "liable");
            return (Criteria) this;
        }

        public Criteria andLiableGreaterThanOrEqualTo(String value) {
            addCriterion("liable >=", value, "liable");
            return (Criteria) this;
        }

        public Criteria andLiableLessThan(String value) {
            addCriterion("liable <", value, "liable");
            return (Criteria) this;
        }

        public Criteria andLiableLessThanOrEqualTo(String value) {
            addCriterion("liable <=", value, "liable");
            return (Criteria) this;
        }

        public Criteria andLiableLike(String value) {
            addCriterion("liable like", value, "liable");
            return (Criteria) this;
        }

        public Criteria andLiableNotLike(String value) {
            addCriterion("liable not like", value, "liable");
            return (Criteria) this;
        }

        public Criteria andLiableIn(List<String> values) {
            addCriterion("liable in", values, "liable");
            return (Criteria) this;
        }

        public Criteria andLiableNotIn(List<String> values) {
            addCriterion("liable not in", values, "liable");
            return (Criteria) this;
        }

        public Criteria andLiableBetween(String value1, String value2) {
            addCriterion("liable between", value1, value2, "liable");
            return (Criteria) this;
        }

        public Criteria andLiableNotBetween(String value1, String value2) {
            addCriterion("liable not between", value1, value2, "liable");
            return (Criteria) this;
        }

        public Criteria andUseobjectIsNull() {
            addCriterion("useobject is null");
            return (Criteria) this;
        }

        public Criteria andUseobjectIsNotNull() {
            addCriterion("useobject is not null");
            return (Criteria) this;
        }

        public Criteria andUseobjectEqualTo(String value) {
            addCriterion("useobject =", value, "useobject");
            return (Criteria) this;
        }

        public Criteria andUseobjectNotEqualTo(String value) {
            addCriterion("useobject <>", value, "useobject");
            return (Criteria) this;
        }

        public Criteria andUseobjectGreaterThan(String value) {
            addCriterion("useobject >", value, "useobject");
            return (Criteria) this;
        }

        public Criteria andUseobjectGreaterThanOrEqualTo(String value) {
            addCriterion("useobject >=", value, "useobject");
            return (Criteria) this;
        }

        public Criteria andUseobjectLessThan(String value) {
            addCriterion("useobject <", value, "useobject");
            return (Criteria) this;
        }

        public Criteria andUseobjectLessThanOrEqualTo(String value) {
            addCriterion("useobject <=", value, "useobject");
            return (Criteria) this;
        }

        public Criteria andUseobjectLike(String value) {
            addCriterion("useobject like", value, "useobject");
            return (Criteria) this;
        }

        public Criteria andUseobjectNotLike(String value) {
            addCriterion("useobject not like", value, "useobject");
            return (Criteria) this;
        }

        public Criteria andUseobjectIn(List<String> values) {
            addCriterion("useobject in", values, "useobject");
            return (Criteria) this;
        }

        public Criteria andUseobjectNotIn(List<String> values) {
            addCriterion("useobject not in", values, "useobject");
            return (Criteria) this;
        }

        public Criteria andUseobjectBetween(String value1, String value2) {
            addCriterion("useobject between", value1, value2, "useobject");
            return (Criteria) this;
        }

        public Criteria andUseobjectNotBetween(String value1, String value2) {
            addCriterion("useobject not between", value1, value2, "useobject");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNull() {
            addCriterion("outtime is null");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNotNull() {
            addCriterion("outtime is not null");
            return (Criteria) this;
        }

        public Criteria andOuttimeEqualTo(Date value) {
            addCriterionForJDBCDate("outtime =", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("outtime <>", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("outtime >", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outtime >=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThan(Date value) {
            addCriterionForJDBCDate("outtime <", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outtime <=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeIn(List<Date> values) {
            addCriterionForJDBCDate("outtime in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("outtime not in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outtime between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outtime not between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andIsreturnIsNull() {
            addCriterion("isreturn is null");
            return (Criteria) this;
        }

        public Criteria andIsreturnIsNotNull() {
            addCriterion("isreturn is not null");
            return (Criteria) this;
        }

        public Criteria andIsreturnEqualTo(Integer value) {
            addCriterion("isreturn =", value, "isreturn");
            return (Criteria) this;
        }

        public Criteria andIsreturnNotEqualTo(Integer value) {
            addCriterion("isreturn <>", value, "isreturn");
            return (Criteria) this;
        }

        public Criteria andIsreturnGreaterThan(Integer value) {
            addCriterion("isreturn >", value, "isreturn");
            return (Criteria) this;
        }

        public Criteria andIsreturnGreaterThanOrEqualTo(Integer value) {
            addCriterion("isreturn >=", value, "isreturn");
            return (Criteria) this;
        }

        public Criteria andIsreturnLessThan(Integer value) {
            addCriterion("isreturn <", value, "isreturn");
            return (Criteria) this;
        }

        public Criteria andIsreturnLessThanOrEqualTo(Integer value) {
            addCriterion("isreturn <=", value, "isreturn");
            return (Criteria) this;
        }

        public Criteria andIsreturnIn(List<Integer> values) {
            addCriterion("isreturn in", values, "isreturn");
            return (Criteria) this;
        }

        public Criteria andIsreturnNotIn(List<Integer> values) {
            addCriterion("isreturn not in", values, "isreturn");
            return (Criteria) this;
        }

        public Criteria andIsreturnBetween(Integer value1, Integer value2) {
            addCriterion("isreturn between", value1, value2, "isreturn");
            return (Criteria) this;
        }

        public Criteria andIsreturnNotBetween(Integer value1, Integer value2) {
            addCriterion("isreturn not between", value1, value2, "isreturn");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNull() {
            addCriterion("returntime is null");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNotNull() {
            addCriterion("returntime is not null");
            return (Criteria) this;
        }

        public Criteria andReturntimeEqualTo(Date value) {
            addCriterionForJDBCDate("returntime =", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("returntime <>", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThan(Date value) {
            addCriterionForJDBCDate("returntime >", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("returntime >=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThan(Date value) {
            addCriterionForJDBCDate("returntime <", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("returntime <=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIn(List<Date> values) {
            addCriterionForJDBCDate("returntime in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("returntime not in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("returntime between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("returntime not between", value1, value2, "returntime");
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