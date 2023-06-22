package com.raghav.durgeshtuts;

public class UserInfo {
	
	private String nameString;
	private String emailIdString;
	private String mobileString;
	private String fatherNameString;
	
	public UserInfo() {
		super();
	}

	public UserInfo(String nameString, String emailIdString, String mobileString, String fatherNameString) {
		super();
		this.nameString = nameString;
		this.emailIdString = emailIdString;
		this.mobileString = mobileString;
		this.fatherNameString = fatherNameString;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getEmailIdString() {
		return emailIdString;
	}

	public void setEmailIdString(String emailIdString) {
		this.emailIdString = emailIdString;
	}

	public String getMobileString() {
		return mobileString;
	}

	public void setMobileString(String mobileString) {
		this.mobileString = mobileString;
	}

	public String getFatherNameString() {
		return fatherNameString;
	}

	public void setFatherNameString(String fatherNameString) {
		this.fatherNameString = fatherNameString;
	}

	@Override
	public String toString() {
		return "UserInfo [nameString=" + nameString + ", emailIdString=" + emailIdString + ", mobileString="
				+ mobileString + ", fatherNameString=" + fatherNameString + "]";
	}
	
}
