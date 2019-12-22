package com.in28minutes.rest.webservices.restfulwebservices.helloworld
;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.HelloWorldBean;

@RestController 
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {

	@GetMapping(path="/hello-world")
public String helloWorld() {
	return "hello world";
}
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("hello world bean");
	}
	
	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		//throw new RuntimeException("what went wrong");
		return new HelloWorldBean(String.format("hello world %s", name));
	}
}
