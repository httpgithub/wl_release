package com.may.xy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * https://gist.github.com/seanhinkley/6eab2130ceea857c160b
 * 使用自己的autoConfi 禁止默认的org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration
 * http://www.yiibai.com/spring-boot/deploy-war-file-to-tomcat.html
 * https://yq.aliyun.com/articles/25530
 */
@SpringBootApplication(scanBasePackages = {"com.may.xy"},exclude={org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration.class} )
public class Application extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
}