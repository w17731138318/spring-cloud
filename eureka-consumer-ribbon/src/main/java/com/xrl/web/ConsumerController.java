package com.xrl.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 王伟鑫 on 2017/7/4.
 * 消费者控制器
 */
@RestController
public class ConsumerController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/dc")
	public String dc() {
		System.out.println("ConsumerController:");
		return restTemplate.getForObject("http://eureka-client/dc", String.class);
	}
}
