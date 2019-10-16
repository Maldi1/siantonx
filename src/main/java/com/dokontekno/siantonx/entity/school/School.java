package com.dokontekno.siantonx.entity.school;

import com.dokontekno.siantonx.entity.base.BaseMaster;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "master_school")
@Data
@RequiredArgsConstructor
public class School extends BaseMaster {

    @Column(name = "npsn", length = 100, unique = true)
    private String npsn;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number", length = 20, nullable = false)
    private String phoneNumber;

    @Column(name = "whatsapp_number", length = 20, nullable = false)
    private String whatsappNumber;

    public School(String npsn, String name, String address, String email, String phoneNumber, String whatsappNumber) {
        this.npsn = npsn;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.whatsappNumber = whatsappNumber;
    }

}
