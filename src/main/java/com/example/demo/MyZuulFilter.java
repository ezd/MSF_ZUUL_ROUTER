package com.example.demo;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class MyZuulFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		System.out.println("filtering......");
		RequestContext context = RequestContext.getCurrentContext();
		String parameterx = context.getRequest().getParameter("x");
		if(parameterx!=null) {
			System.out.println("x value is :"+parameterx);
		}else {
			System.out.println("x value is null");
		}
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
