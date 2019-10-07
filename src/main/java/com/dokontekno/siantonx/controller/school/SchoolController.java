package com.dokontekno.siantonx.controller.school;

import com.dokontekno.siantonx.controller.school.pojo.SchoolPojo;
import com.dokontekno.siantonx.entity.school.School;
import com.dokontekno.siantonx.service.school.SchoolService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(value = SchoolController.PATH)
public class SchoolController {

//    Logger logger = LoggerFactory.getLogger(SchoolPojo.class);

    public static final String PATH = "/api/school";
    private SchoolPojo schoolPojo = new SchoolPojo();

    @Autowired
    private SchoolService schoolService;


    @GetMapping(value = "/{id}")
    public SchoolPojo getSchool(@PathVariable UUID id){
        School school = schoolService.getSchool(id);
//        logger.debug("is school empty : "+(school.getName()));
        return schoolPojo.toSchoolPojo(school);
    }

    @PostMapping
    public SchoolPojo save(@RequestBody SchoolPojo schoolPojo){
        School school = schoolService.saveData(schoolPojo.toSchool(schoolPojo));
        return schoolPojo.toSchoolPojo(school);
    }

    @DeleteMapping(value = "/{id}")
    public HttpStatus delete(@PathVariable UUID id){
        schoolService.delete(id);
        return HttpStatus.OK;
    }

}
