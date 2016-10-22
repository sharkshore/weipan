package com.shark.weipan.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**日志控制器
 * 
 * @author TUZE808
 *
 */
@Controller
public class TestLogController {
	
	//创建SLF4J对象
	private static final Logger logger = LoggerFactory.getLogger(TestLogController.class);

	
	@ResponseBody
	@RequestMapping("/testlog.do")
	public String test() {
		logger.info("----------<<{}>>---------","日志加载成功,JRebel");
		return new Date().toString();
	}
}




