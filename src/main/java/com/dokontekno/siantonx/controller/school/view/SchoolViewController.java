package com.dokontekno.siantonx.controller.school.view;

import com.dokontekno.siantonx.entity.school.School;
import com.dokontekno.siantonx.service.school.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Controller
public class SchoolViewController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/school/{id}")
    public String school(Model model, @PathVariable(required = true) UUID id){
        School school = schoolService.getSchool(id);
        model.addAttribute("school", school);
        return "/school/school";
    }

    @GetMapping("/schools")
    public String schools(Model model,
                          @RequestParam(name = "npsn", defaultValue = "%") String npsn,
                          @RequestParam(name = "name", defaultValue = "%") String name,
                          @RequestParam(name = "address", defaultValue = "%") String address,
                          @RequestParam(name = "email", defaultValue = "%") String email,
                          @RequestParam(name = "phoneNumber", defaultValue = "%") String phoneNumber,
                          @RequestParam(name = "whatsappNumber", defaultValue = "%") String whatsappNumber){
        List<School> schools = schoolService.getSchools(npsn, name, address, email, phoneNumber, whatsappNumber);
        model.addAttribute("schools", schools);
        return "/school/schools";
    }

    @GetMapping("/index")
    public String ind(){
        return "index";
    }

}
