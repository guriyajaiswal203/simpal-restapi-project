package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;

@RestController
@RequestMapping("cloudvendor")
public class CloudVendorAPIServices {

	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId)
	{
		CloudVendor cloudVendor;
		return new CloudVendor("c1","vendorone","address one","xxxx");
		
	}
	
	
}
