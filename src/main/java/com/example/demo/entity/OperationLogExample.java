package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OperationLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperationLogExample() {
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

        public Criteria andOperIdIsNull() {
            addCriterion("oper_id is null");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNotNull() {
            addCriterion("oper_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperIdEqualTo(String value) {
            addCriterion("oper_id =", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotEqualTo(String value) {
            addCriterion("oper_id <>", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThan(String value) {
            addCriterion("oper_id >", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThanOrEqualTo(String value) {
            addCriterion("oper_id >=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThan(String value) {
            addCriterion("oper_id <", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThanOrEqualTo(String value) {
            addCriterion("oper_id <=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLike(String value) {
            addCriterion("oper_id like", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotLike(String value) {
            addCriterion("oper_id not like", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdIn(List<String> values) {
            addCriterion("oper_id in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotIn(List<String> values) {
            addCriterion("oper_id not in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdBetween(String value1, String value2) {
            addCriterion("oper_id between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotBetween(String value1, String value2) {
            addCriterion("oper_id not between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperModulIsNull() {
            addCriterion("oper_modul is null");
            return (Criteria) this;
        }

        public Criteria andOperModulIsNotNull() {
            addCriterion("oper_modul is not null");
            return (Criteria) this;
        }

        public Criteria andOperModulEqualTo(String value) {
            addCriterion("oper_modul =", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulNotEqualTo(String value) {
            addCriterion("oper_modul <>", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulGreaterThan(String value) {
            addCriterion("oper_modul >", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulGreaterThanOrEqualTo(String value) {
            addCriterion("oper_modul >=", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulLessThan(String value) {
            addCriterion("oper_modul <", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulLessThanOrEqualTo(String value) {
            addCriterion("oper_modul <=", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulLike(String value) {
            addCriterion("oper_modul like", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulNotLike(String value) {
            addCriterion("oper_modul not like", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulIn(List<String> values) {
            addCriterion("oper_modul in", values, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulNotIn(List<String> values) {
            addCriterion("oper_modul not in", values, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulBetween(String value1, String value2) {
            addCriterion("oper_modul between", value1, value2, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulNotBetween(String value1, String value2) {
            addCriterion("oper_modul not between", value1, value2, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNull() {
            addCriterion("oper_type is null");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNotNull() {
            addCriterion("oper_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperTypeEqualTo(String value) {
            addCriterion("oper_type =", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotEqualTo(String value) {
            addCriterion("oper_type <>", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThan(String value) {
            addCriterion("oper_type >", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThanOrEqualTo(String value) {
            addCriterion("oper_type >=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThan(String value) {
            addCriterion("oper_type <", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThanOrEqualTo(String value) {
            addCriterion("oper_type <=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLike(String value) {
            addCriterion("oper_type like", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotLike(String value) {
            addCriterion("oper_type not like", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeIn(List<String> values) {
            addCriterion("oper_type in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotIn(List<String> values) {
            addCriterion("oper_type not in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeBetween(String value1, String value2) {
            addCriterion("oper_type between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotBetween(String value1, String value2) {
            addCriterion("oper_type not between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andOperDescIsNull() {
            addCriterion("oper_desc is null");
            return (Criteria) this;
        }

        public Criteria andOperDescIsNotNull() {
            addCriterion("oper_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOperDescEqualTo(String value) {
            addCriterion("oper_desc =", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescNotEqualTo(String value) {
            addCriterion("oper_desc <>", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescGreaterThan(String value) {
            addCriterion("oper_desc >", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescGreaterThanOrEqualTo(String value) {
            addCriterion("oper_desc >=", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescLessThan(String value) {
            addCriterion("oper_desc <", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescLessThanOrEqualTo(String value) {
            addCriterion("oper_desc <=", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescLike(String value) {
            addCriterion("oper_desc like", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescNotLike(String value) {
            addCriterion("oper_desc not like", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescIn(List<String> values) {
            addCriterion("oper_desc in", values, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescNotIn(List<String> values) {
            addCriterion("oper_desc not in", values, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescBetween(String value1, String value2) {
            addCriterion("oper_desc between", value1, value2, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescNotBetween(String value1, String value2) {
            addCriterion("oper_desc not between", value1, value2, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperReqIsNull() {
            addCriterion("oper_req is null");
            return (Criteria) this;
        }

        public Criteria andOperReqIsNotNull() {
            addCriterion("oper_req is not null");
            return (Criteria) this;
        }

        public Criteria andOperReqEqualTo(String value) {
            addCriterion("oper_req =", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqNotEqualTo(String value) {
            addCriterion("oper_req <>", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqGreaterThan(String value) {
            addCriterion("oper_req >", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqGreaterThanOrEqualTo(String value) {
            addCriterion("oper_req >=", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqLessThan(String value) {
            addCriterion("oper_req <", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqLessThanOrEqualTo(String value) {
            addCriterion("oper_req <=", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqLike(String value) {
            addCriterion("oper_req like", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqNotLike(String value) {
            addCriterion("oper_req not like", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqIn(List<String> values) {
            addCriterion("oper_req in", values, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqNotIn(List<String> values) {
            addCriterion("oper_req not in", values, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqBetween(String value1, String value2) {
            addCriterion("oper_req between", value1, value2, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqNotBetween(String value1, String value2) {
            addCriterion("oper_req not between", value1, value2, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperResIsNull() {
            addCriterion("oper_res is null");
            return (Criteria) this;
        }

        public Criteria andOperResIsNotNull() {
            addCriterion("oper_res is not null");
            return (Criteria) this;
        }

        public Criteria andOperResEqualTo(String value) {
            addCriterion("oper_res =", value, "operRes");
            return (Criteria) this;
        }

        public Criteria andOperResNotEqualTo(String value) {
            addCriterion("oper_res <>", value, "operRes");
            return (Criteria) this;
        }

        public Criteria andOperResGreaterThan(String value) {
            addCriterion("oper_res >", value, "operRes");
            return (Criteria) this;
        }

        public Criteria andOperResGreaterThanOrEqualTo(String value) {
            addCriterion("oper_res >=", value, "operRes");
            return (Criteria) this;
        }

        public Criteria andOperResLessThan(String value) {
            addCriterion("oper_res <", value, "operRes");
            return (Criteria) this;
        }

        public Criteria andOperResLessThanOrEqualTo(String value) {
            addCriterion("oper_res <=", value, "operRes");
            return (Criteria) this;
        }

        public Criteria andOperResLike(String value) {
            addCriterion("oper_res like", value, "operRes");
            return (Criteria) this;
        }

        public Criteria andOperResNotLike(String value) {
            addCriterion("oper_res not like", value, "operRes");
            return (Criteria) this;
        }

        public Criteria andOperResIn(List<String> values) {
            addCriterion("oper_res in", values, "operRes");
            return (Criteria) this;
        }

        public Criteria andOperResNotIn(List<String> values) {
            addCriterion("oper_res not in", values, "operRes");
            return (Criteria) this;
        }

        public Criteria andOperResBetween(String value1, String value2) {
            addCriterion("oper_res between", value1, value2, "operRes");
            return (Criteria) this;
        }

        public Criteria andOperResNotBetween(String value1, String value2) {
            addCriterion("oper_res not between", value1, value2, "operRes");
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