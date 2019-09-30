package org.framework.framewrk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Test {

	public static void main(String[] args) throws IOException {

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
				Cell current = headerRow.getCell(j);
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
		System.out.println(maplist.get(3).get("FirstName"));

	}
}
