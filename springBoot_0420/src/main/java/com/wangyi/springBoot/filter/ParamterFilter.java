package com.wangyi.springBoot.filter;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * Title: ParamterFilter
 * </p>
 * <p>
 * Description:
 * </p>
 * @author yi.wang @date 2020年4月28日 下午6:50:00 @version 1.0
 */
@WebFilter(filterName = "paramterFilter", urlPatterns = "/**")
public class ParamterFilter implements Filter {

	private final static Logger LOGGER = LoggerFactory.getLogger(ParamterFilter.class);

	@Override
	public void destroy() {
		LOGGER.debug("destroy LOGGER");
		Filter.super.destroy();
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		LOGGER.debug("init LOGGER");
		Filter.super.init(filterConfig);
	}

	/*
	 * (non-Javadoc) <p>Title: doFilter</p> <p>Description: </p>
	 * 
	 * @param arg0
	 * 
	 * @param arg1
	 * 
	 * @param arg2
	 * 
	 * @throws IOException
	 * 
	 * @throws ServletException
	 * 
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest,
	 * javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest hRequest = (HttpServletRequest)request;
//		Map<String, String[]> maps = hRequest.getParameterMap();
		HttpServletRequestWrapper wrapper = new HttpServletRequestWrapper(hRequest){

			@Override
			public String getParameter(String name) {
				String value = hRequest.getParameter(name);
				if (value != null && value != "") {
					return value.replaceAll("hello", "how");
				}
				return super.getParameter(name);
			}

			@Override
			public String[] getParameterValues(String name) {
				String[] values = hRequest.getParameterValues(name);
				if (values != null && values.length>0) {
					values[0] = values[0].replaceAll("hello", "how");
					return values;
				}
				return super.getParameterValues(name);
			}
			
			
			
		};
		LOGGER.debug("action LOGGER");
		chain.doFilter(request, response);
	}

}
