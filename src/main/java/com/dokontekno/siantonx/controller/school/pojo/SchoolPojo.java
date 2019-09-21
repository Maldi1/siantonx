package com.dokontekno.siantonx.controller.school.pojo;

import com.dokontekno.siantonx.controller.commonspojo.BaseMasterPojo;
import com.dokontekno.siantonx.entity.school.School;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Getter
@Setter
public class SchoolPojo extends BaseMasterPojo {

    private String npsn;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String whatsappPhoneNumber;

    public SchoolPojo toSchoolPojo(School school){
        if (school == null) return null;

        System.out.println("NAMA OBJECT SCHOOLS >>>>>>>>>>>>>>>>>>>>>>>>> "+school.getName());

        SchoolPojo schoolPojo = new SchoolPojo();
        schoolPojo.setId(school.getId());
        schoolPojo.setCreateAt(school.getCreateAt());
        schoolPojo.setCreateBy(school.getCreateBy());
        schoolPojo.setActive(school.getActive());
        schoolPojo.setUpdateAt(school.getUpdateAt());
        schoolPojo.setUpdateBy(school.getUpdateBy());
        schoolPojo.setNpsn(school.getNpsn());
        schoolPojo.setName(school.getName());
        schoolPojo.setAddress(school.getAddress());
        schoolPojo.setEmail(school.getEmail());
        schoolPojo.setPhoneNumber(school.getPhoneNumber());
        schoolPojo.setWhatsappPhoneNumber(school.getWhatsappPhoneNumber());
        return schoolPojo;
    }

    public List<SchoolPojo> toSchoolPojo(List<School> schools){
        if (schools == null) return null;

        List<SchoolPojo> schoolPojos = new ArrayList<>();
        for (School school : schools){
            schoolPojos.add(toSchoolPojo(school));
        }

        return schoolPojos;
    }

    public School toSchool(SchoolPojo schoolPojo){
        if (schoolPojo == null) return null;

        School school = new School();
        school.setId(schoolPojo.getId());
        school.setNpsn(schoolPojo.getNpsn());
        school.setName(schoolPojo.getName());
        school.setAddress(schoolPojo.getName());
        school.setEmail(schoolPojo.getEmail());
        school.setWhatsappPhoneNumber(schoolPojo.getWhatsappPhoneNumber());
        school.setPhoneNumber(schoolPojo.getPhoneNumber());

        return school;
    }

    public List<School> toSchool(List<SchoolPojo> schoolsPojos){
        if (schoolsPojos == null) return null;

        List<School> schools = new ArrayList<>();
        for (SchoolPojo schoolPojo : schoolsPojos){
            schools.add(toSchool(schoolPojo));
        }

        return schools;
    }
}
