package org.test.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\Jeevamithra\\eclipse-workspace\\MavenLearning\\src\\test\\resources\\Excel\\bhu.xlsx");
				//"C:\\Users\\Jeevamithra\\eclipse-workspace\\MavenLearning\\src\\test\\resources\\Excel\\Data.xlsx");

		FileInputStream st = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(st);
		Sheet sheet = w.getSheet("flipkart");
		Row row = sheet.createRow(2);
		Cell cell = row.createCell(3);
		cell.setCellValue("Bhuvana");
		System.out.println(cell);
		FileOutputStream ot = new FileOutputStream(loc);
		w.write(ot);
		System.out.println("........Done.........");

	}

}
