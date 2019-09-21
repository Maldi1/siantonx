package com.dokontekno.siantonx.entity.user;


import com.dokontekno.siantonx.entity.base.BaseMaster;
import com.dokontekno.siantonx.entity.school.School;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "masterUser")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "userType", discriminatorType = DiscriminatorType.STRING)
@Data
public class User extends BaseMaster {

    @JoinColumn(name = "school_id")
    @ManyToOne
    private School school;

    @Column(name = "id_number", length = 100)
    private String idNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_place")
    private String birthPlace;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "age")
    private Integer age;

    @Column(name = "first_phone_number", length = 20)
    private String firstPhoneNumber;

    @Column(name = "second_phone_number", length = 20)
    private String secondPhoneNumber;

    @Column(name = "whatsapp_number", length = 20)
    private String whatsappNumber;
}
