package com.kt.membership.tibero.domain.entity;

import java.sql.Timestamp;

public class NotiSendTbl {
	
	private String queueId;
	
	private Timestamp regDate;
	
	private String rsltFlag;
	
	private String mbrId;
	private String msgType;
	private String msgTitle;
	private String msgDesc;
	private Timestamp msgDate;
	private String ordNo;
	public String getQueueId() {
		return queueId;
	}
	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	public String getRsltFlag() {
		return rsltFlag;
	}
	public void setRsltFlag(String rsltFlag) {
		this.rsltFlag = rsltFlag;
	}
	public String getMbrId() {
		return mbrId;
	}
	public void setMbrId(String mbrId) {
		this.mbrId = mbrId;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getMsgTitle() {
		return msgTitle;
	}
	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}
	public String getMsgDesc() {
		return msgDesc;
	}
	public void setMsgDesc(String msgDesc) {
		this.msgDesc = msgDesc;
	}
	public Timestamp getMsgDate() {
		return msgDate;
	}
	public void setMsgDate(Timestamp msgDate) {
		this.msgDate = msgDate;
	}
	public String getOrdNo() {
		return ordNo;
	}
	public void setOrdNo(String ordNo) {
		this.ordNo = ordNo;
	}
	
	
}
