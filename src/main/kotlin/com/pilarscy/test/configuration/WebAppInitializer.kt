package com.pilarscy.test.configuration

import org.springframework.web.filter.CharacterEncodingFilter
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer
import javax.servlet.Filter

class WebAppInitializer : AbstractAnnotationConfigDispatcherServletInitializer(){

    override fun getRootConfigClasses(): Array<Class<*>>? {
        return null
    }

    override fun getServletConfigClasses(): Array<Class<*>> {
        return arrayOf(SpringMVC::class.java)
    }

    override fun getServletMappings(): Array<String> {
        return arrayOf("/")
    }

    override fun getServletFilters(): Array<Filter> {
        val filter = CharacterEncodingFilter()
        filter.encoding = "UTF-8"
        return arrayOf(filter)
    }
}