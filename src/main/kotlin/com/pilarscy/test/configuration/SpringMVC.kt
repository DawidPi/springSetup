package com.pilarscy.test.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.web.servlet.view.JstlView
import org.springframework.web.servlet.view.InternalResourceViewResolver


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = arrayOf("com.pilarscy.test.controller"))
open class SpringMVC : WebMvcConfigurerAdapter() {

    @Bean
    open fun viewResolver() : ViewResolver {
        val viewResolver = InternalResourceViewResolver()
        viewResolver.setViewClass(JstlView::class.java)
        viewResolver.setPrefix("/WEB-INF/views/")
        viewResolver.setSuffix(".jsp")
        return viewResolver
    }
}