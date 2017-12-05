package com.consul.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 王伟鑫 on 2017/7/4.
 */
@RestController
public class ServiceInstanceRestController {

	private static final Logger logger = LoggerFactory.getLogger(ServiceInstanceRestController.class);
	@Autowired
	DiscoveryClient discoveryClient;
	@GetMapping("/consul")
	public String dc() {
		String services = "Services: " + discoveryClient.getServices();
		System.out.println(services);
		return services;
	}

}
