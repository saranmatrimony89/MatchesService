package com.example.demo.runner;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("REGISTER-APPLICATION")
public interface IRegisterConsumer {
	@GetMapping("/register/member")
	public ResponseEntity<String> registerMember();
}
