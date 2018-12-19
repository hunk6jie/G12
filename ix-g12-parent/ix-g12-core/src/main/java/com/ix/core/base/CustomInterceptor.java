package com.ix.core.base;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.google.common.collect.Lists;

public class CustomInterceptor extends HandlerInterceptorAdapter {
	static Logger logger = LoggerFactory.getLogger(CustomInterceptor.class);

	// 不需要token的接口
	public static List<String> noTokenUrl = Lists.newArrayList();

	// 不需要登录的接口
	public static List<String> noLoginUrl = Lists.newArrayList();

	static {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Method", "POST,GET");
		response.setHeader("Access-Control-Allow-Headers", "Access-Control");
		response.setHeader("Allow", "POST");
		response.setHeader("Content-Type", "application/json");
		
				
		return true;
	}
}