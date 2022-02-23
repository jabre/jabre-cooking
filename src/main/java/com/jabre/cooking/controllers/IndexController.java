package com.jabre.cooking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author : Jabre
 * Created : 12/12/2021, Sunday
 **/
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage() {
        return "index";
    }

}
