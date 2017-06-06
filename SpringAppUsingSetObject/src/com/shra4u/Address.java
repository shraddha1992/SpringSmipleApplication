package com.shra4u;

public class Address {

	private String line1;
	private String pincode;
	
	
	
	
	public Address(String line1, String pincode) {
		super();
		this.line1 = line1;
		this.pincode = pincode;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", pincode=" + pincode + "]";
	}
	
	
}
