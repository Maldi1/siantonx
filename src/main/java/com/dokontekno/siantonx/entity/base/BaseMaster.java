package com.dokontekno.siantonx.entity.base;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import java.util.Date;

@MappedSuperclass
@Table(name = "baseMaster")
@Data
public class BaseMaster extends Base{

    @Column(name = "active", length = 8, nullable = false)
    protected String active = "active";

    @Column(name = "update_by", length = 15, nullable = false)
    protected String updateBy;

    @Column(name = "update_at", nullable = false)
    protected Date updateAt = new Date();
}
