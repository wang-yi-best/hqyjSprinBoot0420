package com.wangyi.springBoot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.util.StringUtil;

/**
　 * <p>Title: UrlInterceptor</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月28日 下午7:21:13 
　 * @version 1.0
*/
@Component
public class UrlInterceptor implements HandlerInterceptor {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(UrlInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LOGGER.debug("Pre -------------------");
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		LOGGER.debug("Post -------------------");
		
		if (modelAndView == null || modelAndView.getViewName().startsWith("redirect")) {
			return;
		}
		
		String uri = request.getServletPath();
		String template = (String) modelAndView.getModelMap().get("template");
		if (StringUtils.isBlank(template)) {
			if (uri.startsWith("/")) {
				uri = uri.substring(1);
			}
			modelAndView.getModelMap().put("template", uri);
		}
		
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		LOGGER.debug("After -------------------");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
