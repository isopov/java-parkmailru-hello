package ru.mail.park.java.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping("/")
	@CrossOrigin(origins = "https://isopov.github.io")
	public String hello(){
		return "Hello Park!";
	}
	
}
