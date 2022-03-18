package com.lxt.springbootdubbonacos.site.excel.controller;


import com.barchart.udt.net.ExceptionReceiveUDT;
import com.lxt.springbootdubbonacos.site.excel.service.ExcelService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/excel")
@RestController
@Api(tags = "excel工具")
public class ExcelController {


    @Resource
    private ExcelService excelService;

    @PostMapping("/getDownloadDataToExcel")
    public void getDownloadDataToExcel(){
        excelService.createExcel();
    }

}
