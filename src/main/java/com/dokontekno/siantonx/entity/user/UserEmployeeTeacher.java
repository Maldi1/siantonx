package com.dokontekno.siantonx.entity.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "master_user_employee_teacher")
//@DiscriminatorValue(value = "employee_teacher")
@Data
public class UserEmployeeTeacher extends UserEmployee {

    @Column(name = "nrg", length = 100)
    private String nrg;

    @Column(name = "nuptk", length = 100)
    private String nuptk;
}
