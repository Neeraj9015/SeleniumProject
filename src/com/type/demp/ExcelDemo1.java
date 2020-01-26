package com.type.demp;

public class ExcelDemo1 {

	public static void main(String[] args){
		String fpath="c:\\users\\srinidhi\\Desktop\\Testcases_Actitime.xlsx";
		String sheet="Sheet1";
		System.out.println(ExcelGenericLib.getExcelData(fpath, sheet, 2,2));
		System.out.println(ExcelGenericLib.getExcelData(fpath, sheet, 3, 3));
	}
}
