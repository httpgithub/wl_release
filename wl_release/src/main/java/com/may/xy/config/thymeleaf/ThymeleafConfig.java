package com.may.xy.config.thymeleaf;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <p/>Project Name:wl_release  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/16 10:31  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 * https://medium.com/@dmarko484/spring-boot-spring-boot-1-4-x-thymeleaf-3-x-configuration-b920b1d92ba0
 */
@Configuration
@EnableConfigurationProperties(ThymeleafConfigProperties.class)
public class ThymeleafConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {
	@Autowired(required = false)
	private ApplicationContext applicationContext;

	@Autowired
	private ThymeleafConfigProperties thymeleafConfigProperties;

	//private static String prefix = "/WEB-INF/templates/";
	private static String prefix = "classpath:/templates/";

	private static String suffix = ".html";

	private static String templateMode = "HTML5";

	private static String characterEncoding = "UTF-8";

	private static boolean cacheable = false;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Bean
	public ViewResolver viewResolver() {
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		resolver.setCharacterEncoding("UTF-8");
		resolver.setTemplateEngine(templateEngine());
		return resolver;
	}
	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine engine = new SpringTemplateEngine();
		engine.setTemplateResolver(templateResolver());
		return engine;
	}
	@Bean
	public ITemplateResolver templateResolver() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();

		templateResolver.setApplicationContext(applicationContext);
		templateResolver.setPrefix(StringUtils.defaultIfEmpty(thymeleafConfigProperties.getPrefix(), prefix));
		templateResolver.setSuffix(StringUtils.defaultIfEmpty(thymeleafConfigProperties.getSuffix(), suffix));
		templateResolver.setTemplateMode(StringUtils.defaultIfEmpty(thymeleafConfigProperties.getTemplateMode(), templateMode));
		templateResolver.setCharacterEncoding(StringUtils.defaultIfEmpty(thymeleafConfigProperties.getCharacterEncoding(), characterEncoding));
		templateResolver.setCacheable(Boolean.parseBoolean(StringUtils.defaultIfEmpty(thymeleafConfigProperties.getCharacterEncoding(), cacheable + "")));

		return templateResolver;
	}
}
