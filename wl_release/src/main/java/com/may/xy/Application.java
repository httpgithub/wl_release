package com.may.xy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://gist.github.com/seanhinkley/6eab2130ceea857c160b
 * 使用自己的autoConfi 禁止默认的org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration
 */
@SpringBootApplication(scanBasePackages = {"com.may.xy"},exclude={org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration.class} )
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}