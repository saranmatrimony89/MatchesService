package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.runner.IRegisterConsumer;
import com.example.demo.runner.RegisterConsumer;

@RestController
@RequestMapping("/member")
public class MemberRestController {
	@Autowired
	RegisterConsumer consumer;
	
	@Autowired
	IRegisterConsumer registerConsumer;
	
	@Value("${title}")
	private String frmConfigServer;
	
	@GetMapping("/test")
	public ResponseEntity<String> test() {
		System.out.println("member register Page");
		return ResponseEntity.ok(frmConfigServer);
	}
	
	@GetMapping("/register")
	public ResponseEntity<String> validatePayment() {
		System.out.println("member register Page");
		consumer.getRegister();
		return ResponseEntity.ok(	consumer.getRegister());
	}
	
	@GetMapping("/load")
	public ResponseEntity<String> load() {
		System.out.println("member register Page");
		consumer.getRegister();
		return ResponseEntity.ok(	consumer.getLoadBalancerClient());
	}
	
	@GetMapping("/feign")
	public ResponseEntity<?> getFiegn() {
		System.out.println("member register Page");
		consumer.getRegister();
		return ResponseEntity.ok(	registerConsumer.registerMember());
	}
}
