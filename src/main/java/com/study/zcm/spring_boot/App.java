package com.study.zcm.spring_boot;

import org.springframework.boot.SpringApplication;

import com.study.zcm.spring_boot.Controller.SampleController;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}
}
