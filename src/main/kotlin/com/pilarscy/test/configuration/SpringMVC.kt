package com.pilarscy.test.configuration

import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ReloadableResourceBundleMessageSource
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.web.servlet.i18n.CookieLocaleResolver
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor
import org.springframework.web.servlet.view.tiles3.TilesConfigurer
import org.springframework.web.servlet.view.tiles3.TilesViewResolver
import java.util.*


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

    @Bean
    open fun localeResolver() : LocaleResolver{
        val localeResolver = CookieLocaleResolver()
        localeResolver.setDefaultLocale(Locale.ENGLISH)
        return localeResolver
    }

    @Bean
    open fun messageSource() : MessageSource{
        val messageSource = ReloadableResourceBundleMessageSource()
        messageSource.setBasename("/WEB-INF/messages/messages")
        messageSource.setDefaultEncoding("UTF-8")
        return messageSource
    }

    @Bean
    open fun localeChangeInterceptor() : LocaleChangeInterceptor{
        val locale = LocaleChangeInterceptor();
        locale.paramName="lang"
        return locale
    }

    override fun addResourceHandlers(registry: ResourceHandlerRegistry?) {
        if(registry == null){
            throw ExceptionInInitializerError("unexpected nullptr in addResource Handlers")
        }

        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/")
    }

    // localeChangeInterceptor does not work without this
    override fun addInterceptors(registry: InterceptorRegistry?) {
        registry?.addInterceptor(localeChangeInterceptor())
        super.addInterceptors(registry)
    }
}