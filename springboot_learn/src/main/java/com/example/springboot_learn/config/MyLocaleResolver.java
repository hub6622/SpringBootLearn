package com.example.springboot_learn.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import java.util.Locale;

@Configuration
public class MyLocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l= request.getParameter("l");
        String header = request.getHeader("Accept-Language");
        Locale locale=null;
        if(!StringUtils.isEmpty(l)){
            String[] split=l.split("_");
            locale=new Locale(split[0],split[1]);
        }else {
            String[] splits=header.split(",");
            String[] split=splits[0].split("-");
            locale=new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
