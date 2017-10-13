package com.pilarscy.test.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.web.servlet.view.tiles3.TilesConfigurer
import org.springframework.web.servlet.view.tiles3.TilesViewResolver


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = arrayOf("com.pilarscy.test.controller"))
open class SpringMVC : WebMvcConfigurerAdapter() {

    @Bean
    open fun viewResolver() : ViewResolver {
        return TilesViewResolver();
    }

    @Bean
    open fun tilesConfigurer(): TilesConfigurer {
        val tilesConfigurer = TilesConfigurer()
        tilesConfigurer.setDefinitions(*arrayOf("/WEB-INF/views/**/tiles.xml"))
        tilesConfigurer.setCheckRefresh(true)
        return tilesConfigurer
    }
}