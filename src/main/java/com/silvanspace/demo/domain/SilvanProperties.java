package com.silvanspace.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Descriptions:
 * @Author: Zhongjianlong
 * @Email: zhongjl@thinkive.com
 * @CreateDate: 06/09/2017
 * @CreateTime: 3:23 PM
 * @Since: 1.6
 */
@Component
public class SilvanProperties {

	@Value("${com.silvanspace.demo.name}")
	private String name;

	@Value("${com.silvanspace.demo.code}")
	private String code;

	@Value("${com.silvanspace.demo.alias}")
	private String alais;

	@Value("${com.silvanspace.demo.value}")
	private String randomString;
	@Value("${com.silvanspace.demo.uuid}")
	private String uuid;
	@Value("${com.silvanspace.demo.number}")
	private int randomNumber;
	@Value("${com.silvanspace.demo.bigNumber}")
	private long randomLong;
	@Value("${com.silvanspace.demo.random1}")
	private int random1;
	@Value("${com.silvanspace.demo.random2}")
	private int random2;

	public String getAlais() {
		return alais;
	}

	public void setAlais(String alais) {
		this.alais = alais;
	}

	public String getRandomString() {
		return randomString;
	}

	public void setRandomString(String randomString) {
		this.randomString = randomString;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}

	public long getRandomLong() {
		return randomLong;
	}

	public void setRandomLong(long randomLong) {
		this.randomLong = randomLong;
	}

	public int getRandom1() {
		return random1;
	}

	public void setRandom1(int random1) {
		this.random1 = random1;
	}

	public int getRandom2() {
		return random2;
	}

	public void setRandom2(int random2) {
		this.random2 = random2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
