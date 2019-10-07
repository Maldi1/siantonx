package com.dokontekno.siantonx.controller.school.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SchoolsViewController {

    @GetMapping(value = "/schools")
    @ResponseBody
    public String getSchools(){
        return "schools";
    }

}
