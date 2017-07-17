package com.xrl.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by 王伟鑫 on 2017/7/4.
 */
@RestController
public class ServiceInstanceRestController {

	private static final Logger logger = LoggerFactory.getLogger(ServiceInstanceRestController.class);

	@GetMapping("/dc")
	public String dc() {
		String json=new Date().toString();
		System.out.println("ServiceInstanceRestController:"+json);
		return json;
	}

}
