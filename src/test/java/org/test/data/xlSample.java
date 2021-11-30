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

public class xlSample {

	public static void main(String[] args) throws IOException {

		// File (for location)
		File loc = new File(
				"C:\\Users\\Jeevamithra\\eclipse-workspace\\MavenLearning\\src\\test\\resources\\Excel\\Data.xlsx");

		// FileInputStream(File convert into java)
		FileInputStream st = new FileInputStream(loc);

		// Which format we want use ( XSSF or XSS) whole sheets are workbook
		Workbook w = new XSSFWorkbook(st);

		// enter to sheet ( whole rows are sheet)
		Sheet sheet1 = w.getSheet("user data");

		// WHICH ROW WE WANT
		Row row1 = sheet1.getRow(0);

		// ROW INTO CELL
		Cell cell1 = row1.getCell(1);

		System.out.println(cell1);

		// GET ROW SIZE
		int rowcount = sheet1.getPhysicalNumberOfRows();
		System.out.println(rowcount);

		// GET CELL SIZE
		int cellcount = row1.getPhysicalNumberOfCells();
		System.out.println(cellcount);

		System.out.println("....Print All Values......");

		// GET ALL VALUES FROM EXCEL
		for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet1.getRow(i);
                  
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row2.getCell(j);

				System.out.println(cell2);

			}

		}
	}

}
