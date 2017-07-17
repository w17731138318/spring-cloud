package com.xrl.service;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 王伟鑫 on 2017/7/4.
 */
@Service
public class ClientService {

	private final DiscoveryClient disc;

	public ClientService(DiscoveryClient disc){
		this.disc=disc;
	}

	public List<ServiceInstance> serviceInstancesByApplicationName(){
		List<ServiceInstance> list=this.disc.getInstances("a-bootiful-client");
		return list;
	}

}
