package com.may.xy.config.thymeleaf;


import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p/>Project Name:wl_release  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/16 10:36  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
@ConfigurationProperties(prefix = "thymeleaf")
@Getter
@Setter
public class ThymeleafConfigProperties {
	private String prefix;
	private String suffix;
	private String templateMode;
	private String characterEncoding;
	private String cacheable;
}
