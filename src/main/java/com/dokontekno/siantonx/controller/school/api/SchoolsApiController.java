package com.dokontekno.siantonx.controller.school.api;

import com.dokontekno.siantonx.controller.school.pojo.SchoolPojo;
import com.dokontekno.siantonx.entity.school.School;
import com.dokontekno.siantonx.service.school.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(value = SchoolsApiController.PATH)
public class SchoolsApiController {
    public static final String PATH = "/api/schools";
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
