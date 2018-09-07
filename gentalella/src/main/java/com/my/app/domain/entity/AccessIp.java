package com.my.app.domain.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "access_ip")
public class AccessIp {
	
	@Id
	@Column(name= "ip")
	private String ip = null;
	
	@Column(name = "memo")
	private String memo = null;
	
	@Column(name = "use_yn")
	private String useYn = null;
	
	@Column(name = "reg_id")
	private String regId = null;
	
	@Column(name = "reg_date")
	private Timestamp regDate  = null;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	
	

}
