package com.shark.weipan.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CommonsFilter implements HandlerInterceptor {
	
	//创建SLF4J对象
	private static final Logger logger = LoggerFactory.getLogger(CommonsFilter.class);


	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		String requestURI = request.getRequestURI();
		logger.info("-------end-request:--<<{}>>---------",requestURI);
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		String requestURI = request.getRequestURI();
		logger.info("-------begin-request:--<<{}>>---------",requestURI);
		return true;
	}

}
