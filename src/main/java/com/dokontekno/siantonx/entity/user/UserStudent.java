package com.dokontekno.siantonx.entity.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "master_user_student")
//@DiscriminatorValue(value = "student")
@Data
public class UserStudent extends User {

    @Column(name = "nsin", length = 100)
    private String nsin;
}
