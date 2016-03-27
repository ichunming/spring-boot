/**
 * 启动入口
 * 2016/03/24
 * zhangchunming
 */
package com.study.zcm.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
//@EnableAutoConfiguration
//@ComponentScan("com.study.zcm.spring_boot")
//@EntityScan("com.study.zcm.spring_boot.Entity")
//@EnableJpaRepositories("com.study.zcm.spring_boot.repository")
@SpringBootApplication
public class App 
{
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
}
