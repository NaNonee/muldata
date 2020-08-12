package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExceptionLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExceptionLogExample() {
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

        public Criteria andExcIdIsNull() {
            addCriterion("exc_id is null");
            return (Criteria) this;
        }

        public Criteria andExcIdIsNotNull() {
            addCriterion("exc_id is not null");
            return (Criteria) this;
        }

        public Criteria andExcIdEqualTo(String value) {
            addCriterion("exc_id =", value, "excId");
            return (Criteria) this;
        }

        public Criteria andExcIdNotEqualTo(String value) {
            addCriterion("exc_id <>", value, "excId");
            return (Criteria) this;
        }

        public Criteria andExcIdGreaterThan(String value) {
            addCriterion("exc_id >", value, "excId");
            return (Criteria) this;
        }

        public Criteria andExcIdGreaterThanOrEqualTo(String value) {
            addCriterion("exc_id >=", value, "excId");
            return (Criteria) this;
        }

        public Criteria andExcIdLessThan(String value) {
            addCriterion("exc_id <", value, "excId");
            return (Criteria) this;
        }

        public Criteria andExcIdLessThanOrEqualTo(String value) {
            addCriterion("exc_id <=", value, "excId");
            return (Criteria) this;
        }

        public Criteria andExcIdLike(String value) {
            addCriterion("exc_id like", value, "excId");
            return (Criteria) this;
        }

        public Criteria andExcIdNotLike(String value) {
            addCriterion("exc_id not like", value, "excId");
            return (Criteria) this;
        }

        public Criteria andExcIdIn(List<String> values) {
            addCriterion("exc_id in", values, "excId");
            return (Criteria) this;
        }

        public Criteria andExcIdNotIn(List<String> values) {
            addCriterion("exc_id not in", values, "excId");
            return (Criteria) this;
        }

        public Criteria andExcIdBetween(String value1, String value2) {
            addCriterion("exc_id between", value1, value2, "excId");
            return (Criteria) this;
        }

        public Criteria andExcIdNotBetween(String value1, String value2) {
            addCriterion("exc_id not between", value1, value2, "excId");
            return (Criteria) this;
        }

        public Criteria andExcReqIsNull() {
            addCriterion("exc_req is null");
            return (Criteria) this;
        }

        public Criteria andExcReqIsNotNull() {
            addCriterion("exc_req is not null");
            return (Criteria) this;
        }

        public Criteria andExcReqEqualTo(String value) {
            addCriterion("exc_req =", value, "excReq");
            return (Criteria) this;
        }

        public Criteria andExcReqNotEqualTo(String value) {
            addCriterion("exc_req <>", value, "excReq");
            return (Criteria) this;
        }

        public Criteria andExcReqGreaterThan(String value) {
            addCriterion("exc_req >", value, "excReq");
            return (Criteria) this;
        }

        public Criteria andExcReqGreaterThanOrEqualTo(String value) {
            addCriterion("exc_req >=", value, "excReq");
            return (Criteria) this;
        }

        public Criteria andExcReqLessThan(String value) {
            addCriterion("exc_req <", value, "excReq");
            return (Criteria) this;
        }

        public Criteria andExcReqLessThanOrEqualTo(String value) {
            addCriterion("exc_req <=", value, "excReq");
            return (Criteria) this;
        }

        public Criteria andExcReqLike(String value) {
            addCriterion("exc_req like", value, "excReq");
            return (Criteria) this;
        }

        public Criteria andExcReqNotLike(String value) {
            addCriterion("exc_req not like", value, "excReq");
            return (Criteria) this;
        }

        public Criteria andExcReqIn(List<String> values) {
            addCriterion("exc_req in", values, "excReq");
            return (Criteria) this;
        }

        public Criteria andExcReqNotIn(List<String> values) {
            addCriterion("exc_req not in", values, "excReq");
            return (Criteria) this;
        }

        public Criteria andExcReqBetween(String value1, String value2) {
            addCriterion("exc_req between", value1, value2, "excReq");
            return (Criteria) this;
        }

        public Criteria andExcReqNotBetween(String value1, String value2) {
            addCriterion("exc_req not between", value1, value2, "excReq");
            return (Criteria) this;
        }

        public Criteria andExcNameIsNull() {
            addCriterion("exc_name is null");
            return (Criteria) this;
        }

        public Criteria andExcNameIsNotNull() {
            addCriterion("exc_name is not null");
            return (Criteria) this;
        }

        public Criteria andExcNameEqualTo(String value) {
            addCriterion("exc_name =", value, "excName");
            return (Criteria) this;
        }

        public Criteria andExcNameNotEqualTo(String value) {
            addCriterion("exc_name <>", value, "excName");
            return (Criteria) this;
        }

        public Criteria andExcNameGreaterThan(String value) {
            addCriterion("exc_name >", value, "excName");
            return (Criteria) this;
        }

        public Criteria andExcNameGreaterThanOrEqualTo(String value) {
            addCriterion("exc_name >=", value, "excName");
            return (Criteria) this;
        }

        public Criteria andExcNameLessThan(String value) {
            addCriterion("exc_name <", value, "excName");
            return (Criteria) this;
        }

        public Criteria andExcNameLessThanOrEqualTo(String value) {
            addCriterion("exc_name <=", value, "excName");
            return (Criteria) this;
        }

        public Criteria andExcNameLike(String value) {
            addCriterion("exc_name like", value, "excName");
            return (Criteria) this;
        }

        public Criteria andExcNameNotLike(String value) {
            addCriterion("exc_name not like", value, "excName");
            return (Criteria) this;
        }

        public Criteria andExcNameIn(List<String> values) {
            addCriterion("exc_name in", values, "excName");
            return (Criteria) this;
        }

        public Criteria andExcNameNotIn(List<String> values) {
            addCriterion("exc_name not in", values, "excName");
            return (Criteria) this;
        }

        public Criteria andExcNameBetween(String value1, String value2) {
            addCriterion("exc_name between", value1, value2, "excName");
            return (Criteria) this;
        }

        public Criteria andExcNameNotBetween(String value1, String value2) {
            addCriterion("exc_name not between", value1, value2, "excName");
            return (Criteria) this;
        }

        public Criteria andExcMessageIsNull() {
            addCriterion("exc_message is null");
            return (Criteria) this;
        }

        public Criteria andExcMessageIsNotNull() {
            addCriterion("exc_message is not null");
            return (Criteria) this;
        }

        public Criteria andExcMessageEqualTo(String value) {
            addCriterion("exc_message =", value, "excMessage");
            return (Criteria) this;
        }

        public Criteria andExcMessageNotEqualTo(String value) {
            addCriterion("exc_message <>", value, "excMessage");
            return (Criteria) this;
        }

        public Criteria andExcMessageGreaterThan(String value) {
            addCriterion("exc_message >", value, "excMessage");
            return (Criteria) this;
        }

        public Criteria andExcMessageGreaterThanOrEqualTo(String value) {
            addCriterion("exc_message >=", value, "excMessage");
            return (Criteria) this;
        }

        public Criteria andExcMessageLessThan(String value) {
            addCriterion("exc_message <", value, "excMessage");
            return (Criteria) this;
        }

        public Criteria andExcMessageLessThanOrEqualTo(String value) {
            addCriterion("exc_message <=", value, "excMessage");
            return (Criteria) this;
        }

        public Criteria andExcMessageLike(String value) {
            addCriterion("exc_message like", value, "excMessage");
            return (Criteria) this;
        }

        public Criteria andExcMessageNotLike(String value) {
            addCriterion("exc_message not like", value, "excMessage");
            return (Criteria) this;
        }

        public Criteria andExcMessageIn(List<String> values) {
            addCriterion("exc_message in", values, "excMessage");
            return (Criteria) this;
        }

        public Criteria andExcMessageNotIn(List<String> values) {
            addCriterion("exc_message not in", values, "excMessage");
            return (Criteria) this;
        }

        public Criteria andExcMessageBetween(String value1, String value2) {
            addCriterion("exc_message between", value1, value2, "excMessage");
            return (Criteria) this;
        }

        public Criteria andExcMessageNotBetween(String value1, String value2) {
            addCriterion("exc_message not between", value1, value2, "excMessage");
            return (Criteria) this;
        }

        public Criteria andOperUidIsNull() {
            addCriterion("oper_uid is null");
            return (Criteria) this;
        }

        public Criteria andOperUidIsNotNull() {
            addCriterion("oper_uid is not null");
            return (Criteria) this;
        }

        public Criteria andOperUidEqualTo(String value) {
            addCriterion("oper_uid =", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidNotEqualTo(String value) {
            addCriterion("oper_uid <>", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidGreaterThan(String value) {
            addCriterion("oper_uid >", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidGreaterThanOrEqualTo(String value) {
            addCriterion("oper_uid >=", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidLessThan(String value) {
            addCriterion("oper_uid <", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidLessThanOrEqualTo(String value) {
            addCriterion("oper_uid <=", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidLike(String value) {
            addCriterion("oper_uid like", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidNotLike(String value) {
            addCriterion("oper_uid not like", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidIn(List<String> values) {
            addCriterion("oper_uid in", values, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidNotIn(List<String> values) {
            addCriterion("oper_uid not in", values, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidBetween(String value1, String value2) {
            addCriterion("oper_uid between", value1, value2, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidNotBetween(String value1, String value2) {
            addCriterion("oper_uid not between", value1, value2, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUnameIsNull() {
            addCriterion("oper_uname is null");
            return (Criteria) this;
        }

        public Criteria andOperUnameIsNotNull() {
            addCriterion("oper_uname is not null");
            return (Criteria) this;
        }

        public Criteria andOperUnameEqualTo(String value) {
            addCriterion("oper_uname =", value, "operUname");
            return (Criteria) this;
        }

        public Criteria andOperUnameNotEqualTo(String value) {
            addCriterion("oper_uname <>", value, "operUname");
            return (Criteria) this;
        }

        public Criteria andOperUnameGreaterThan(String value) {
            addCriterion("oper_uname >", value, "operUname");
            return (Criteria) this;
        }

        public Criteria andOperUnameGreaterThanOrEqualTo(String value) {
            addCriterion("oper_uname >=", value, "operUname");
            return (Criteria) this;
        }

        public Criteria andOperUnameLessThan(String value) {
            addCriterion("oper_uname <", value, "operUname");
            return (Criteria) this;
        }

        public Criteria andOperUnameLessThanOrEqualTo(String value) {
            addCriterion("oper_uname <=", value, "operUname");
            return (Criteria) this;
        }

        public Criteria andOperUnameLike(String value) {
            addCriterion("oper_uname like", value, "operUname");
            return (Criteria) this;
        }

        public Criteria andOperUnameNotLike(String value) {
            addCriterion("oper_uname not like", value, "operUname");
            return (Criteria) this;
        }

        public Criteria andOperUnameIn(List<String> values) {
            addCriterion("oper_uname in", values, "operUname");
            return (Criteria) this;
        }

        public Criteria andOperUnameNotIn(List<String> values) {
            addCriterion("oper_uname not in", values, "operUname");
            return (Criteria) this;
        }

        public Criteria andOperUnameBetween(String value1, String value2) {
            addCriterion("oper_uname between", value1, value2, "operUname");
            return (Criteria) this;
        }

        public Criteria andOperUnameNotBetween(String value1, String value2) {
            addCriterion("oper_uname not between", value1, value2, "operUname");
            return (Criteria) this;
        }

        public Criteria andOperMethodIsNull() {
            addCriterion("oper_method is null");
            return (Criteria) this;
        }

        public Criteria andOperMethodIsNotNull() {
            addCriterion("oper_method is not null");
            return (Criteria) this;
        }

        public Criteria andOperMethodEqualTo(String value) {
            addCriterion("oper_method =", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodNotEqualTo(String value) {
            addCriterion("oper_method <>", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodGreaterThan(String value) {
            addCriterion("oper_method >", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodGreaterThanOrEqualTo(String value) {
            addCriterion("oper_method >=", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodLessThan(String value) {
            addCriterion("oper_method <", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodLessThanOrEqualTo(String value) {
            addCriterion("oper_method <=", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodLike(String value) {
            addCriterion("oper_method like", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodNotLike(String value) {
            addCriterion("oper_method not like", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodIn(List<String> values) {
            addCriterion("oper_method in", values, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodNotIn(List<String> values) {
            addCriterion("oper_method not in", values, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodBetween(String value1, String value2) {
            addCriterion("oper_method between", value1, value2, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodNotBetween(String value1, String value2) {
            addCriterion("oper_method not between", value1, value2, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperUriIsNull() {
            addCriterion("oper_uri is null");
            return (Criteria) this;
        }

        public Criteria andOperUriIsNotNull() {
            addCriterion("oper_uri is not null");
            return (Criteria) this;
        }

        public Criteria andOperUriEqualTo(String value) {
            addCriterion("oper_uri =", value, "operUri");
            return (Criteria) this;
        }

        public Criteria andOperUriNotEqualTo(String value) {
            addCriterion("oper_uri <>", value, "operUri");
            return (Criteria) this;
        }

        public Criteria andOperUriGreaterThan(String value) {
            addCriterion("oper_uri >", value, "operUri");
            return (Criteria) this;
        }

        public Criteria andOperUriGreaterThanOrEqualTo(String value) {
            addCriterion("oper_uri >=", value, "operUri");
            return (Criteria) this;
        }

        public Criteria andOperUriLessThan(String value) {
            addCriterion("oper_uri <", value, "operUri");
            return (Criteria) this;
        }

        public Criteria andOperUriLessThanOrEqualTo(String value) {
            addCriterion("oper_uri <=", value, "operUri");
            return (Criteria) this;
        }

        public Criteria andOperUriLike(String value) {
            addCriterion("oper_uri like", value, "operUri");
            return (Criteria) this;
        }

        public Criteria andOperUriNotLike(String value) {
            addCriterion("oper_uri not like", value, "operUri");
            return (Criteria) this;
        }

        public Criteria andOperUriIn(List<String> values) {
            addCriterion("oper_uri in", values, "operUri");
            return (Criteria) this;
        }

        public Criteria andOperUriNotIn(List<String> values) {
            addCriterion("oper_uri not in", values, "operUri");
            return (Criteria) this;
        }

        public Criteria andOperUriBetween(String value1, String value2) {
            addCriterion("oper_uri between", value1, value2, "operUri");
            return (Criteria) this;
        }

        public Criteria andOperUriNotBetween(String value1, String value2) {
            addCriterion("oper_uri not between", value1, value2, "operUri");
            return (Criteria) this;
        }

        public Criteria andOperIpIsNull() {
            addCriterion("oper_ip is null");
            return (Criteria) this;
        }

        public Criteria andOperIpIsNotNull() {
            addCriterion("oper_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOperIpEqualTo(String value) {
            addCriterion("oper_ip =", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpNotEqualTo(String value) {
            addCriterion("oper_ip <>", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpGreaterThan(String value) {
            addCriterion("oper_ip >", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpGreaterThanOrEqualTo(String value) {
            addCriterion("oper_ip >=", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpLessThan(String value) {
            addCriterion("oper_ip <", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpLessThanOrEqualTo(String value) {
            addCriterion("oper_ip <=", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpLike(String value) {
            addCriterion("oper_ip like", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpNotLike(String value) {
            addCriterion("oper_ip not like", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpIn(List<String> values) {
            addCriterion("oper_ip in", values, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpNotIn(List<String> values) {
            addCriterion("oper_ip not in", values, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpBetween(String value1, String value2) {
            addCriterion("oper_ip between", value1, value2, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpNotBetween(String value1, String value2) {
            addCriterion("oper_ip not between", value1, value2, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperVerIsNull() {
            addCriterion("oper_ver is null");
            return (Criteria) this;
        }

        public Criteria andOperVerIsNotNull() {
            addCriterion("oper_ver is not null");
            return (Criteria) this;
        }

        public Criteria andOperVerEqualTo(String value) {
            addCriterion("oper_ver =", value, "operVer");
            return (Criteria) this;
        }

        public Criteria andOperVerNotEqualTo(String value) {
            addCriterion("oper_ver <>", value, "operVer");
            return (Criteria) this;
        }

        public Criteria andOperVerGreaterThan(String value) {
            addCriterion("oper_ver >", value, "operVer");
            return (Criteria) this;
        }

        public Criteria andOperVerGreaterThanOrEqualTo(String value) {
            addCriterion("oper_ver >=", value, "operVer");
            return (Criteria) this;
        }

        public Criteria andOperVerLessThan(String value) {
            addCriterion("oper_ver <", value, "operVer");
            return (Criteria) this;
        }

        public Criteria andOperVerLessThanOrEqualTo(String value) {
            addCriterion("oper_ver <=", value, "operVer");
            return (Criteria) this;
        }

        public Criteria andOperVerLike(String value) {
            addCriterion("oper_ver like", value, "operVer");
            return (Criteria) this;
        }

        public Criteria andOperVerNotLike(String value) {
            addCriterion("oper_ver not like", value, "operVer");
            return (Criteria) this;
        }

        public Criteria andOperVerIn(List<String> values) {
            addCriterion("oper_ver in", values, "operVer");
            return (Criteria) this;
        }

        public Criteria andOperVerNotIn(List<String> values) {
            addCriterion("oper_ver not in", values, "operVer");
            return (Criteria) this;
        }

        public Criteria andOperVerBetween(String value1, String value2) {
            addCriterion("oper_ver between", value1, value2, "operVer");
            return (Criteria) this;
        }

        public Criteria andOperVerNotBetween(String value1, String value2) {
            addCriterion("oper_ver not between", value1, value2, "operVer");
            return (Criteria) this;
        }

        public Criteria andOperCreateTimeIsNull() {
            addCriterion("oper_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOperCreateTimeIsNotNull() {
            addCriterion("oper_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("oper_create_time =", value, "operCreateTime");
            return (Criteria) this;
        }

        public Criteria andOperCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("oper_create_time <>", value, "operCreateTime");
            return (Criteria) this;
        }

        public Criteria andOperCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("oper_create_time >", value, "operCreateTime");
            return (Criteria) this;
        }

        public Criteria andOperCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("oper_create_time >=", value, "operCreateTime");
            return (Criteria) this;
        }

        public Criteria andOperCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("oper_create_time <", value, "operCreateTime");
            return (Criteria) this;
        }

        public Criteria andOperCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("oper_create_time <=", value, "operCreateTime");
            return (Criteria) this;
        }

        public Criteria andOperCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("oper_create_time in", values, "operCreateTime");
            return (Criteria) this;
        }

        public Criteria andOperCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("oper_create_time not in", values, "operCreateTime");
            return (Criteria) this;
        }

        public Criteria andOperCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("oper_create_time between", value1, value2, "operCreateTime");
            return (Criteria) this;
        }

        public Criteria andOperCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("oper_create_time not between", value1, value2, "operCreateTime");
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