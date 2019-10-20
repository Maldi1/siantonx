package com.dokontekno.siantonx.controller.commons;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Commons {

    @GetMapping("/")
    public String sampleMenu(Model model){
        return "index";
    }
}
