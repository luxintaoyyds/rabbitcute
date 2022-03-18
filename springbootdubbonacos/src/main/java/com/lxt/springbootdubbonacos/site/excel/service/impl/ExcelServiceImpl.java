package com.lxt.springbootdubbonacos.site.excel.service.impl;

import com.lxt.springbootdubbonacos.site.excel.mapper.PersonMapper;
import com.lxt.springbootdubbonacos.site.excel.pojo.PersonExcel;
import com.lxt.springbootdubbonacos.site.excel.service.ExcelService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


@Service
public class ExcelServiceImpl implements ExcelService {

    @Resource
    private PersonMapper personMapper;


    @Override
    public void createExcel() {
        //创建excel
        HSSFWorkbook workbook=new HSSFWorkbook();
        //设置sheet且命名为lxt
        HSSFSheet sheet=workbook.createSheet("lxt");
        //设置表头 行和列
        HSSFRow row=sheet.createRow(0);
        HSSFCell cell=row.createCell(0);
        cell.setCellValue("序号");
        cell=row.createCell(1);
        cell.setCellValue("姓名");
        cell=row.createCell(2);
        cell.setCellValue("年龄");
        cell=row.createCell(3);
        cell.setCellValue("性别");
        cell=row.createCell(4);
        cell.setCellValue("工作");
        cell=row.createCell(5);
        cell.setCellValue("英文级别");
        List<PersonExcel> list=personMapper.getList();
        //将数据库查询结果写入excel，创建行和单元格
        for(int i=0;i<list.size();i++) {
            HSSFRow row1=sheet.createRow(i+1);
            row1.createCell(0).setCellValue(list.get(i).getId());
            row1.createCell(1).setCellValue(list.get(i).getPersonName());
            row1.createCell(2).setCellValue(list.get(i).getPersonAge());
            row1.createCell(3).setCellValue(list.get(i).getPersonGender());
            row1.createCell(4).setCellValue(list.get(i).getJob());
            row1.createCell(5).setCellValue(list.get(i).getEnglishLevel());
        }
        try {
            File file1 = new File("E:/Temp/test.xls");
            FileOutputStream fos = new FileOutputStream(file1);
            workbook.write(fos);
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
