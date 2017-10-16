package com.may.xy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p/>Project Name:wl_release  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/16 15:00  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
@Controller
public class HomeController {
	@RequestMapping(value = {"/",""})
	public String toHomePage() {
		return "pages/index";
	}
}
