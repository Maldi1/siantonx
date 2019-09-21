package com.dokontekno.siantonx.entity.base;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@Table(name = "base")
@Data
public class Base {

    @Id
    protected UUID id = UUID.randomUUID();

    @Column(name = "create_by", length = 15, nullable = false)
    protected String createBy;

    @Column(name = "create_at", nullable = false)
    protected Date createAt = new Date();
}
