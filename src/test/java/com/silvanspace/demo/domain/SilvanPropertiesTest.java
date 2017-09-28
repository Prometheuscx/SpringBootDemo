package com.silvanspace.demo.domain;

import com.silvanspace.demo.DemoApplication;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Descriptions:
 * @Author: Zhongjianlong
 * @Email: zhongjl@thinkive.com
 * @CreateDate: 06/09/2017
 * @CreateTime: 3:30 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class SilvanPropertiesTest {

	private static Logger logger = Logger.getLogger(SilvanPropertiesTest.class);

	@Autowired
	private SilvanProperties silvanProperties;

	@Test
	public void getProperties() {
		Assert.assertEquals(silvanProperties.getCode(), "001");
		Assert.assertEquals(silvanProperties.getName(), "测试");
		//Assert.assertEquals(silvanProperties.getAlais(),"测试");

		logger.info("测试随机数输出");
		logger.info("随机字符串:" + silvanProperties.getRandomString());
		logger.info("随机uuid:" + silvanProperties.getUuid());
		logger.info("随机int:" + silvanProperties.getRandomNumber());
		logger.info("随机long:" + silvanProperties.getRandomLong());
		logger.info("随机10以内的随机数:" + silvanProperties.getRandom1());
		logger.info("随机10-50的随机数:" + silvanProperties.getRandom2());
	}
}
