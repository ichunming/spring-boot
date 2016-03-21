/*
 * spring-boot demo:hello world
 * 2016/03/21
 * zhangchunming
 * */
package com.study.zcm.spring_boot.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {
	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "Hello World";
	}
}
