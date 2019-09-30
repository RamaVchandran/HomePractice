package org.framework.framewrk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	// config driver
	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\Project workspace\\framewrk\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	// loadurl
	public static void loadurl(String url) {
		driver.get(url);

	}

	// sendkey
	public static void type(WebElement element, String name) {
		element.sendKeys(name);
	}

	// buttonclick
	public static void butnClick(WebElement element) {
		element.click();

	}

	// findelement
	public static WebElement chooseElement(int x, String path) {

		WebElement webElement = null;

		switch (x) {
		case 1:
			webElement = driver.findElement(By.id(path));
			break;
		case 2:
			webElement = driver.findElement(By.className(path));
			break;
		case 3:
			webElement = driver.findElement(By.linkText(path));
			break;
		case 4:
			webElement = driver.findElement(By.xpath(path));
			break;
		case 5:
			webElement = driver.findElement(By.cssSelector(path));
			break;
		case 6:
			webElement = driver.findElement(By.tagName(path));
			break;
		}
		return webElement;

	}

	public static String Excel(int rownum, int cellnum) throws IOException {

		File excol = new File("E:\\Project workspace\\framewrk\\Testdata\\Adactin.xlsx");
		FileInputStream stream = new FileInputStream(excol);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("data");
		Row r = s.getRow(rownum);
		Cell c = r.getCell(cellnum);
		int type = c.getCellType();
		String name = null;
		if (type == 1) {
			name = c.getStringCellValue();

		}

		if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				name = new SimpleDateFormat("dd-mm-yyy").format(c.getDateCellValue());

			} else
				name = String.valueOf((long) c.getNumericCellValue());
			{

			}

		}
		return name;

	}

	public static void write(int rownum, int cellnum, String name) throws IOException {
		File excol = new File("E:\\Project workspace\\framewrk\\Testdata\\Adactin.xlsx");
		FileInputStream stream = new FileInputStream(excol);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("data");
		Row trow = s.getRow(rownum);
		Cell c = trow.createCell(cellnum);
		c.setCellValue(name);
		FileOutputStream o = new FileOutputStream(excol);
		w.write(o);

	}

	public static String getData(int rowNum, String ColumnName) throws IOException {
		List<LinkedHashMap<String, String>> maplist = new ArrayList<LinkedHashMap<String, String>>();
		File excol = new File("E:\\Project workspace\\framewrk\\Testdata\\Adactin.xlsx");
		String SheetName = ("data");
		FileInputStream f = new FileInputStream(excol);
	Workbook w = new XSSFWorkbook(f);
	Sheet s = w.getSheet(SheetName);
		Row headerRow = s.getRow(0);
		for (int i = 1; i < s.getPhysicalNumberOfRows(); i++) {
			Row currentrow = s.getRow(i);
			LinkedHashMap<String, String> data = new LinkedHashMap<String, String>();

			for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
				Cell current = currentrow.getCell(j);
				int type = current.getCellType();
				if (type == 1) {
					data.put(headerRow.getCell(j).getStringCellValue(), current.getStringCellValue());
				} else if (type == 0) {
					if (DateUtil.isCellDateFormatted(current)) {
						data.put(headerRow.getCell(j).getStringCellValue(),
								new SimpleDateFormat("dd-MMM-YY").format(current.getDateCellValue()));
					} else {
						data.put(headerRow.getCell(j).getStringCellValue(),
								String.valueOf((long) current.getNumericCellValue()));

					}
				}

			}

			maplist.add(data);

		}

		return maplist.get(rowNum).get(ColumnName);

	}
}