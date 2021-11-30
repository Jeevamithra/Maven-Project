package org.test.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File f = new File(
				"C:\\Users\\Jeevamithra\\eclipse-workspace\\MavenLearning\\src\\test\\resources\\Excel\\Data.xlsx");
		// "C:\\Users\\Jeevamithra\\eclipse-workspace\\MavenLearning\\src\\test\\resources\\Excel\\Data.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fi);

		Sheet sheet = wb.getSheet("Sheet1");

		Row row = sheet.getRow(0);

		Cell cell = row.getCell(0);
		System.out.println(cell);

		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);

		int cellcount = row.getPhysicalNumberOfCells();
		System.out.println(cellcount);

		System.out.println("....Print All Values......");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);

			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row2.getCell(j);

				System.out.println(cell2);

			}

		}
	}
}
