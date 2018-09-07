package com.my.app.adapter.cdm.custbillinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonHeader", propOrder = {
		
		"appName",
		"svcName",
		"fnName"
})
public class CommonHeader {
	
	@XmlElement(namespace = "http://bizhub.kt.com", required = true)
	protected String appName;
	@XmlElement(namespace = "http://bizhub.kt.com", required = true)
	protected String svcName;
	@XmlElement(namespace = "http://bizhub.kt.com")
	protected String fnName;
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getSvcName() {
		return svcName;
	}
	public void setSvcName(String svcName) {
		this.svcName = svcName;
	}
	public String getFnName() {
		return fnName;
	}
	public void setFnName(String fnName) {
		this.fnName = fnName;
	}
	
	
}
