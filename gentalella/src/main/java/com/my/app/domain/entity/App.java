package com.my.app.domain.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="app")
@IdClass(AppPrimaryKey.class)
public class App {
	
	@Id
	@Column(name = "os")
	private String os;
	
	@Id
	@Column(name= "version")
	private String version;
	
	@Column(name = "status")
	private Character status;
	
	@Column(name = "contents")
	private String contents;
	
	@Column(name = "reg_date")
	private Timestamp regDate;
	
	@Column(name = "version_int")
	private int versionInt;
	
	@Column(name = "market_url")
	private String marketUrl;
	
	@Column(name = "use_yn")
	private Character useYn;
	
	@Column(name = "hash_key")
	private String hashKey;

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

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public int getVersionInt() {
		return versionInt;
	}

	public void setVersionInt(int versionInt) {
		this.versionInt = versionInt;
	}

	public String getMarketUrl() {
		return marketUrl;
	}

	public void setMarketUrl(String marketUrl) {
		this.marketUrl = marketUrl;
	}

	public Character getUseYn() {
		return useYn;
	}

	public void setUseYn(Character useYn) {
		this.useYn = useYn;
	}

	public String getHashKey() {
		return hashKey;
	}

	public void setHashKey(String hashKey) {
		this.hashKey = hashKey;
	}

	@Override
	public String toString() {
		return "App [os=" + os + ", version=" + version + ", status=" + status + ", contents=" + contents + ", regDate="
				+ regDate + ", versionInt=" + versionInt + ", marketUrl=" + marketUrl + ", useYn=" + useYn
				+ ", hashKey=" + hashKey + "]";
	}
	
	
}
