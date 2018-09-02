package com.kt.membership.tibero.domain.entity;

public class ParamGetOrdList {

	private String inPgEpayOrd ; //간편결제 결제처리 패키지 proxy
	private String inqType;		//O= OrdNo 기준, M = MbrId기준
	private String inInqKey;	//ordNo / MbrId
	private String inMonths = "6"; // default = 6
	private String inPage = "1";
	private String inRosw = "1";
	public String getInPgEpayOrd() {
		return inPgEpayOrd;
	}
	public void setInPgEpayOrd(String inPgEpayOrd) {
		this.inPgEpayOrd = inPgEpayOrd;
	}
	public String getInqType() {
		return inqType;
	}
	public void setInqType(String inqType) {
		this.inqType = inqType;
	}
	public String getInInqKey() {
		return inInqKey;
	}
	public void setInInqKey(String inInqKey) {
		this.inInqKey = inInqKey;
	}
	public String getInMonths() {
		return inMonths;
	}
	public void setInMonths(String inMonths) {
		this.inMonths = inMonths;
	}
	public String getInPage() {
		return inPage;
	}
	public void setInPage(String inPage) {
		this.inPage = inPage;
	}
	public String getInRosw() {
		return inRosw;
	}
	public void setInRosw(String inRosw) {
		this.inRosw = inRosw;
	}
	
	
}
