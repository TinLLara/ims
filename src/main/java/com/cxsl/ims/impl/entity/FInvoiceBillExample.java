package com.cxsl.ims.impl.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FInvoiceBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FInvoiceBillExample() {
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

        public Criteria andInvBillIdIsNull() {
            addCriterion("inv_bill_id is null");
            return (Criteria) this;
        }

        public Criteria andInvBillIdIsNotNull() {
            addCriterion("inv_bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvBillIdEqualTo(Long value) {
            addCriterion("inv_bill_id =", value, "invBillId");
            return (Criteria) this;
        }

        public Criteria andInvBillIdNotEqualTo(Long value) {
            addCriterion("inv_bill_id <>", value, "invBillId");
            return (Criteria) this;
        }

        public Criteria andInvBillIdGreaterThan(Long value) {
            addCriterion("inv_bill_id >", value, "invBillId");
            return (Criteria) this;
        }

        public Criteria andInvBillIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inv_bill_id >=", value, "invBillId");
            return (Criteria) this;
        }

        public Criteria andInvBillIdLessThan(Long value) {
            addCriterion("inv_bill_id <", value, "invBillId");
            return (Criteria) this;
        }

        public Criteria andInvBillIdLessThanOrEqualTo(Long value) {
            addCriterion("inv_bill_id <=", value, "invBillId");
            return (Criteria) this;
        }

        public Criteria andInvBillIdIn(List<Long> values) {
            addCriterion("inv_bill_id in", values, "invBillId");
            return (Criteria) this;
        }

        public Criteria andInvBillIdNotIn(List<Long> values) {
            addCriterion("inv_bill_id not in", values, "invBillId");
            return (Criteria) this;
        }

        public Criteria andInvBillIdBetween(Long value1, Long value2) {
            addCriterion("inv_bill_id between", value1, value2, "invBillId");
            return (Criteria) this;
        }

        public Criteria andInvBillIdNotBetween(Long value1, Long value2) {
            addCriterion("inv_bill_id not between", value1, value2, "invBillId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShippedTimeIsNull() {
            addCriterion("shipped_time is null");
            return (Criteria) this;
        }

        public Criteria andShippedTimeIsNotNull() {
            addCriterion("shipped_time is not null");
            return (Criteria) this;
        }

        public Criteria andShippedTimeEqualTo(Date value) {
            addCriterion("shipped_time =", value, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeNotEqualTo(Date value) {
            addCriterion("shipped_time <>", value, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeGreaterThan(Date value) {
            addCriterion("shipped_time >", value, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shipped_time >=", value, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeLessThan(Date value) {
            addCriterion("shipped_time <", value, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeLessThanOrEqualTo(Date value) {
            addCriterion("shipped_time <=", value, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeIn(List<Date> values) {
            addCriterion("shipped_time in", values, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeNotIn(List<Date> values) {
            addCriterion("shipped_time not in", values, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeBetween(Date value1, Date value2) {
            addCriterion("shipped_time between", value1, value2, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeNotBetween(Date value1, Date value2) {
            addCriterion("shipped_time not between", value1, value2, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNull() {
            addCriterion("settle_time is null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNotNull() {
            addCriterion("settle_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeEqualTo(Date value) {
            addCriterion("settle_time =", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotEqualTo(Date value) {
            addCriterion("settle_time <>", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThan(Date value) {
            addCriterion("settle_time >", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settle_time >=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThan(Date value) {
            addCriterion("settle_time <", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThanOrEqualTo(Date value) {
            addCriterion("settle_time <=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIn(List<Date> values) {
            addCriterion("settle_time in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotIn(List<Date> values) {
            addCriterion("settle_time not in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeBetween(Date value1, Date value2) {
            addCriterion("settle_time between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotBetween(Date value1, Date value2) {
            addCriterion("settle_time not between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNull() {
            addCriterion("customer_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNotNull() {
            addCriterion("customer_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeEqualTo(String value) {
            addCriterion("customer_code =", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotEqualTo(String value) {
            addCriterion("customer_code <>", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThan(String value) {
            addCriterion("customer_code >", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_code >=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThan(String value) {
            addCriterion("customer_code <", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("customer_code <=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLike(String value) {
            addCriterion("customer_code like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotLike(String value) {
            addCriterion("customer_code not like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIn(List<String> values) {
            addCriterion("customer_code in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotIn(List<String> values) {
            addCriterion("customer_code not in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeBetween(String value1, String value2) {
            addCriterion("customer_code between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("customer_code not between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdIsNull() {
            addCriterion("outer_order_id is null");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdIsNotNull() {
            addCriterion("outer_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdEqualTo(String value) {
            addCriterion("outer_order_id =", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdNotEqualTo(String value) {
            addCriterion("outer_order_id <>", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdGreaterThan(String value) {
            addCriterion("outer_order_id >", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("outer_order_id >=", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdLessThan(String value) {
            addCriterion("outer_order_id <", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdLessThanOrEqualTo(String value) {
            addCriterion("outer_order_id <=", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdLike(String value) {
            addCriterion("outer_order_id like", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdNotLike(String value) {
            addCriterion("outer_order_id not like", value, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdIn(List<String> values) {
            addCriterion("outer_order_id in", values, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdNotIn(List<String> values) {
            addCriterion("outer_order_id not in", values, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdBetween(String value1, String value2) {
            addCriterion("outer_order_id between", value1, value2, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andOuterOrderIdNotBetween(String value1, String value2) {
            addCriterion("outer_order_id not between", value1, value2, "outerOrderId");
            return (Criteria) this;
        }

        public Criteria andPackingIdIsNull() {
            addCriterion("packing_id is null");
            return (Criteria) this;
        }

        public Criteria andPackingIdIsNotNull() {
            addCriterion("packing_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackingIdEqualTo(Long value) {
            addCriterion("packing_id =", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdNotEqualTo(Long value) {
            addCriterion("packing_id <>", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdGreaterThan(Long value) {
            addCriterion("packing_id >", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("packing_id >=", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdLessThan(Long value) {
            addCriterion("packing_id <", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdLessThanOrEqualTo(Long value) {
            addCriterion("packing_id <=", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdIn(List<Long> values) {
            addCriterion("packing_id in", values, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdNotIn(List<Long> values) {
            addCriterion("packing_id not in", values, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdBetween(Long value1, Long value2) {
            addCriterion("packing_id between", value1, value2, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdNotBetween(Long value1, Long value2) {
            addCriterion("packing_id not between", value1, value2, "packingId");
            return (Criteria) this;
        }

        public Criteria andGlDateIsNull() {
            addCriterion("gl_date is null");
            return (Criteria) this;
        }

        public Criteria andGlDateIsNotNull() {
            addCriterion("gl_date is not null");
            return (Criteria) this;
        }

        public Criteria andGlDateEqualTo(Date value) {
            addCriterion("gl_date =", value, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateNotEqualTo(Date value) {
            addCriterion("gl_date <>", value, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateGreaterThan(Date value) {
            addCriterion("gl_date >", value, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateGreaterThanOrEqualTo(Date value) {
            addCriterion("gl_date >=", value, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateLessThan(Date value) {
            addCriterion("gl_date <", value, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateLessThanOrEqualTo(Date value) {
            addCriterion("gl_date <=", value, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateIn(List<Date> values) {
            addCriterion("gl_date in", values, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateNotIn(List<Date> values) {
            addCriterion("gl_date not in", values, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateBetween(Date value1, Date value2) {
            addCriterion("gl_date between", value1, value2, "glDate");
            return (Criteria) this;
        }

        public Criteria andGlDateNotBetween(Date value1, Date value2) {
            addCriterion("gl_date not between", value1, value2, "glDate");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeIsNull() {
            addCriterion("received_time is null");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeIsNotNull() {
            addCriterion("received_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeEqualTo(Date value) {
            addCriterion("received_time =", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeNotEqualTo(Date value) {
            addCriterion("received_time <>", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeGreaterThan(Date value) {
            addCriterion("received_time >", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("received_time >=", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeLessThan(Date value) {
            addCriterion("received_time <", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeLessThanOrEqualTo(Date value) {
            addCriterion("received_time <=", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeIn(List<Date> values) {
            addCriterion("received_time in", values, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeNotIn(List<Date> values) {
            addCriterion("received_time not in", values, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeBetween(Date value1, Date value2) {
            addCriterion("received_time between", value1, value2, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeNotBetween(Date value1, Date value2) {
            addCriterion("received_time not between", value1, value2, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andOmNumIsNull() {
            addCriterion("om_num is null");
            return (Criteria) this;
        }

        public Criteria andOmNumIsNotNull() {
            addCriterion("om_num is not null");
            return (Criteria) this;
        }

        public Criteria andOmNumEqualTo(String value) {
            addCriterion("om_num =", value, "omNum");
            return (Criteria) this;
        }

        public Criteria andOmNumNotEqualTo(String value) {
            addCriterion("om_num <>", value, "omNum");
            return (Criteria) this;
        }

        public Criteria andOmNumGreaterThan(String value) {
            addCriterion("om_num >", value, "omNum");
            return (Criteria) this;
        }

        public Criteria andOmNumGreaterThanOrEqualTo(String value) {
            addCriterion("om_num >=", value, "omNum");
            return (Criteria) this;
        }

        public Criteria andOmNumLessThan(String value) {
            addCriterion("om_num <", value, "omNum");
            return (Criteria) this;
        }

        public Criteria andOmNumLessThanOrEqualTo(String value) {
            addCriterion("om_num <=", value, "omNum");
            return (Criteria) this;
        }

        public Criteria andOmNumLike(String value) {
            addCriterion("om_num like", value, "omNum");
            return (Criteria) this;
        }

        public Criteria andOmNumNotLike(String value) {
            addCriterion("om_num not like", value, "omNum");
            return (Criteria) this;
        }

        public Criteria andOmNumIn(List<String> values) {
            addCriterion("om_num in", values, "omNum");
            return (Criteria) this;
        }

        public Criteria andOmNumNotIn(List<String> values) {
            addCriterion("om_num not in", values, "omNum");
            return (Criteria) this;
        }

        public Criteria andOmNumBetween(String value1, String value2) {
            addCriterion("om_num between", value1, value2, "omNum");
            return (Criteria) this;
        }

        public Criteria andOmNumNotBetween(String value1, String value2) {
            addCriterion("om_num not between", value1, value2, "omNum");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumIsNull() {
            addCriterion("cmis_finance_num is null");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumIsNotNull() {
            addCriterion("cmis_finance_num is not null");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumEqualTo(String value) {
            addCriterion("cmis_finance_num =", value, "cmisFinanceNum");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumNotEqualTo(String value) {
            addCriterion("cmis_finance_num <>", value, "cmisFinanceNum");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumGreaterThan(String value) {
            addCriterion("cmis_finance_num >", value, "cmisFinanceNum");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumGreaterThanOrEqualTo(String value) {
            addCriterion("cmis_finance_num >=", value, "cmisFinanceNum");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumLessThan(String value) {
            addCriterion("cmis_finance_num <", value, "cmisFinanceNum");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumLessThanOrEqualTo(String value) {
            addCriterion("cmis_finance_num <=", value, "cmisFinanceNum");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumLike(String value) {
            addCriterion("cmis_finance_num like", value, "cmisFinanceNum");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumNotLike(String value) {
            addCriterion("cmis_finance_num not like", value, "cmisFinanceNum");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumIn(List<String> values) {
            addCriterion("cmis_finance_num in", values, "cmisFinanceNum");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumNotIn(List<String> values) {
            addCriterion("cmis_finance_num not in", values, "cmisFinanceNum");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumBetween(String value1, String value2) {
            addCriterion("cmis_finance_num between", value1, value2, "cmisFinanceNum");
            return (Criteria) this;
        }

        public Criteria andCmisFinanceNumNotBetween(String value1, String value2) {
            addCriterion("cmis_finance_num not between", value1, value2, "cmisFinanceNum");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountIsNull() {
            addCriterion("settlement_amount is null");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountIsNotNull() {
            addCriterion("settlement_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountEqualTo(BigDecimal value) {
            addCriterion("settlement_amount =", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountNotEqualTo(BigDecimal value) {
            addCriterion("settlement_amount <>", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountGreaterThan(BigDecimal value) {
            addCriterion("settlement_amount >", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settlement_amount >=", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountLessThan(BigDecimal value) {
            addCriterion("settlement_amount <", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settlement_amount <=", value, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountIn(List<BigDecimal> values) {
            addCriterion("settlement_amount in", values, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountNotIn(List<BigDecimal> values) {
            addCriterion("settlement_amount not in", values, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settlement_amount between", value1, value2, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSettlementAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settlement_amount not between", value1, value2, "settlementAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDetailsStatusIsNull() {
            addCriterion("sale_details_status is null");
            return (Criteria) this;
        }

        public Criteria andSaleDetailsStatusIsNotNull() {
            addCriterion("sale_details_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDetailsStatusEqualTo(Byte value) {
            addCriterion("sale_details_status =", value, "saleDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDetailsStatusNotEqualTo(Byte value) {
            addCriterion("sale_details_status <>", value, "saleDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDetailsStatusGreaterThan(Byte value) {
            addCriterion("sale_details_status >", value, "saleDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDetailsStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sale_details_status >=", value, "saleDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDetailsStatusLessThan(Byte value) {
            addCriterion("sale_details_status <", value, "saleDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDetailsStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sale_details_status <=", value, "saleDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDetailsStatusIn(List<Byte> values) {
            addCriterion("sale_details_status in", values, "saleDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDetailsStatusNotIn(List<Byte> values) {
            addCriterion("sale_details_status not in", values, "saleDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDetailsStatusBetween(Byte value1, Byte value2) {
            addCriterion("sale_details_status between", value1, value2, "saleDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDetailsStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sale_details_status not between", value1, value2, "saleDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("invoice_title is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("invoice_title is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("invoice_title =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("invoice_title <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("invoice_title >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_title >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("invoice_title <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("invoice_title <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("invoice_title like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("invoice_title not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("invoice_title in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("invoice_title not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("invoice_title between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("invoice_title not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIsNull() {
            addCriterion("invoice_date is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIsNotNull() {
            addCriterion("invoice_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateEqualTo(Date value) {
            addCriterion("invoice_date =", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotEqualTo(Date value) {
            addCriterion("invoice_date <>", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateGreaterThan(Date value) {
            addCriterion("invoice_date >", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("invoice_date >=", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLessThan(Date value) {
            addCriterion("invoice_date <", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLessThanOrEqualTo(Date value) {
            addCriterion("invoice_date <=", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIn(List<Date> values) {
            addCriterion("invoice_date in", values, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotIn(List<Date> values) {
            addCriterion("invoice_date not in", values, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateBetween(Date value1, Date value2) {
            addCriterion("invoice_date between", value1, value2, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotBetween(Date value1, Date value2) {
            addCriterion("invoice_date not between", value1, value2, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIsNull() {
            addCriterion("invoice_code is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIsNotNull() {
            addCriterion("invoice_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeEqualTo(String value) {
            addCriterion("invoice_code =", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotEqualTo(String value) {
            addCriterion("invoice_code <>", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeGreaterThan(String value) {
            addCriterion("invoice_code >", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_code >=", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLessThan(String value) {
            addCriterion("invoice_code <", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLessThanOrEqualTo(String value) {
            addCriterion("invoice_code <=", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLike(String value) {
            addCriterion("invoice_code like", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotLike(String value) {
            addCriterion("invoice_code not like", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIn(List<String> values) {
            addCriterion("invoice_code in", values, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotIn(List<String> values) {
            addCriterion("invoice_code not in", values, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeBetween(String value1, String value2) {
            addCriterion("invoice_code between", value1, value2, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotBetween(String value1, String value2) {
            addCriterion("invoice_code not between", value1, value2, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIsNull() {
            addCriterion("invoice_num is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIsNotNull() {
            addCriterion("invoice_num is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumEqualTo(String value) {
            addCriterion("invoice_num =", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotEqualTo(String value) {
            addCriterion("invoice_num <>", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumGreaterThan(String value) {
            addCriterion("invoice_num >", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_num >=", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLessThan(String value) {
            addCriterion("invoice_num <", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLessThanOrEqualTo(String value) {
            addCriterion("invoice_num <=", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLike(String value) {
            addCriterion("invoice_num like", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotLike(String value) {
            addCriterion("invoice_num not like", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIn(List<String> values) {
            addCriterion("invoice_num in", values, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotIn(List<String> values) {
            addCriterion("invoice_num not in", values, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumBetween(String value1, String value2) {
            addCriterion("invoice_num between", value1, value2, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotBetween(String value1, String value2) {
            addCriterion("invoice_num not between", value1, value2, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("item_id like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("item_id not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNull() {
            addCriterion("item_price is null");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNotNull() {
            addCriterion("item_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemPriceEqualTo(BigDecimal value) {
            addCriterion("item_price =", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotEqualTo(BigDecimal value) {
            addCriterion("item_price <>", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThan(BigDecimal value) {
            addCriterion("item_price >", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_price >=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThan(BigDecimal value) {
            addCriterion("item_price <", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_price <=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceIn(List<BigDecimal> values) {
            addCriterion("item_price in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotIn(List<BigDecimal> values) {
            addCriterion("item_price not in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_price between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_price not between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemCntIsNull() {
            addCriterion("item_cnt is null");
            return (Criteria) this;
        }

        public Criteria andItemCntIsNotNull() {
            addCriterion("item_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andItemCntEqualTo(Short value) {
            addCriterion("item_cnt =", value, "itemCnt");
            return (Criteria) this;
        }

        public Criteria andItemCntNotEqualTo(Short value) {
            addCriterion("item_cnt <>", value, "itemCnt");
            return (Criteria) this;
        }

        public Criteria andItemCntGreaterThan(Short value) {
            addCriterion("item_cnt >", value, "itemCnt");
            return (Criteria) this;
        }

        public Criteria andItemCntGreaterThanOrEqualTo(Short value) {
            addCriterion("item_cnt >=", value, "itemCnt");
            return (Criteria) this;
        }

        public Criteria andItemCntLessThan(Short value) {
            addCriterion("item_cnt <", value, "itemCnt");
            return (Criteria) this;
        }

        public Criteria andItemCntLessThanOrEqualTo(Short value) {
            addCriterion("item_cnt <=", value, "itemCnt");
            return (Criteria) this;
        }

        public Criteria andItemCntIn(List<Short> values) {
            addCriterion("item_cnt in", values, "itemCnt");
            return (Criteria) this;
        }

        public Criteria andItemCntNotIn(List<Short> values) {
            addCriterion("item_cnt not in", values, "itemCnt");
            return (Criteria) this;
        }

        public Criteria andItemCntBetween(Short value1, Short value2) {
            addCriterion("item_cnt between", value1, value2, "itemCnt");
            return (Criteria) this;
        }

        public Criteria andItemCntNotBetween(Short value1, Short value2) {
            addCriterion("item_cnt not between", value1, value2, "itemCnt");
            return (Criteria) this;
        }

        public Criteria andExcTaxAmountIsNull() {
            addCriterion("exc_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andExcTaxAmountIsNotNull() {
            addCriterion("exc_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExcTaxAmountEqualTo(BigDecimal value) {
            addCriterion("exc_tax_amount =", value, "excTaxAmount");
            return (Criteria) this;
        }

        public Criteria andExcTaxAmountNotEqualTo(BigDecimal value) {
            addCriterion("exc_tax_amount <>", value, "excTaxAmount");
            return (Criteria) this;
        }

        public Criteria andExcTaxAmountGreaterThan(BigDecimal value) {
            addCriterion("exc_tax_amount >", value, "excTaxAmount");
            return (Criteria) this;
        }

        public Criteria andExcTaxAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exc_tax_amount >=", value, "excTaxAmount");
            return (Criteria) this;
        }

        public Criteria andExcTaxAmountLessThan(BigDecimal value) {
            addCriterion("exc_tax_amount <", value, "excTaxAmount");
            return (Criteria) this;
        }

        public Criteria andExcTaxAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exc_tax_amount <=", value, "excTaxAmount");
            return (Criteria) this;
        }

        public Criteria andExcTaxAmountIn(List<BigDecimal> values) {
            addCriterion("exc_tax_amount in", values, "excTaxAmount");
            return (Criteria) this;
        }

        public Criteria andExcTaxAmountNotIn(List<BigDecimal> values) {
            addCriterion("exc_tax_amount not in", values, "excTaxAmount");
            return (Criteria) this;
        }

        public Criteria andExcTaxAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exc_tax_amount between", value1, value2, "excTaxAmount");
            return (Criteria) this;
        }

        public Criteria andExcTaxAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exc_tax_amount not between", value1, value2, "excTaxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxAmountIsNull() {
            addCriterion("tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountIsNotNull() {
            addCriterion("tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountEqualTo(BigDecimal value) {
            addCriterion("tax_amount =", value, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountNotEqualTo(BigDecimal value) {
            addCriterion("tax_amount <>", value, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountGreaterThan(BigDecimal value) {
            addCriterion("tax_amount >", value, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount >=", value, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountLessThan(BigDecimal value) {
            addCriterion("tax_amount <", value, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount <=", value, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountIn(List<BigDecimal> values) {
            addCriterion("tax_amount in", values, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountNotIn(List<BigDecimal> values) {
            addCriterion("tax_amount not in", values, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount between", value1, value2, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount not between", value1, value2, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountIsNull() {
            addCriterion("item_amount is null");
            return (Criteria) this;
        }

        public Criteria andItemAmountIsNotNull() {
            addCriterion("item_amount is not null");
            return (Criteria) this;
        }

        public Criteria andItemAmountEqualTo(BigDecimal value) {
            addCriterion("item_amount =", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountNotEqualTo(BigDecimal value) {
            addCriterion("item_amount <>", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountGreaterThan(BigDecimal value) {
            addCriterion("item_amount >", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_amount >=", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountLessThan(BigDecimal value) {
            addCriterion("item_amount <", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_amount <=", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountIn(List<BigDecimal> values) {
            addCriterion("item_amount in", values, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountNotIn(List<BigDecimal> values) {
            addCriterion("item_amount not in", values, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_amount between", value1, value2, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_amount not between", value1, value2, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(Byte value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(Byte value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(Byte value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(Byte value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(Byte value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<Byte> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<Byte> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(Byte value1, Byte value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNull() {
            addCriterion("invoice_status is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNotNull() {
            addCriterion("invoice_status is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusEqualTo(Byte value) {
            addCriterion("invoice_status =", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotEqualTo(Byte value) {
            addCriterion("invoice_status <>", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThan(Byte value) {
            addCriterion("invoice_status >", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("invoice_status >=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThan(Byte value) {
            addCriterion("invoice_status <", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThanOrEqualTo(Byte value) {
            addCriterion("invoice_status <=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIn(List<Byte> values) {
            addCriterion("invoice_status in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotIn(List<Byte> values) {
            addCriterion("invoice_status not in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusBetween(Byte value1, Byte value2) {
            addCriterion("invoice_status between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("invoice_status not between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedIsNull() {
            addCriterion("is_invoiced is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedIsNotNull() {
            addCriterion("is_invoiced is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedEqualTo(Boolean value) {
            addCriterion("is_invoiced =", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedNotEqualTo(Boolean value) {
            addCriterion("is_invoiced <>", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedGreaterThan(Boolean value) {
            addCriterion("is_invoiced >", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_invoiced >=", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedLessThan(Boolean value) {
            addCriterion("is_invoiced <", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_invoiced <=", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedIn(List<Boolean> values) {
            addCriterion("is_invoiced in", values, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedNotIn(List<Boolean> values) {
            addCriterion("is_invoiced not in", values, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_invoiced between", value1, value2, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_invoiced not between", value1, value2, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIncomeIsNull() {
            addCriterion("is_confirmed_income is null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIncomeIsNotNull() {
            addCriterion("is_confirmed_income is not null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIncomeEqualTo(Boolean value) {
            addCriterion("is_confirmed_income =", value, "isConfirmedIncome");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIncomeNotEqualTo(Boolean value) {
            addCriterion("is_confirmed_income <>", value, "isConfirmedIncome");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIncomeGreaterThan(Boolean value) {
            addCriterion("is_confirmed_income >", value, "isConfirmedIncome");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIncomeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_confirmed_income >=", value, "isConfirmedIncome");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIncomeLessThan(Boolean value) {
            addCriterion("is_confirmed_income <", value, "isConfirmedIncome");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIncomeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_confirmed_income <=", value, "isConfirmedIncome");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIncomeIn(List<Boolean> values) {
            addCriterion("is_confirmed_income in", values, "isConfirmedIncome");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIncomeNotIn(List<Boolean> values) {
            addCriterion("is_confirmed_income not in", values, "isConfirmedIncome");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIncomeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_confirmed_income between", value1, value2, "isConfirmedIncome");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIncomeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_confirmed_income not between", value1, value2, "isConfirmedIncome");
            return (Criteria) this;
        }

        public Criteria andInvBillResultIsNull() {
            addCriterion("inv_bill_result is null");
            return (Criteria) this;
        }

        public Criteria andInvBillResultIsNotNull() {
            addCriterion("inv_bill_result is not null");
            return (Criteria) this;
        }

        public Criteria andInvBillResultEqualTo(Byte value) {
            addCriterion("inv_bill_result =", value, "invBillResult");
            return (Criteria) this;
        }

        public Criteria andInvBillResultNotEqualTo(Byte value) {
            addCriterion("inv_bill_result <>", value, "invBillResult");
            return (Criteria) this;
        }

        public Criteria andInvBillResultGreaterThan(Byte value) {
            addCriterion("inv_bill_result >", value, "invBillResult");
            return (Criteria) this;
        }

        public Criteria andInvBillResultGreaterThanOrEqualTo(Byte value) {
            addCriterion("inv_bill_result >=", value, "invBillResult");
            return (Criteria) this;
        }

        public Criteria andInvBillResultLessThan(Byte value) {
            addCriterion("inv_bill_result <", value, "invBillResult");
            return (Criteria) this;
        }

        public Criteria andInvBillResultLessThanOrEqualTo(Byte value) {
            addCriterion("inv_bill_result <=", value, "invBillResult");
            return (Criteria) this;
        }

        public Criteria andInvBillResultIn(List<Byte> values) {
            addCriterion("inv_bill_result in", values, "invBillResult");
            return (Criteria) this;
        }

        public Criteria andInvBillResultNotIn(List<Byte> values) {
            addCriterion("inv_bill_result not in", values, "invBillResult");
            return (Criteria) this;
        }

        public Criteria andInvBillResultBetween(Byte value1, Byte value2) {
            addCriterion("inv_bill_result between", value1, value2, "invBillResult");
            return (Criteria) this;
        }

        public Criteria andInvBillResultNotBetween(Byte value1, Byte value2) {
            addCriterion("inv_bill_result not between", value1, value2, "invBillResult");
            return (Criteria) this;
        }

        public Criteria andOuIdIsNull() {
            addCriterion("ou_id is null");
            return (Criteria) this;
        }

        public Criteria andOuIdIsNotNull() {
            addCriterion("ou_id is not null");
            return (Criteria) this;
        }

        public Criteria andOuIdEqualTo(Long value) {
            addCriterion("ou_id =", value, "ouId");
            return (Criteria) this;
        }

        public Criteria andOuIdNotEqualTo(Long value) {
            addCriterion("ou_id <>", value, "ouId");
            return (Criteria) this;
        }

        public Criteria andOuIdGreaterThan(Long value) {
            addCriterion("ou_id >", value, "ouId");
            return (Criteria) this;
        }

        public Criteria andOuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ou_id >=", value, "ouId");
            return (Criteria) this;
        }

        public Criteria andOuIdLessThan(Long value) {
            addCriterion("ou_id <", value, "ouId");
            return (Criteria) this;
        }

        public Criteria andOuIdLessThanOrEqualTo(Long value) {
            addCriterion("ou_id <=", value, "ouId");
            return (Criteria) this;
        }

        public Criteria andOuIdIn(List<Long> values) {
            addCriterion("ou_id in", values, "ouId");
            return (Criteria) this;
        }

        public Criteria andOuIdNotIn(List<Long> values) {
            addCriterion("ou_id not in", values, "ouId");
            return (Criteria) this;
        }

        public Criteria andOuIdBetween(Long value1, Long value2) {
            addCriterion("ou_id between", value1, value2, "ouId");
            return (Criteria) this;
        }

        public Criteria andOuIdNotBetween(Long value1, Long value2) {
            addCriterion("ou_id not between", value1, value2, "ouId");
            return (Criteria) this;
        }

        public Criteria andInvoiceReasonIsNull() {
            addCriterion("invoice_reason is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceReasonIsNotNull() {
            addCriterion("invoice_reason is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceReasonEqualTo(Byte value) {
            addCriterion("invoice_reason =", value, "invoiceReason");
            return (Criteria) this;
        }

        public Criteria andInvoiceReasonNotEqualTo(Byte value) {
            addCriterion("invoice_reason <>", value, "invoiceReason");
            return (Criteria) this;
        }

        public Criteria andInvoiceReasonGreaterThan(Byte value) {
            addCriterion("invoice_reason >", value, "invoiceReason");
            return (Criteria) this;
        }

        public Criteria andInvoiceReasonGreaterThanOrEqualTo(Byte value) {
            addCriterion("invoice_reason >=", value, "invoiceReason");
            return (Criteria) this;
        }

        public Criteria andInvoiceReasonLessThan(Byte value) {
            addCriterion("invoice_reason <", value, "invoiceReason");
            return (Criteria) this;
        }

        public Criteria andInvoiceReasonLessThanOrEqualTo(Byte value) {
            addCriterion("invoice_reason <=", value, "invoiceReason");
            return (Criteria) this;
        }

        public Criteria andInvoiceReasonIn(List<Byte> values) {
            addCriterion("invoice_reason in", values, "invoiceReason");
            return (Criteria) this;
        }

        public Criteria andInvoiceReasonNotIn(List<Byte> values) {
            addCriterion("invoice_reason not in", values, "invoiceReason");
            return (Criteria) this;
        }

        public Criteria andInvoiceReasonBetween(Byte value1, Byte value2) {
            addCriterion("invoice_reason between", value1, value2, "invoiceReason");
            return (Criteria) this;
        }

        public Criteria andInvoiceReasonNotBetween(Byte value1, Byte value2) {
            addCriterion("invoice_reason not between", value1, value2, "invoiceReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonIsNull() {
            addCriterion("exception_reason is null");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonIsNotNull() {
            addCriterion("exception_reason is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonEqualTo(String value) {
            addCriterion("exception_reason =", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonNotEqualTo(String value) {
            addCriterion("exception_reason <>", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonGreaterThan(String value) {
            addCriterion("exception_reason >", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonGreaterThanOrEqualTo(String value) {
            addCriterion("exception_reason >=", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonLessThan(String value) {
            addCriterion("exception_reason <", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonLessThanOrEqualTo(String value) {
            addCriterion("exception_reason <=", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonLike(String value) {
            addCriterion("exception_reason like", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonNotLike(String value) {
            addCriterion("exception_reason not like", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonIn(List<String> values) {
            addCriterion("exception_reason in", values, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonNotIn(List<String> values) {
            addCriterion("exception_reason not in", values, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonBetween(String value1, String value2) {
            addCriterion("exception_reason between", value1, value2, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonNotBetween(String value1, String value2) {
            addCriterion("exception_reason not between", value1, value2, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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