package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String readParticularData(int rowvalue, int columnvalue) {
		String data = null;
		try {
			File file = new File("C:\\Users\\Monicka\\Desktop\\JAVA\\Premium IPT\\Day 11 - Data driven\\DataDriven_IPT.xlsx");
			Workbook book = new XSSFWorkbook(file);
			Sheet sheet = book.getSheet("Sheet1");
			Row row = sheet.getRow(rowvalue);
			Cell cell = row.getCell(columnvalue);
			
		DataFormatter dataformat = new DataFormatter();
		data = dataformat.formatCellValue(cell);
		
		book.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		return data;
		
	}
	public static void Write_Data() {
		try {
			File file = new File("C:\\Users\\Monicka\\Desktop\\JAVA\\Premium IPT\\Day 11 - Data driven\\DataDriven_IPT.xlsx");
			FileInputStream fileInput = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(fileInput);
			book.createSheet("IPT_DEC").createRow(0).createCell(0).setCellValue("Moni");
			FileOutputStream fileoutput = new FileOutputStream(file);
			book.write(fileoutput);
			book.close();
			System.out.println("Created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//public static void main(String[]args) {
	//	readParticularData(0, 0);
		//Write_Data();
	//}
}
