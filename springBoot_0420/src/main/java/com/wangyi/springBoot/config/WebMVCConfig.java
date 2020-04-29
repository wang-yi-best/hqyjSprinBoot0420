package com.wangyi.springBoot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.wangyi.springBoot.filter.ParamterFilter;
import com.wangyi.springBoot.interceptor.UrlInterceptor;

/**
　 * <p>Title: WebMVCConfig</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月28日 下午6:57:34 
　 * @version 1.0
*/
@Configuration
@AutoConfigureAfter({WebMvcAutoConfiguration.class})
public class WebMVCConfig implements WebMvcConfigurer{
	@Autowired
	private UrlInterceptor urlInterceptor;
	
	@Bean
	public FilterRegistrationBean<ParamterFilter> filterRegistrationBean() {
		FilterRegistrationBean<ParamterFilter> filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new ParamterFilter());
		return filterRegistrationBean;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(urlInterceptor).addPathPatterns("/**");
		WebMvcConfigurer.super.addInterceptors(registry);
	}
	
	
}
