package com.dokontekno.siantonx.controller.school.view;

import com.dokontekno.siantonx.entity.school.School;
import com.dokontekno.siantonx.service.school.SchoolService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Controller
public class SchoolViewController {

    private SchoolService schoolService;

    @GetMapping("/school")
    public String school(Model model){
//        School school = schoolService.getSchool(UUID.fromString("aa7d2957-d8a3-4398-9d1d-8d97e48e3b9f"));
        model.addAttribute("name","Malik Abdul Aziz");
        return "schools";
    }

}
