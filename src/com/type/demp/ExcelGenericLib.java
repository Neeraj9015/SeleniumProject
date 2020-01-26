package com.type.demp;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelGenericLib {

	public static String getExcelData (String fpath,String st,int row,int cl) {
		// TODO Auto-generated method stub
      String data=null;
      try{
    	
    	  FileInputStream fin=new FileInputStream("");
  		Workbook workbook=WorkbookFactory.create(fin);
  		Sheet sheet = workbook.getSheet(st);
  		Cell cell=sheet.getRow(row).getCell(cl);
  		 data=cell.getStringCellValue();
      }
      catch(Exception e){
    	  e.printStackTrace();
      }
      return data;
		
		
		
	}

}
