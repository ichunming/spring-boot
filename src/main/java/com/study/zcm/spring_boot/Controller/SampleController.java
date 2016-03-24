/*
 * spring-boot demo:hello world
 * 2016/03/21
 * zhangchunming
 * */
package com.study.zcm.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "Hello World";
	}
}
