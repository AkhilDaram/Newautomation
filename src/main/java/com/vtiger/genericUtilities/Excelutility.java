package com.vtiger.genericUtilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {//excel fetching data
	public String readDataFromExcel(String SheetName,int rowNum,int cellNum ) throws Throwable {
		FileInputStream fise=new FileInputStream(Iconstautility.excelfilepath);
		Workbook wb = WorkbookFactory.create(fise);
		return wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		
	}

}