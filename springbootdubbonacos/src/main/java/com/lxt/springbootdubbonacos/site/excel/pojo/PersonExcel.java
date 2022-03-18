package com.lxt.springbootdubbonacos.site.excel.pojo;

import lombok.Data;
import org.apache.kafka.common.protocol.types.Field;

import java.io.Serializable;


@Data
public class PersonExcel implements Serializable {

    private Integer id;
    private String personName;
    private Integer personAge;
    private String personGender;
    private String job;
    private String englishLevel;


}
