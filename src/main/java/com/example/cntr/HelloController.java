package com.example.cntr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
		@GetMapping(value= {"/hello"})
		public String sayHello() {
			return "Hello Spring Boot";
		}
}
