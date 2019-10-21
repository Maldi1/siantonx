package com.dokontekno.siantonx.controller.commons.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Getter
@Setter
public class BasePojo {
    private UUID id;
    private String createBy;
    private Date createAt;
}
