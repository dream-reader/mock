package com;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Demo1807 {

    @Bean
    public ServletRegistrationBean testa(){
        return  new ServletRegistrationBean<>(new MockDemo1804(),"/test");

    }
}
