package com.example.smssending.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="smssending")
public class modelcls {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String smsid;
	private String mesges;
	private String mesgtype;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSmsid() {
		return smsid;
	}
	public void setSmsid(String smsid) {
		this.smsid = smsid;
	}
	public String getMesges() {
		return mesges;
	}
	public void setMesges(String mesges) {
		this.mesges = mesges;
	}
	public String getMesgtype() {
		return mesgtype;
	}
	public void setMesgtype(String mesgtype) {
		this.mesgtype = mesgtype;
	}

}
