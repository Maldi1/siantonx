package com.dokontekno.siantonx.controller.school.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolsViewController {

    @GetMapping(value = "/schools")
    public String getSchools(){
        return "schools";
    }

}
