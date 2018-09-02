package com.kt.membership.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class AppPrimaryKey implements Serializable{

	@Column(name = "os")
	private String os;
	
	@Column(name = "version")
	private String version;
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof AppPrimaryKey)) return false;
		
		AppPrimaryKey that = (AppPrimaryKey) o;
		
		if(!getOs().equals(that.getOs())) return false;
		return getVersion().equals(that.getVersion());
	}
	
	@Override
	public int hashCode() {
		int result = getOs().hashCode();
		result = 31 * result + getVersion().hashCode();
		return result;
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

	@Override
	public String toString() {
		return "AppPrimaryKey [os=" + os + ", version=" + version + ", hashCode()=" + hashCode() + ", getOs()="
				+ getOs() + ", getVersion()=" + getVersion() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
