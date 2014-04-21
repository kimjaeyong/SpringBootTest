package net.ibadboy.springboot.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@ResponseBody
	@RequestMapping("/")
	public String root() {
		return "Spring Boot Test";
	}
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "HelloWorld......";
	}
}
