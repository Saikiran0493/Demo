package com.amazon.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	XSSFWorkbook workBook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	FileInputStream file;

	public void readExcel() {

		try {
			file = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\AmazonTestData.xlsx");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			workBook = new XSSFWorkbook(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getCellData(String sheetName) {

		sheet = workBook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		int colCount = sheet.getRow(rowCount).getLastCellNum();

		System.out.println("rows=" + rowCount + " " + "cols=" + colCount);

		for (int i = 0; i <= rowCount; ++i) {

			sheet.getRow(i);
			for (int j = 0; j <= colCount; ++j) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}

	}

}
