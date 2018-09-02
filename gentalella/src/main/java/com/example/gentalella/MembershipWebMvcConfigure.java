package com.example.gentalella;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.kt.membership.handler.PreHandler;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Prehandler Inteceptor 추가를 위해 사용
@Configuration
@EnableSwagger2 
@EnableWebMvc
@EnableAsync
public class MembershipWebMvcConfigure extends WebMvcConfigurerAdapter{
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(preHandler()).addPathPatterns("/**").excludePathPatterns("/webview/**");
//		registry.addInterceptor(webviewPreHandler()).
	}
	
	
	@Bean
	public PreHandler preHandler() {
		return new PreHandler();
	}
	
//	@Bean
//	public WebviewPreHandler
}
