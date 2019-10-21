package com.dokontekno.siantonx.controller.commons.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Getter
@Setter
public class BaseMasterPojo extends BasePojo {
    private String active;
    private String updateBy;
    private Date updateAt;
}
