package com.tensquare.qa.config;

import com.tensquare.qa.interceptor.JwtIntercepor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {
    @Autowired
    private JwtIntercepor jwtIntercepor;
    protected void addInterceptors(InterceptorRegistry registry){
        //注册拦截器要声明拦截器对象和要拦截的请求
        registry.addInterceptor(jwtIntercepor)
                .addPathPatterns("/**")
                .excludePathPatterns("/**/login/**");
    }


}
