package com.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

	@RequestMapping("/test")
	public String firstHandler() {
		return "it is the first one I have made using the link.";
	}
}
