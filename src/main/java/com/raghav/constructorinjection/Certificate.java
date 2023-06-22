package com.raghav.constructorinjection;

public class Certificate {
	private String certName;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String certName) {
		super();
		this.certName = certName;
	}

	@Override
	public String toString() {
		return "Certificate [certName=" + certName + "]";
	}
	
	
}
