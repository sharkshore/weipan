package com.shark.weipan.common.aop;

import java.util.HashMap;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

/**
 * 只要满足要求的,都会碰撞
 * @author TUZE808
 *
 */
@Aspect
@Component
public class MyAop {
	
	//创建SLF4J对象
	private static final Logger logger = LoggerFactory.getLogger(MyAop.class);

	@Pointcut("execution(* com.pingan.apollo.sys.service.impl..*.*(..))")
	private void pointcut(){}
	
	/** 环绕通知  */
	@Around("pointcut()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
		logger.info("----------<<{}>>---------","进入环绕通知,顺序1");
		Object o=pjp.proceed();
		logger.info("--------捕获结果:--<<{}>>---------",JSON.toJSONString(o));
		logger.info("----------<<{}>>---------","退出环绕通知,顺序3");
		return o;
	}
	
	/** 前置通知  */
	@Before("pointcut()")
	public void doAccessCheck(){
		logger.info("----------<<{}>>---------","前置通知,顺序2");
	}
	
	/** 前置通知,可以捕获参数  */
	@Before("pointcut()&&args(map)")
	public void doAccessCheckWithParam(HashMap map){
		logger.info("-------捕获参数:---<<{}>>---------",map.toString());
		logger.info("----------<<{}>>---------","前置通知--带参,顺序2");
	}
	
	/** 后置通知  */
	@After("pointcut()")
	public void after(){
		logger.info("----------<<{}>>---------","后置通知,顺序4");
	}
	
	/** 结果返回通知  */
	@AfterReturning("pointcut()")
	public void doAfter(JoinPoint jp){
		logger.info("--------捕获方法名:--<<{}>>---------",jp.getSignature().getName());
		logger.info("----------<<{}>>---------","结果返回通知,顺序5");
	}
	
	/** 异常通知  */
	@AfterThrowing("pointcut()")
	public void doAfterThrow(){
		logger.info("----------<<{}>>---------","异常通知,顺序6");
	}
	

}

