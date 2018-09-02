package com.kt.membership.domain.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name="notice_popup")
public class NoticePopup implements Serializable{
	@Id
	@Column(name="id")
	@Type(type="uuid-char")
	private UUID id;
	
	@Column(name="type")
	private Character type;
	
	@Column(name="start_date")
	private Timestamp startDate;
	
	@Column(name= "end_date")
	private Timestamp endDate;
	
	@Column(name="contents")
	private String contents;
	
	@Column(name = "url")
	private String url;
	
	@Column(name= "image")
	private String image;
	
	@Column(name = "menu")
	private String menu;
	
	@Column(name = "exit_yn")
	private String exitYn;
	
	@Column(name= "reg_date")
	private Timestamp regDate;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Character getType() {
		return type;
	}

	public void setType(Character type) {
		this.type = type;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getExitYn() {
		return exitYn;
	}

	public void setExitYn(String exitYn) {
		this.exitYn = exitYn;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	
	
}
