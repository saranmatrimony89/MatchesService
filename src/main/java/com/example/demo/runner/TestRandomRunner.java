package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class TestRandomRunner implements CommandLineRunner{

	@Value("${my.instance.id}")
	private String instanceId;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(instanceId);
		
	}

}
