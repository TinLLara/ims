package com.cxsl.ims.impl.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OaHolidayapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OaHolidayapplyExample() {
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

        public Criteria andHapplyidIsNull() {
            addCriterion("happlyId is null");
            return (Criteria) this;
        }

        public Criteria andHapplyidIsNotNull() {
            addCriterion("happlyId is not null");
            return (Criteria) this;
        }

        public Criteria andHapplyidEqualTo(String value) {
            addCriterion("happlyId =", value, "happlyid");
            return (Criteria) this;
        }

        public Criteria andHapplyidNotEqualTo(String value) {
            addCriterion("happlyId <>", value, "happlyid");
            return (Criteria) this;
        }

        public Criteria andHapplyidGreaterThan(String value) {
            addCriterion("happlyId >", value, "happlyid");
            return (Criteria) this;
        }

        public Criteria andHapplyidGreaterThanOrEqualTo(String value) {
            addCriterion("happlyId >=", value, "happlyid");
            return (Criteria) this;
        }

        public Criteria andHapplyidLessThan(String value) {
            addCriterion("happlyId <", value, "happlyid");
            return (Criteria) this;
        }

        public Criteria andHapplyidLessThanOrEqualTo(String value) {
            addCriterion("happlyId <=", value, "happlyid");
            return (Criteria) this;
        }

        public Criteria andHapplyidLike(String value) {
            addCriterion("happlyId like", value, "happlyid");
            return (Criteria) this;
        }

        public Criteria andHapplyidNotLike(String value) {
            addCriterion("happlyId not like", value, "happlyid");
            return (Criteria) this;
        }

        public Criteria andHapplyidIn(List<String> values) {
            addCriterion("happlyId in", values, "happlyid");
            return (Criteria) this;
        }

        public Criteria andHapplyidNotIn(List<String> values) {
            addCriterion("happlyId not in", values, "happlyid");
            return (Criteria) this;
        }

        public Criteria andHapplyidBetween(String value1, String value2) {
            addCriterion("happlyId between", value1, value2, "happlyid");
            return (Criteria) this;
        }

        public Criteria andHapplyidNotBetween(String value1, String value2) {
            addCriterion("happlyId not between", value1, value2, "happlyid");
            return (Criteria) this;
        }

        public Criteria andApplypersonIsNull() {
            addCriterion("applyPerson is null");
            return (Criteria) this;
        }

        public Criteria andApplypersonIsNotNull() {
            addCriterion("applyPerson is not null");
            return (Criteria) this;
        }

        public Criteria andApplypersonEqualTo(String value) {
            addCriterion("applyPerson =", value, "applyperson");
            return (Criteria) this;
        }

        public Criteria andApplypersonNotEqualTo(String value) {
            addCriterion("applyPerson <>", value, "applyperson");
            return (Criteria) this;
        }

        public Criteria andApplypersonGreaterThan(String value) {
            addCriterion("applyPerson >", value, "applyperson");
            return (Criteria) this;
        }

        public Criteria andApplypersonGreaterThanOrEqualTo(String value) {
            addCriterion("applyPerson >=", value, "applyperson");
            return (Criteria) this;
        }

        public Criteria andApplypersonLessThan(String value) {
            addCriterion("applyPerson <", value, "applyperson");
            return (Criteria) this;
        }

        public Criteria andApplypersonLessThanOrEqualTo(String value) {
            addCriterion("applyPerson <=", value, "applyperson");
            return (Criteria) this;
        }

        public Criteria andApplypersonLike(String value) {
            addCriterion("applyPerson like", value, "applyperson");
            return (Criteria) this;
        }

        public Criteria andApplypersonNotLike(String value) {
            addCriterion("applyPerson not like", value, "applyperson");
            return (Criteria) this;
        }

        public Criteria andApplypersonIn(List<String> values) {
            addCriterion("applyPerson in", values, "applyperson");
            return (Criteria) this;
        }

        public Criteria andApplypersonNotIn(List<String> values) {
            addCriterion("applyPerson not in", values, "applyperson");
            return (Criteria) this;
        }

        public Criteria andApplypersonBetween(String value1, String value2) {
            addCriterion("applyPerson between", value1, value2, "applyperson");
            return (Criteria) this;
        }

        public Criteria andApplypersonNotBetween(String value1, String value2) {
            addCriterion("applyPerson not between", value1, value2, "applyperson");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("applyTime is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("applyTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Date value) {
            addCriterion("applyTime =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Date value) {
            addCriterion("applyTime <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Date value) {
            addCriterion("applyTime >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("applyTime >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Date value) {
            addCriterion("applyTime <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Date value) {
            addCriterion("applyTime <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<Date> values) {
            addCriterion("applyTime in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<Date> values) {
            addCriterion("applyTime not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Date value1, Date value2) {
            addCriterion("applyTime between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Date value1, Date value2) {
            addCriterion("applyTime not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andBelongdeptIsNull() {
            addCriterion("belongDept is null");
            return (Criteria) this;
        }

        public Criteria andBelongdeptIsNotNull() {
            addCriterion("belongDept is not null");
            return (Criteria) this;
        }

        public Criteria andBelongdeptEqualTo(String value) {
            addCriterion("belongDept =", value, "belongdept");
            return (Criteria) this;
        }

        public Criteria andBelongdeptNotEqualTo(String value) {
            addCriterion("belongDept <>", value, "belongdept");
            return (Criteria) this;
        }

        public Criteria andBelongdeptGreaterThan(String value) {
            addCriterion("belongDept >", value, "belongdept");
            return (Criteria) this;
        }

        public Criteria andBelongdeptGreaterThanOrEqualTo(String value) {
            addCriterion("belongDept >=", value, "belongdept");
            return (Criteria) this;
        }

        public Criteria andBelongdeptLessThan(String value) {
            addCriterion("belongDept <", value, "belongdept");
            return (Criteria) this;
        }

        public Criteria andBelongdeptLessThanOrEqualTo(String value) {
            addCriterion("belongDept <=", value, "belongdept");
            return (Criteria) this;
        }

        public Criteria andBelongdeptLike(String value) {
            addCriterion("belongDept like", value, "belongdept");
            return (Criteria) this;
        }

        public Criteria andBelongdeptNotLike(String value) {
            addCriterion("belongDept not like", value, "belongdept");
            return (Criteria) this;
        }

        public Criteria andBelongdeptIn(List<String> values) {
            addCriterion("belongDept in", values, "belongdept");
            return (Criteria) this;
        }

        public Criteria andBelongdeptNotIn(List<String> values) {
            addCriterion("belongDept not in", values, "belongdept");
            return (Criteria) this;
        }

        public Criteria andBelongdeptBetween(String value1, String value2) {
            addCriterion("belongDept between", value1, value2, "belongdept");
            return (Criteria) this;
        }

        public Criteria andBelongdeptNotBetween(String value1, String value2) {
            addCriterion("belongDept not between", value1, value2, "belongdept");
            return (Criteria) this;
        }

        public Criteria andStaffnumIsNull() {
            addCriterion("staffNum is null");
            return (Criteria) this;
        }

        public Criteria andStaffnumIsNotNull() {
            addCriterion("staffNum is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnumEqualTo(String value) {
            addCriterion("staffNum =", value, "staffnum");
            return (Criteria) this;
        }

        public Criteria andStaffnumNotEqualTo(String value) {
            addCriterion("staffNum <>", value, "staffnum");
            return (Criteria) this;
        }

        public Criteria andStaffnumGreaterThan(String value) {
            addCriterion("staffNum >", value, "staffnum");
            return (Criteria) this;
        }

        public Criteria andStaffnumGreaterThanOrEqualTo(String value) {
            addCriterion("staffNum >=", value, "staffnum");
            return (Criteria) this;
        }

        public Criteria andStaffnumLessThan(String value) {
            addCriterion("staffNum <", value, "staffnum");
            return (Criteria) this;
        }

        public Criteria andStaffnumLessThanOrEqualTo(String value) {
            addCriterion("staffNum <=", value, "staffnum");
            return (Criteria) this;
        }

        public Criteria andStaffnumLike(String value) {
            addCriterion("staffNum like", value, "staffnum");
            return (Criteria) this;
        }

        public Criteria andStaffnumNotLike(String value) {
            addCriterion("staffNum not like", value, "staffnum");
            return (Criteria) this;
        }

        public Criteria andStaffnumIn(List<String> values) {
            addCriterion("staffNum in", values, "staffnum");
            return (Criteria) this;
        }

        public Criteria andStaffnumNotIn(List<String> values) {
            addCriterion("staffNum not in", values, "staffnum");
            return (Criteria) this;
        }

        public Criteria andStaffnumBetween(String value1, String value2) {
            addCriterion("staffNum between", value1, value2, "staffnum");
            return (Criteria) this;
        }

        public Criteria andStaffnumNotBetween(String value1, String value2) {
            addCriterion("staffNum not between", value1, value2, "staffnum");
            return (Criteria) this;
        }

        public Criteria andStaffphoneIsNull() {
            addCriterion("staffPhone is null");
            return (Criteria) this;
        }

        public Criteria andStaffphoneIsNotNull() {
            addCriterion("staffPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffphoneEqualTo(String value) {
            addCriterion("staffPhone =", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotEqualTo(String value) {
            addCriterion("staffPhone <>", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneGreaterThan(String value) {
            addCriterion("staffPhone >", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneGreaterThanOrEqualTo(String value) {
            addCriterion("staffPhone >=", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneLessThan(String value) {
            addCriterion("staffPhone <", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneLessThanOrEqualTo(String value) {
            addCriterion("staffPhone <=", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneLike(String value) {
            addCriterion("staffPhone like", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotLike(String value) {
            addCriterion("staffPhone not like", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneIn(List<String> values) {
            addCriterion("staffPhone in", values, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotIn(List<String> values) {
            addCriterion("staffPhone not in", values, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneBetween(String value1, String value2) {
            addCriterion("staffPhone between", value1, value2, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotBetween(String value1, String value2) {
            addCriterion("staffPhone not between", value1, value2, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStafftelIsNull() {
            addCriterion("staffTel is null");
            return (Criteria) this;
        }

        public Criteria andStafftelIsNotNull() {
            addCriterion("staffTel is not null");
            return (Criteria) this;
        }

        public Criteria andStafftelEqualTo(String value) {
            addCriterion("staffTel =", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelNotEqualTo(String value) {
            addCriterion("staffTel <>", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelGreaterThan(String value) {
            addCriterion("staffTel >", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelGreaterThanOrEqualTo(String value) {
            addCriterion("staffTel >=", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelLessThan(String value) {
            addCriterion("staffTel <", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelLessThanOrEqualTo(String value) {
            addCriterion("staffTel <=", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelLike(String value) {
            addCriterion("staffTel like", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelNotLike(String value) {
            addCriterion("staffTel not like", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelIn(List<String> values) {
            addCriterion("staffTel in", values, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelNotIn(List<String> values) {
            addCriterion("staffTel not in", values, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelBetween(String value1, String value2) {
            addCriterion("staffTel between", value1, value2, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelNotBetween(String value1, String value2) {
            addCriterion("staffTel not between", value1, value2, "stafftel");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeIsNull() {
            addCriterion("holidayTpye is null");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeIsNotNull() {
            addCriterion("holidayTpye is not null");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeEqualTo(String value) {
            addCriterion("holidayTpye =", value, "holidaytpye");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeNotEqualTo(String value) {
            addCriterion("holidayTpye <>", value, "holidaytpye");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeGreaterThan(String value) {
            addCriterion("holidayTpye >", value, "holidaytpye");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeGreaterThanOrEqualTo(String value) {
            addCriterion("holidayTpye >=", value, "holidaytpye");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeLessThan(String value) {
            addCriterion("holidayTpye <", value, "holidaytpye");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeLessThanOrEqualTo(String value) {
            addCriterion("holidayTpye <=", value, "holidaytpye");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeLike(String value) {
            addCriterion("holidayTpye like", value, "holidaytpye");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeNotLike(String value) {
            addCriterion("holidayTpye not like", value, "holidaytpye");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeIn(List<String> values) {
            addCriterion("holidayTpye in", values, "holidaytpye");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeNotIn(List<String> values) {
            addCriterion("holidayTpye not in", values, "holidaytpye");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeBetween(String value1, String value2) {
            addCriterion("holidayTpye between", value1, value2, "holidaytpye");
            return (Criteria) this;
        }

        public Criteria andHolidaytpyeNotBetween(String value1, String value2) {
            addCriterion("holidayTpye not between", value1, value2, "holidaytpye");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andStarthourIsNull() {
            addCriterion("startHour is null");
            return (Criteria) this;
        }

        public Criteria andStarthourIsNotNull() {
            addCriterion("startHour is not null");
            return (Criteria) this;
        }

        public Criteria andStarthourEqualTo(String value) {
            addCriterion("startHour =", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourNotEqualTo(String value) {
            addCriterion("startHour <>", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourGreaterThan(String value) {
            addCriterion("startHour >", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourGreaterThanOrEqualTo(String value) {
            addCriterion("startHour >=", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourLessThan(String value) {
            addCriterion("startHour <", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourLessThanOrEqualTo(String value) {
            addCriterion("startHour <=", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourLike(String value) {
            addCriterion("startHour like", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourNotLike(String value) {
            addCriterion("startHour not like", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourIn(List<String> values) {
            addCriterion("startHour in", values, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourNotIn(List<String> values) {
            addCriterion("startHour not in", values, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourBetween(String value1, String value2) {
            addCriterion("startHour between", value1, value2, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourNotBetween(String value1, String value2) {
            addCriterion("startHour not between", value1, value2, "starthour");
            return (Criteria) this;
        }

        public Criteria andEndhourIsNull() {
            addCriterion("endHour is null");
            return (Criteria) this;
        }

        public Criteria andEndhourIsNotNull() {
            addCriterion("endHour is not null");
            return (Criteria) this;
        }

        public Criteria andEndhourEqualTo(String value) {
            addCriterion("endHour =", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourNotEqualTo(String value) {
            addCriterion("endHour <>", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourGreaterThan(String value) {
            addCriterion("endHour >", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourGreaterThanOrEqualTo(String value) {
            addCriterion("endHour >=", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourLessThan(String value) {
            addCriterion("endHour <", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourLessThanOrEqualTo(String value) {
            addCriterion("endHour <=", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourLike(String value) {
            addCriterion("endHour like", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourNotLike(String value) {
            addCriterion("endHour not like", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourIn(List<String> values) {
            addCriterion("endHour in", values, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourNotIn(List<String> values) {
            addCriterion("endHour not in", values, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourBetween(String value1, String value2) {
            addCriterion("endHour between", value1, value2, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourNotBetween(String value1, String value2) {
            addCriterion("endHour not between", value1, value2, "endhour");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(String value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(String value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(String value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(String value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(String value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(String value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLike(String value) {
            addCriterion("days like", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotLike(String value) {
            addCriterion("days not like", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<String> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<String> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(String value1, String value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(String value1, String value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andHolidayfileIsNull() {
            addCriterion("holidayFile is null");
            return (Criteria) this;
        }

        public Criteria andHolidayfileIsNotNull() {
            addCriterion("holidayFile is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayfileEqualTo(String value) {
            addCriterion("holidayFile =", value, "holidayfile");
            return (Criteria) this;
        }

        public Criteria andHolidayfileNotEqualTo(String value) {
            addCriterion("holidayFile <>", value, "holidayfile");
            return (Criteria) this;
        }

        public Criteria andHolidayfileGreaterThan(String value) {
            addCriterion("holidayFile >", value, "holidayfile");
            return (Criteria) this;
        }

        public Criteria andHolidayfileGreaterThanOrEqualTo(String value) {
            addCriterion("holidayFile >=", value, "holidayfile");
            return (Criteria) this;
        }

        public Criteria andHolidayfileLessThan(String value) {
            addCriterion("holidayFile <", value, "holidayfile");
            return (Criteria) this;
        }

        public Criteria andHolidayfileLessThanOrEqualTo(String value) {
            addCriterion("holidayFile <=", value, "holidayfile");
            return (Criteria) this;
        }

        public Criteria andHolidayfileLike(String value) {
            addCriterion("holidayFile like", value, "holidayfile");
            return (Criteria) this;
        }

        public Criteria andHolidayfileNotLike(String value) {
            addCriterion("holidayFile not like", value, "holidayfile");
            return (Criteria) this;
        }

        public Criteria andHolidayfileIn(List<String> values) {
            addCriterion("holidayFile in", values, "holidayfile");
            return (Criteria) this;
        }

        public Criteria andHolidayfileNotIn(List<String> values) {
            addCriterion("holidayFile not in", values, "holidayfile");
            return (Criteria) this;
        }

        public Criteria andHolidayfileBetween(String value1, String value2) {
            addCriterion("holidayFile between", value1, value2, "holidayfile");
            return (Criteria) this;
        }

        public Criteria andHolidayfileNotBetween(String value1, String value2) {
            addCriterion("holidayFile not between", value1, value2, "holidayfile");
            return (Criteria) this;
        }

        public Criteria andNextnodeIsNull() {
            addCriterion("nextnode is null");
            return (Criteria) this;
        }

        public Criteria andNextnodeIsNotNull() {
            addCriterion("nextnode is not null");
            return (Criteria) this;
        }

        public Criteria andNextnodeEqualTo(String value) {
            addCriterion("nextnode =", value, "nextnode");
            return (Criteria) this;
        }

        public Criteria andNextnodeNotEqualTo(String value) {
            addCriterion("nextnode <>", value, "nextnode");
            return (Criteria) this;
        }

        public Criteria andNextnodeGreaterThan(String value) {
            addCriterion("nextnode >", value, "nextnode");
            return (Criteria) this;
        }

        public Criteria andNextnodeGreaterThanOrEqualTo(String value) {
            addCriterion("nextnode >=", value, "nextnode");
            return (Criteria) this;
        }

        public Criteria andNextnodeLessThan(String value) {
            addCriterion("nextnode <", value, "nextnode");
            return (Criteria) this;
        }

        public Criteria andNextnodeLessThanOrEqualTo(String value) {
            addCriterion("nextnode <=", value, "nextnode");
            return (Criteria) this;
        }

        public Criteria andNextnodeLike(String value) {
            addCriterion("nextnode like", value, "nextnode");
            return (Criteria) this;
        }

        public Criteria andNextnodeNotLike(String value) {
            addCriterion("nextnode not like", value, "nextnode");
            return (Criteria) this;
        }

        public Criteria andNextnodeIn(List<String> values) {
            addCriterion("nextnode in", values, "nextnode");
            return (Criteria) this;
        }

        public Criteria andNextnodeNotIn(List<String> values) {
            addCriterion("nextnode not in", values, "nextnode");
            return (Criteria) this;
        }

        public Criteria andNextnodeBetween(String value1, String value2) {
            addCriterion("nextnode between", value1, value2, "nextnode");
            return (Criteria) this;
        }

        public Criteria andNextnodeNotBetween(String value1, String value2) {
            addCriterion("nextnode not between", value1, value2, "nextnode");
            return (Criteria) this;
        }

        public Criteria andNextnoderIsNull() {
            addCriterion("nextnoder is null");
            return (Criteria) this;
        }

        public Criteria andNextnoderIsNotNull() {
            addCriterion("nextnoder is not null");
            return (Criteria) this;
        }

        public Criteria andNextnoderEqualTo(String value) {
            addCriterion("nextnoder =", value, "nextnoder");
            return (Criteria) this;
        }

        public Criteria andNextnoderNotEqualTo(String value) {
            addCriterion("nextnoder <>", value, "nextnoder");
            return (Criteria) this;
        }

        public Criteria andNextnoderGreaterThan(String value) {
            addCriterion("nextnoder >", value, "nextnoder");
            return (Criteria) this;
        }

        public Criteria andNextnoderGreaterThanOrEqualTo(String value) {
            addCriterion("nextnoder >=", value, "nextnoder");
            return (Criteria) this;
        }

        public Criteria andNextnoderLessThan(String value) {
            addCriterion("nextnoder <", value, "nextnoder");
            return (Criteria) this;
        }

        public Criteria andNextnoderLessThanOrEqualTo(String value) {
            addCriterion("nextnoder <=", value, "nextnoder");
            return (Criteria) this;
        }

        public Criteria andNextnoderLike(String value) {
            addCriterion("nextnoder like", value, "nextnoder");
            return (Criteria) this;
        }

        public Criteria andNextnoderNotLike(String value) {
            addCriterion("nextnoder not like", value, "nextnoder");
            return (Criteria) this;
        }

        public Criteria andNextnoderIn(List<String> values) {
            addCriterion("nextnoder in", values, "nextnoder");
            return (Criteria) this;
        }

        public Criteria andNextnoderNotIn(List<String> values) {
            addCriterion("nextnoder not in", values, "nextnoder");
            return (Criteria) this;
        }

        public Criteria andNextnoderBetween(String value1, String value2) {
            addCriterion("nextnoder between", value1, value2, "nextnoder");
            return (Criteria) this;
        }

        public Criteria andNextnoderNotBetween(String value1, String value2) {
            addCriterion("nextnoder not between", value1, value2, "nextnoder");
            return (Criteria) this;
        }

        public Criteria andSendtoIsNull() {
            addCriterion("sendto is null");
            return (Criteria) this;
        }

        public Criteria andSendtoIsNotNull() {
            addCriterion("sendto is not null");
            return (Criteria) this;
        }

        public Criteria andSendtoEqualTo(String value) {
            addCriterion("sendto =", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoNotEqualTo(String value) {
            addCriterion("sendto <>", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoGreaterThan(String value) {
            addCriterion("sendto >", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoGreaterThanOrEqualTo(String value) {
            addCriterion("sendto >=", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoLessThan(String value) {
            addCriterion("sendto <", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoLessThanOrEqualTo(String value) {
            addCriterion("sendto <=", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoLike(String value) {
            addCriterion("sendto like", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoNotLike(String value) {
            addCriterion("sendto not like", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoIn(List<String> values) {
            addCriterion("sendto in", values, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoNotIn(List<String> values) {
            addCriterion("sendto not in", values, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoBetween(String value1, String value2) {
            addCriterion("sendto between", value1, value2, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoNotBetween(String value1, String value2) {
            addCriterion("sendto not between", value1, value2, "sendto");
            return (Criteria) this;
        }

        public Criteria andYholidayIsNull() {
            addCriterion("yholiday is null");
            return (Criteria) this;
        }

        public Criteria andYholidayIsNotNull() {
            addCriterion("yholiday is not null");
            return (Criteria) this;
        }

        public Criteria andYholidayEqualTo(String value) {
            addCriterion("yholiday =", value, "yholiday");
            return (Criteria) this;
        }

        public Criteria andYholidayNotEqualTo(String value) {
            addCriterion("yholiday <>", value, "yholiday");
            return (Criteria) this;
        }

        public Criteria andYholidayGreaterThan(String value) {
            addCriterion("yholiday >", value, "yholiday");
            return (Criteria) this;
        }

        public Criteria andYholidayGreaterThanOrEqualTo(String value) {
            addCriterion("yholiday >=", value, "yholiday");
            return (Criteria) this;
        }

        public Criteria andYholidayLessThan(String value) {
            addCriterion("yholiday <", value, "yholiday");
            return (Criteria) this;
        }

        public Criteria andYholidayLessThanOrEqualTo(String value) {
            addCriterion("yholiday <=", value, "yholiday");
            return (Criteria) this;
        }

        public Criteria andYholidayLike(String value) {
            addCriterion("yholiday like", value, "yholiday");
            return (Criteria) this;
        }

        public Criteria andYholidayNotLike(String value) {
            addCriterion("yholiday not like", value, "yholiday");
            return (Criteria) this;
        }

        public Criteria andYholidayIn(List<String> values) {
            addCriterion("yholiday in", values, "yholiday");
            return (Criteria) this;
        }

        public Criteria andYholidayNotIn(List<String> values) {
            addCriterion("yholiday not in", values, "yholiday");
            return (Criteria) this;
        }

        public Criteria andYholidayBetween(String value1, String value2) {
            addCriterion("yholiday between", value1, value2, "yholiday");
            return (Criteria) this;
        }

        public Criteria andYholidayNotBetween(String value1, String value2) {
            addCriterion("yholiday not between", value1, value2, "yholiday");
            return (Criteria) this;
        }

        public Criteria andYusedIsNull() {
            addCriterion("yused is null");
            return (Criteria) this;
        }

        public Criteria andYusedIsNotNull() {
            addCriterion("yused is not null");
            return (Criteria) this;
        }

        public Criteria andYusedEqualTo(String value) {
            addCriterion("yused =", value, "yused");
            return (Criteria) this;
        }

        public Criteria andYusedNotEqualTo(String value) {
            addCriterion("yused <>", value, "yused");
            return (Criteria) this;
        }

        public Criteria andYusedGreaterThan(String value) {
            addCriterion("yused >", value, "yused");
            return (Criteria) this;
        }

        public Criteria andYusedGreaterThanOrEqualTo(String value) {
            addCriterion("yused >=", value, "yused");
            return (Criteria) this;
        }

        public Criteria andYusedLessThan(String value) {
            addCriterion("yused <", value, "yused");
            return (Criteria) this;
        }

        public Criteria andYusedLessThanOrEqualTo(String value) {
            addCriterion("yused <=", value, "yused");
            return (Criteria) this;
        }

        public Criteria andYusedLike(String value) {
            addCriterion("yused like", value, "yused");
            return (Criteria) this;
        }

        public Criteria andYusedNotLike(String value) {
            addCriterion("yused not like", value, "yused");
            return (Criteria) this;
        }

        public Criteria andYusedIn(List<String> values) {
            addCriterion("yused in", values, "yused");
            return (Criteria) this;
        }

        public Criteria andYusedNotIn(List<String> values) {
            addCriterion("yused not in", values, "yused");
            return (Criteria) this;
        }

        public Criteria andYusedBetween(String value1, String value2) {
            addCriterion("yused between", value1, value2, "yused");
            return (Criteria) this;
        }

        public Criteria andYusedNotBetween(String value1, String value2) {
            addCriterion("yused not between", value1, value2, "yused");
            return (Criteria) this;
        }

        public Criteria andIholidayIsNull() {
            addCriterion("iholiday is null");
            return (Criteria) this;
        }

        public Criteria andIholidayIsNotNull() {
            addCriterion("iholiday is not null");
            return (Criteria) this;
        }

        public Criteria andIholidayEqualTo(String value) {
            addCriterion("iholiday =", value, "iholiday");
            return (Criteria) this;
        }

        public Criteria andIholidayNotEqualTo(String value) {
            addCriterion("iholiday <>", value, "iholiday");
            return (Criteria) this;
        }

        public Criteria andIholidayGreaterThan(String value) {
            addCriterion("iholiday >", value, "iholiday");
            return (Criteria) this;
        }

        public Criteria andIholidayGreaterThanOrEqualTo(String value) {
            addCriterion("iholiday >=", value, "iholiday");
            return (Criteria) this;
        }

        public Criteria andIholidayLessThan(String value) {
            addCriterion("iholiday <", value, "iholiday");
            return (Criteria) this;
        }

        public Criteria andIholidayLessThanOrEqualTo(String value) {
            addCriterion("iholiday <=", value, "iholiday");
            return (Criteria) this;
        }

        public Criteria andIholidayLike(String value) {
            addCriterion("iholiday like", value, "iholiday");
            return (Criteria) this;
        }

        public Criteria andIholidayNotLike(String value) {
            addCriterion("iholiday not like", value, "iholiday");
            return (Criteria) this;
        }

        public Criteria andIholidayIn(List<String> values) {
            addCriterion("iholiday in", values, "iholiday");
            return (Criteria) this;
        }

        public Criteria andIholidayNotIn(List<String> values) {
            addCriterion("iholiday not in", values, "iholiday");
            return (Criteria) this;
        }

        public Criteria andIholidayBetween(String value1, String value2) {
            addCriterion("iholiday between", value1, value2, "iholiday");
            return (Criteria) this;
        }

        public Criteria andIholidayNotBetween(String value1, String value2) {
            addCriterion("iholiday not between", value1, value2, "iholiday");
            return (Criteria) this;
        }

        public Criteria andIusedIsNull() {
            addCriterion("iused is null");
            return (Criteria) this;
        }

        public Criteria andIusedIsNotNull() {
            addCriterion("iused is not null");
            return (Criteria) this;
        }

        public Criteria andIusedEqualTo(String value) {
            addCriterion("iused =", value, "iused");
            return (Criteria) this;
        }

        public Criteria andIusedNotEqualTo(String value) {
            addCriterion("iused <>", value, "iused");
            return (Criteria) this;
        }

        public Criteria andIusedGreaterThan(String value) {
            addCriterion("iused >", value, "iused");
            return (Criteria) this;
        }

        public Criteria andIusedGreaterThanOrEqualTo(String value) {
            addCriterion("iused >=", value, "iused");
            return (Criteria) this;
        }

        public Criteria andIusedLessThan(String value) {
            addCriterion("iused <", value, "iused");
            return (Criteria) this;
        }

        public Criteria andIusedLessThanOrEqualTo(String value) {
            addCriterion("iused <=", value, "iused");
            return (Criteria) this;
        }

        public Criteria andIusedLike(String value) {
            addCriterion("iused like", value, "iused");
            return (Criteria) this;
        }

        public Criteria andIusedNotLike(String value) {
            addCriterion("iused not like", value, "iused");
            return (Criteria) this;
        }

        public Criteria andIusedIn(List<String> values) {
            addCriterion("iused in", values, "iused");
            return (Criteria) this;
        }

        public Criteria andIusedNotIn(List<String> values) {
            addCriterion("iused not in", values, "iused");
            return (Criteria) this;
        }

        public Criteria andIusedBetween(String value1, String value2) {
            addCriterion("iused between", value1, value2, "iused");
            return (Criteria) this;
        }

        public Criteria andIusedNotBetween(String value1, String value2) {
            addCriterion("iused not between", value1, value2, "iused");
            return (Criteria) this;
        }

        public Criteria andOusedIsNull() {
            addCriterion("oused is null");
            return (Criteria) this;
        }

        public Criteria andOusedIsNotNull() {
            addCriterion("oused is not null");
            return (Criteria) this;
        }

        public Criteria andOusedEqualTo(String value) {
            addCriterion("oused =", value, "oused");
            return (Criteria) this;
        }

        public Criteria andOusedNotEqualTo(String value) {
            addCriterion("oused <>", value, "oused");
            return (Criteria) this;
        }

        public Criteria andOusedGreaterThan(String value) {
            addCriterion("oused >", value, "oused");
            return (Criteria) this;
        }

        public Criteria andOusedGreaterThanOrEqualTo(String value) {
            addCriterion("oused >=", value, "oused");
            return (Criteria) this;
        }

        public Criteria andOusedLessThan(String value) {
            addCriterion("oused <", value, "oused");
            return (Criteria) this;
        }

        public Criteria andOusedLessThanOrEqualTo(String value) {
            addCriterion("oused <=", value, "oused");
            return (Criteria) this;
        }

        public Criteria andOusedLike(String value) {
            addCriterion("oused like", value, "oused");
            return (Criteria) this;
        }

        public Criteria andOusedNotLike(String value) {
            addCriterion("oused not like", value, "oused");
            return (Criteria) this;
        }

        public Criteria andOusedIn(List<String> values) {
            addCriterion("oused in", values, "oused");
            return (Criteria) this;
        }

        public Criteria andOusedNotIn(List<String> values) {
            addCriterion("oused not in", values, "oused");
            return (Criteria) this;
        }

        public Criteria andOusedBetween(String value1, String value2) {
            addCriterion("oused between", value1, value2, "oused");
            return (Criteria) this;
        }

        public Criteria andOusedNotBetween(String value1, String value2) {
            addCriterion("oused not between", value1, value2, "oused");
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