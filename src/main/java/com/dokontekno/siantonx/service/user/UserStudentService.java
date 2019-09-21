package com.dokontekno.siantonx.service.user;

import com.dokontekno.siantonx.entity.user.UserStudent;
import com.dokontekno.siantonx.repository.user.UserStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserStudentService {
    @Autowired
    private UserStudentRepository userStudentRepository;

    private UserStudent getUserStudent(String id){
        return userStudentRepository.getOne(id);
    }

    private List<UserStudent> getUserStudents(){
        return userStudentRepository.findAll();
    }
}
