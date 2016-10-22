package com.shark.weipan.common.webcode;
/**AjaxCode的Enum|简单*/
/**  供AjaxResult使用  */
public enum AJAXCode {

	Unexpected(0, "Unexpected error", "未知错误"), 
	Successful(1, "Successful", "成功"), 
	Failure(2, "Failure", "访问失败"), 
	ParamsError(3, "Params error", "参数错误"),
	DuplicateError(4, "Duplicate value error", "重复值错误"),
	NotLogin(5, "NotLogin", "未登录");

	private AJAXCode(int code, String enmsg, String zhmsg) {
		this.code = code;
		this.enmsg = enmsg;
		this.zhmsg = zhmsg;
	}

	private int code;

	private String enmsg;

	private String zhmsg;

	public int code() {
		return code;
	}

	public String enmsg() {
		return enmsg;
	}

	public String zhmsg() {
		return zhmsg;
	}

}