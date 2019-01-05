package com.practice.springbootmaven;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RespApiController {

	@RequestMapping("/second")
	public String businesslogic()
	{
		return "welcome to spring boot";
	}
}
