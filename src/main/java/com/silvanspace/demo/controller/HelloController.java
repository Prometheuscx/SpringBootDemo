package com.silvanspace.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Descriptions:
 * @Author: Zhongjianlong
 * @Email: zhongjl@thinkive.com
 * @CreateDate: 06/09/2017
 * @CreateTime: 3:04 PM
 * @Since: 1.6
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Worlds";
	}
}
