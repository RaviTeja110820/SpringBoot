package com.example.ThymeLeaf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

@Configuration
public class ThymeLeafConfig {
	
	@Bean
	public SpringResourceTemplateResolver templateResolver1() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setCacheable(false);
		templateResolver.setPrefix("classpath:/newdir/");
		templateResolver.setSuffix(".html");
		templateResolver.setCheckExistence(true);
		return templateResolver;
		}
	
	@Bean
	public SpringResourceTemplateResolver templateResolver2() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setCacheable(false);
		templateResolver.setPrefix("classpath:/newDir2/");
		templateResolver.setSuffix(".html");
		templateResolver.setCheckExistence(true);
		return templateResolver;
		}
	
	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine SpringTemplateEngine = new SpringTemplateEngine();
		SpringTemplateEngine.addTemplateResolver(templateResolver1());
		SpringTemplateEngine.addTemplateResolver(templateResolver2());
		return SpringTemplateEngine;
	}
	
	public ThymeleafViewResolver viewResolver() {
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine());
		viewResolver.setOrder(1);
		return viewResolver; 
		}
}
