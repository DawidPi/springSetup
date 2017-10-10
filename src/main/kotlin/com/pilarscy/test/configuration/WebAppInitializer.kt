package com.pilarscy.test.configuration

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer

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
}