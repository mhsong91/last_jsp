package com.last.jsp.vo;

public class UserInfo {
	private int uiNo;
	private String uiName;
	private String uiId;
	private String uiPwd;
	private int ciNo;
	private String address;
	public int getUiNo() {
		return uiNo;
	}
	public void setUiNo(int uiNo) {
		this.uiNo = uiNo;
	}
	public String getUiName() {
		return uiName;
	}
	public void setUiName(String uiName) {
		this.uiName = uiName;
	}
	public String getUiId() {
		return uiId;
	}
	public void setUiId(String uiId) {
		this.uiId = uiId;
	}
	public String getUiPwd() {
		return uiPwd;
	}
	public void setUiPwd(String uiPwd) {
		this.uiPwd = uiPwd;
	}
	public int getCiNo() {
		return ciNo;
	}
	public void setCiNo(int ciNo) {
		this.ciNo = ciNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserList [uiNo=" + uiNo + ", uiName=" + uiName + ", uiId=" + uiId + ", uiPwd=" + uiPwd + ", ciNo="
				+ ciNo + ", address=" + address + "]";
	}
	

}
