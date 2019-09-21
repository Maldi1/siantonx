package com.dokontekno.siantonx.entity.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue(value = "employee")
@Table(name = "master_user_employee")
@Data
public class UserEmployee extends User{

    @Column(name = "employee_number", length = 100)
    private String employeeNumber;
}
