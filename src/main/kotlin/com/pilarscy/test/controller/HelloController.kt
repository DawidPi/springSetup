package com.pilarscy.test.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import java.util.*
import java.text.DateFormat



@Controller
class HelloController{

    @RequestMapping("/")
    fun home(locale : Locale, model : Model) : String{
        val date = Date()
        val dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale)
        val formattedDate = dateFormat.format(date)

        model.addAttribute("serverTime", formattedDate)

        return "home"
    }
}