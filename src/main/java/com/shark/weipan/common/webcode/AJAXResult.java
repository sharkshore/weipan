package com.shark.weipan.common.webcode;

import java.util.Calendar;

/**AjaxResult返回*/
public class AJAXResult {
	
	
	// 编码
	private Integer code = 1;

	// 中文消息
	private String message;

	// 英文消息
	private String engMessage;

	// 服务器时间戳
	private long timestamp = Calendar.getInstance().getTimeInMillis();

	// 服务端版本
	private String ver;

	private Object data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}



	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getEngMessage() {
		return engMessage;
	}

	public void setEngMessage(String engMessage) {
		this.engMessage = engMessage;
	}

	public static AJAXResult createSuccAjaxResult() {
		AJAXResult result = new AJAXResult();

		result.setCode(AJAXCode.Successful.code());
		result.setMessage(AJAXCode.Successful.zhmsg());
		result.setEngMessage(AJAXCode.Successful.enmsg());
		result.setVer("1.0");

		return result;
	}

	public static AJAXResult createErrorAjaxResult() {
		AJAXResult result = new AJAXResult();

		result.setCode(AJAXCode.Failure.code());
		result.setMessage(AJAXCode.Failure.zhmsg());
		result.setEngMessage(AJAXCode.Failure.enmsg());

		return result;
	}
	
	public static AJAXResult createErrorAjaxResult(AJAXCode ajaxCode,Object msg){
		AJAXResult result = new AJAXResult();

		result.setCode(ajaxCode.code());
		result.setMessage(msg.toString());
		result.setEngMessage(ajaxCode.enmsg());

		return result;
	}

	public static AJAXResult createErrorAjaxResult(AJAXCode ajaxCode) {
		AJAXResult result = new AJAXResult();

		result.setCode(ajaxCode.code());
		result.setMessage(ajaxCode.zhmsg());
		result.setEngMessage(ajaxCode.enmsg());

		return result;
	}

	public static AJAXResult createErrorAjaxResult(String msg) {
		AJAXResult result = new AJAXResult();

		result.setCode(AJAXCode.Failure.code());
		result.setMessage(msg);
		result.setVer("1.0");
		
		return result;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
