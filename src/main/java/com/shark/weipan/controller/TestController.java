package com.shark.weipan.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shark.weipan.common.webcode.AJAXResult;
import com.shark.weipan.dto.Test;
import com.shark.weipan.service.ITestService;

/**控制器
 * 
 * @author TUZE808
 *
 */
@Controller
public class TestController {
	
	@Autowired
	ITestService service;
	
	/** 测试接口 */
	@ResponseBody
	@RequestMapping("/getList.do")
	public AJAXResult getList() {
		List list = service.getList();
		AJAXResult result = AJAXResult.createSuccAjaxResult();
		result.setData(list);
		return result;
	}
	
	/** 测试接口 */
	@ResponseBody
	@RequestMapping("/insert.do")
	public AJAXResult insert(Test t) {
		service.insert(t);
		return AJAXResult.createSuccAjaxResult();
	}
	/** 测试接口 */
	@ResponseBody
	@RequestMapping("/update.do")
	public AJAXResult update(Test t) {
		service.insert(t);
		return AJAXResult.createSuccAjaxResult();
	}
	/** 测试接口 */
	@ResponseBody
	@RequestMapping("/delete.do")
	public AJAXResult delete(int id) {
		service.delete(id);
		return AJAXResult.createSuccAjaxResult();
	}
	
	
	@ResponseBody
	@RequestMapping("/getMap.do")
	public Map<String,Object> getMap() {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("hello", "json");
		map.put("world", null);
		map.put("my", "son");
		map.put("baby", "math");
		return map;
	}
	

	


}

