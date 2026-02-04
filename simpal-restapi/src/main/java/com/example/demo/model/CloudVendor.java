package com.example.demo.model;

import lombok.Data;

@Data
public class CloudVendor {
	
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhoneNo;
	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNo) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNo = vendorPhoneNo;
	}
	public CloudVendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
