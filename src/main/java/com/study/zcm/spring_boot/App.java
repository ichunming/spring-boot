/**
 * 启动入口
 * 2016/03/24
 * zhangchunming
 */
package com.study.zcm.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@ComponentScan("com.study.zcm.spring_boot")
@EntityScan("com.study.zcm.spring_boot.Entity")
@EnableJpaRepositories("com.study.zcm.spring_boot.repository")
public class App 
{
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
}
