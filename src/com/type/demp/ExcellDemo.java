package com.type.demp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellDemo {
	public static void main(String[]args) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fin=new FileInputStream("");
		Workbook workbook=WorkbookFactory.create(fin);
		Sheet sheet = workbook.getSheet("Sheet1");
		Cell cell=sheet.getRow(3).getCell(3);
		 String data=cell.getStringCellValue();
		 System.out.println(data);
		
		
		
	}

}
