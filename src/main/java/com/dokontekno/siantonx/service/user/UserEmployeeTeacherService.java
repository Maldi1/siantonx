package com.dokontekno.siantonx.service.user;

import com.dokontekno.siantonx.entity.user.UserEmployeeTeacher;
import com.dokontekno.siantonx.repository.user.UserEmployeeTeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserEmployeeTeacherService {
    @Autowired
    private UserEmployeeTeacherRepository userEmployeeTeacherRepository;

    public UserEmployeeTeacher getUserEmployeeTeacher(String id){
        return userEmployeeTeacherRepository.getOne(id);
    }

    public List<UserEmployeeTeacher> getMasterUserEmployeeTeachers(){
        return userEmployeeTeacherRepository.findAll();
    }

}
