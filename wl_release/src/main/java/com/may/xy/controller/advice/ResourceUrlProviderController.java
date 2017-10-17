package com.may.xy.controller.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

/**
 * <p/>Project Name:wl_release  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/17 15:16  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 * http://blog.csdn.net/kollyqaq/article/details/51064427
 * http://blog.csdn.net/isea533/article/details/50412212
 */
@ControllerAdvice
public class ResourceUrlProviderController {
	@Autowired
	private ResourceUrlProvider resourceUrlProvider;

	@ModelAttribute("urls")
	public ResourceUrlProvider urls() {
		return this.resourceUrlProvider;
	}
}
