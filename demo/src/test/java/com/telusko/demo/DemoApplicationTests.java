package com.telusko.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationTests.class, args){
		Dev obj = new Dev();
		obj.build();
	}
}

	@Test
	void contextLoads() {
	}

}

