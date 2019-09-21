package com.dokontekno.siantonx.controller.school;

import com.dokontekno.siantonx.controller.school.pojo.SchoolPojo;
import com.dokontekno.siantonx.entity.school.School;
import com.dokontekno.siantonx.service.school.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = SchoolsController.PATH)
public class SchoolsController {
    public static final String PATH = "/schools";
    private SchoolPojo schoolPojo = new SchoolPojo();

    @Autowired
    private SchoolService schoolService;

    @GetMapping
    public List<SchoolPojo> getSchools(@RequestParam(name = "npsn",defaultValue = "%") String npsn,
                                       @RequestParam(name = "name", defaultValue = "%") String name,
                                       @RequestParam(name = "address", defaultValue = "%") String address,
                                       @RequestParam(name = "email", defaultValue = "%") String email,
                                       @RequestParam(name = "phoneNumber", defaultValue = "%") String phoneNumber,
                                       @RequestParam(name = "whatsappNumber", defaultValue = "%") String whatsappNumber){
        List<School> schools = schoolService.getSchools(npsn, name, address, email, phoneNumber, whatsappNumber);
        return schoolPojo.toSchoolPojo(schools);
    }

//    public HttpStatus delete(S)

}
