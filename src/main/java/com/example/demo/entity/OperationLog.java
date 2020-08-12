package com.example.demo.entity;

import java.util.Date;

public class OperationLog {
    private String operId;

    private String operModul;

    private String operType;

    private String operDesc;

    private String operReq;

    private String operRes;

    private String operUid;

    private String operUname;

    private String operMethod;

    private String operUri;

    private String operIp;

    private Date operCreateTime;

    private String operVer;

    public OperationLog(String operId, String operModul, String operType, String operDesc, String operReq, String operRes, String operUid, String operUname, String operMethod, String operUri, String operIp, Date operCreateTime, String operVer) {
        this.operId = operId;
        this.operModul = operModul;
        this.operType = operType;
        this.operDesc = operDesc;
        this.operReq = operReq;
        this.operRes = operRes;
        this.operUid = operUid;
        this.operUname = operUname;
        this.operMethod = operMethod;
        this.operUri = operUri;
        this.operIp = operIp;
        this.operCreateTime = operCreateTime;
        this.operVer = operVer;
    }

    public OperationLog() {
        super();
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId == null ? null : operId.trim();
    }

    public String getOperModul() {
        return operModul;
    }

    public void setOperModul(String operModul) {
        this.operModul = operModul == null ? null : operModul.trim();
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType == null ? null : operType.trim();
    }

    public String getOperDesc() {
        return operDesc;
    }

    public void setOperDesc(String operDesc) {
        this.operDesc = operDesc == null ? null : operDesc.trim();
    }

    public String getOperReq() {
        return operReq;
    }

    public void setOperReq(String operReq) {
        this.operReq = operReq == null ? null : operReq.trim();
    }

    public String getOperRes() {
        return operRes;
    }

    public void setOperRes(String operRes) {
        this.operRes = operRes == null ? null : operRes.trim();
    }

    public String getOperUid() {
        return operUid;
    }

    public void setOperUid(String operUid) {
        this.operUid = operUid == null ? null : operUid.trim();
    }

    public String getOperUname() {
        return operUname;
    }

    public void setOperUname(String operUname) {
        this.operUname = operUname == null ? null : operUname.trim();
    }

    public String getOperMethod() {
        return operMethod;
    }

    public void setOperMethod(String operMethod) {
        this.operMethod = operMethod == null ? null : operMethod.trim();
    }

    public String getOperUri() {
        return operUri;
    }

    public void setOperUri(String operUri) {
        this.operUri = operUri == null ? null : operUri.trim();
    }

    public String getOperIp() {
        return operIp;
    }

    public void setOperIp(String operIp) {
        this.operIp = operIp == null ? null : operIp.trim();
    }

    public Date getOperCreateTime() {
        return operCreateTime;
    }

    public void setOperCreateTime(Date operCreateTime) {
        this.operCreateTime = operCreateTime;
    }

    public String getOperVer() {
        return operVer;
    }

    public void setOperVer(String operVer) {
        this.operVer = operVer == null ? null : operVer.trim();
    }
}