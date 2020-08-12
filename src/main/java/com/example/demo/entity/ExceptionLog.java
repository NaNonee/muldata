package com.example.demo.entity;

import java.util.Date;

public class ExceptionLog {
    private String excId;

    private String excReq;

    private String excName;

    private String excMessage;

    private String operUid;

    private String operUname;

    private String operMethod;

    private String operUri;

    private String operIp;

    private String operVer;

    private Date operCreateTime;

    public ExceptionLog(String excId, String excReq, String excName, String excMessage, String operUid, String operUname, String operMethod, String operUri, String operIp, String operVer, Date operCreateTime) {
        this.excId = excId;
        this.excReq = excReq;
        this.excName = excName;
        this.excMessage = excMessage;
        this.operUid = operUid;
        this.operUname = operUname;
        this.operMethod = operMethod;
        this.operUri = operUri;
        this.operIp = operIp;
        this.operVer = operVer;
        this.operCreateTime = operCreateTime;
    }

    public ExceptionLog() {
        super();
    }

    public String getExcId() {
        return excId;
    }

    public void setExcId(String excId) {
        this.excId = excId == null ? null : excId.trim();
    }

    public String getExcReq() {
        return excReq;
    }

    public void setExcReq(String excReq) {
        this.excReq = excReq == null ? null : excReq.trim();
    }

    public String getExcName() {
        return excName;
    }

    public void setExcName(String excName) {
        this.excName = excName == null ? null : excName.trim();
    }

    public String getExcMessage() {
        return excMessage;
    }

    public void setExcMessage(String excMessage) {
        this.excMessage = excMessage == null ? null : excMessage.trim();
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

    public String getOperVer() {
        return operVer;
    }

    public void setOperVer(String operVer) {
        this.operVer = operVer == null ? null : operVer.trim();
    }

    public Date getOperCreateTime() {
        return operCreateTime;
    }

    public void setOperCreateTime(Date operCreateTime) {
        this.operCreateTime = operCreateTime;
    }
}