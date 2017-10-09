package com.pilarscy.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HelloController{

    @RequestMapping("/")
    fun home() : String{
        return "home"
    }
}