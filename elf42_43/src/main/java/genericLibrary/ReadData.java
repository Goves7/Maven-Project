package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	/**
	 * This method helps us to read the data from the excel file of any format
	 * (both .xls and .xlsx).
	 * 
	 * @param sheetName You have to pass the name of the sheet where the data is
	 *                  stored.
	 * @param rowNo     You need to enter the row number where the data is stored.
	 * @param cellNo    You need to enter the cell number where the data is stored.
	 * @return
	 */
	public static String fromExcel(String sheetName, int rowNo, int cellNo) {
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			fis = new FileInputStream(new File("C:\\Users\\Admin\\git\\repository2\\elf42_43\\src\\test\\resources\\testData\\testData.xlsx"));
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		// return
		// workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		if (sheetName.equalsIgnoreCase("Number")) {
			double value = workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
			String s = String.valueOf(value);
			return s;
		} else if (sheetName.equalsIgnoreCase("Boolean")) {
			boolean bool = workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getBooleanCellValue();
			String s1 = String.valueOf(bool);
			return s1;

		} else if (sheetName.equalsIgnoreCase("Date")) {
			String dateAndTime = workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getLocalDateTimeCellValue()
					.now().toString();
			return dateAndTime;
		} else {
			return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();

		}

	}

	public static String fromPropertyFile(String key) {
		FileInputStream fis = null;
		Properties properties = null;
		try {
			fis = new FileInputStream("C:\\Users\\Admin\\git\\repository2\\elf42_43\\src\\test\\resources\\testData\\configuration.properties");
			properties = new Properties();
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return properties.getProperty(key);
	}

}
