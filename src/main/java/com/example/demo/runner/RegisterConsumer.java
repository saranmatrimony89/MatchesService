package com.example.demo.runner;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class RegisterConsumer {
	
	@Autowired
	private LoadBalancerClient balancerClient;
	
	public String getRegister() {
		System.out.println("!!!!!!!!!");
		ServiceInstance si=balancerClient.choose("REGISTER-APPLICATION");
		URI uri=si.getUri();
		String url=uri +"/register/member";
		RestTemplate rt= new RestTemplate();
		ResponseEntity<String> res=rt.getForEntity(url, String.class);
		return res.getBody();
	}
	
	public String getLoadBalancerClient() {
		System.out.println("!!!!!!!!!");
		ServiceInstance si=balancerClient.choose("REGISTER-APPLICATION");
		URI uri=si.getUri();
		String url=uri +"/register/member";
		RestTemplate rt= new RestTemplate();
		ResponseEntity<String> res=rt.getForEntity(url, String.class);
		return res.getBody();
	}
}
