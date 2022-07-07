package com.example.demo;

import lombok.Data;

@Data
public class Uketuke {
    private int ukeNo;
    private String seiName;
	private String meiName;
    private String nkAdd;
	private String nmAdd1;
	private String nmAdd2;
	private String nmAdd3;
    private String nkTel;
	private String genderNo;
    private String birthdayDt;
	private String nkMail;
	private String nkPass;
	
	public int getUkeNo() {
		return this.ukeNo
	}
	public void setUkeNo(int ukeNo) {
		this.ukeNo = ukeNo;
	}
	
	public String getSeiName() {
		return this.seiName
	}
	public void setSeiName(String seiName) {
		this.seiName = seiName;
	}
	
	public String getMeiName() {
		return this.meiName
	}
	public void setMeiName(String meiName) {
		this.meiName = meiName;
	}
	
	public String getNkAdd() {
		return this.nkAdd
	}
	public void setNkAdd(String nkAdd) {
		this.nkAdd = nkAdd;
	}
	
	public String getNmAdd1() {
		return this.nmAdd1
	}
	public void setNmAdd1(String nmAdd1) {
		this.nmAdd1 = nmAdd1;
	}
	
	public String getNmAdd2() {
		return this.nmAdd2
	}
	public void setNmAdd2(String nmAdd2) {
		this.nmAdd2 = nmAdd2;
	}
	
	public String getNmAdd3() {
		return this.nmAdd3
	}
	public void setNmAdd3(String nmAdd3) {
		this.nmAdd3 = nmAdd3;
	}
	
	public String getNkTel() {
		return this.nkTel
	}
	public void setNkTel(String nkTel) {
		this.nkTel = nkTel;
	}
	
	public String getGenderNo() {
		return this.genderNo
	}
	public void setGenderNo(String genderNo) {
		this.genderNo = genderNo;
	}
	
	public String getBirthdayDt() {
		return this.birthdayDt
	}
	public void setBirthdayDt(String birthdayDt) {
		this.birthdayDt = birthdayDt;
	}
	
	public String getNkMail() {
		return this.nkMail
	}
	public void setNkMail(String nkMail) {
		this.nkMail = nkMail;
	}
	
	public String getNkPass() {
		return this.nkPass
	}
	public void setNkPass(String nkPass) {
		this.nkPass = nkPass;
	}
}