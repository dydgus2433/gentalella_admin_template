package com.my.app.domain.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login implements Serializable{

	@Column(name= "olleh_id")
	private String ollehId;
	
	@Id
	@Column(name="mbr_id")
	private String mbrId;
	
	@Column(name = "auth_key")
	private String authKey;
	
	@Column(name = "os")
	private String os;
	
	@Column(name = "version")
	private String version;
	
	@Column(name = "device_id")
	private String deviceId;
	
	@Column(name = "credential_id")
	private String credentialId;
	
	@Column(name = "login_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", insertable= true, updatable = true)
	private Timestamp loginDate;

	public String getOllehId() {
		return ollehId;
	}

	public void setOllehId(String ollehId) {
		this.ollehId = ollehId;
	}

	public String getMbrId() {
		return mbrId;
	}

	public void setMbrId(String mbrId) {
		this.mbrId = mbrId;
	}

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(String credentialId) {
		this.credentialId = credentialId;
	}

	public Timestamp getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Timestamp loginDate) {
		this.loginDate = loginDate;
	}

	@Override
	public String toString() {
		return "Login [ollehId=" + ollehId + ", mbrId=" + mbrId + ", authKey=" + authKey + ", os=" + os + ", version="
				+ version + ", deviceId=" + deviceId + ", credentialId=" + credentialId + ", loginDate=" + loginDate
				+ "]";
	}
	
	
}
