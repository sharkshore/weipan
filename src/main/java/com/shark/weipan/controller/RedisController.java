package com.shark.weipan.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shark.weipan.common.webcode.AJAXResult;
import com.shark.weipan.service.IRedisTestService;

@Controller
public class RedisController {
	//创建SLF4J对象
	private static final Logger logger = LoggerFactory.getLogger(RedisController.class);

	@Autowired
	IRedisTestService service;
	
	@ResponseBody
	@RequestMapping("/redis/set.do")
	public AJAXResult set(@RequestParam String key,@RequestParam String value) {
		AJAXResult result = AJAXResult.createSuccAjaxResult();
		service.set(key, value);
		return result;
	}

	@ResponseBody
	@RequestMapping("/redis/delete.do")
	public AJAXResult delete(@RequestParam String key) {
		AJAXResult result = AJAXResult.createSuccAjaxResult();
		service.delete(key);
		return result;
	}
	@ResponseBody
	@RequestMapping("/redis/get.do")
	public AJAXResult set(@RequestParam String key) {
		AJAXResult result = AJAXResult.createSuccAjaxResult();
		String value = service.get(key);
		result.setData(value);
		return result;
	}


}
