package com.dokontekno.siantonx.controller.commons;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Menu {

    @GetMapping("/")
    public String sampleMenu(Model model){
        return "index";
    }

    @GetMapping("/page-login")
    public String pageLogin(){
        return "page-login";
    }

    @GetMapping("/page-forget")
    public String pageForget(){
        return "page-forget";
    }

    @GetMapping("/tables-data-school")
    public String tablesDataSchools(){
        return "tables-data-school";
    }


}
