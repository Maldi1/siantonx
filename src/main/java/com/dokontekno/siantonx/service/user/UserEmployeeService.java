package com.dokontekno.siantonx.service.user;

import com.dokontekno.siantonx.entity.user.UserEmployee;
import com.dokontekno.siantonx.repository.user.UserEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserEmployeeService {
    @Autowired
    private UserEmployeeRepository userEmployeeRepository;

    public UserEmployee getUserEmployee(String id){
        return userEmployeeRepository.getOne(id);
    }

    public List<UserEmployee> getUserEmployees(){
        return userEmployeeRepository.findAll();
    }

}
