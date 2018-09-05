package com.kt.membership;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.google.common.base.Predicate;
import com.kt.membership.handler.PreHandler;
import com.kt.membership.handler.WebviewPreHandler;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
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
		registry.addInterceptor(webviewPreHandler()).addPathPatterns("/webview/**");
		super.addInterceptors(registry);
	}
	
	
	@Bean
	public PreHandler preHandler() {
		return new PreHandler();
	}
	
	@Bean
	public WebviewPreHandler webviewPreHandler() {
		List<String> targetList = new ArrayList<>();
		targetList.add("com.kt.membership.handler.WebviewHandler");
		targetList.add("org.springframework.web.servlet.resource.ResourceHttpRequestHandler");
		
		WebviewPreHandler handler = new WebviewPreHandler();
		handler.setExcludeTarget(targetList);
		return handler;
		
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/culture/**").addResourceLocations("/culture/");
		registry.addResourceHandler("/html/**").addResourceLocations("/html/");
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
		registry.addResourceHandler("/img/**").addResourceLocations("/img/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		registry.addResourceHandler("/video/**").addResourceLocations("/video/");
		registry.addResourceHandler("/storage/**").addResourceLocations("file:/tomcat/storage/");
		registry.addResourceHandler("/mappers/**").addResourceLocations("/mappers/");
		registry.addResourceHandler("/wsdl/**").addResourceLocations("/wsdl/");
		registry.addResourceHandler("/**").addResourceLocations("/");
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.any())
				.paths(paths())
				.build().apiInfo(apiInfo());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private Predicate paths(){
		return or(regex("/app.*"), regex("/vendor.*"), regex("/cluture.*"), regex("/event.*"), regex("/join.*"), 
				regex("/login.*"), regex("/menu.*"), regex("/push.*"), regex("/temp.*"), regex("/user.*"), 
				regex("/webview/agree.*"), regex("/barcode.*"), regex("/webview/etc.*"), regex("/webview/myClub/wallet.*"), regex("/webview/club/affiliate.*"), 
				regex("/webview/welcomeGift.*"), regex("/logout.*"), regex("/statistic.*"), regex("/pay.*"));
	}
	
	private ApiInfo apiInfo() {
		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder()
				.title("멤버십 Java Rest Api 문서")
				.description("Create by lee y h ")
				.version("1.0.0")
				.license("욉");
		
		return apiInfoBuilder.build();
	}
	
	
}
