package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtility {

	static String projectPath;
	static XSSFWorkbook workBook;
	static XSSFSheet sheet;

	public static void main(String[] args) {

		getRowCount();
		getRowdataString();
		getCelldataNumber();
	}
	public static void getRowCount() {


		try {

			projectPath = System.getProperty("user.dir");
			System.out.println("project path"+projectPath);
			workBook = new XSSFWorkbook(projectPath+"/Excel/Book5.xlsx");
			sheet = workBook.getSheet("Sheet1");
			//HSSFWorkbook workbook = new HSSFWorkbook();
			//workbook.getSheet("D:\\project\\SeleniumFrameWork\\Excel\\newExcel.xlsx");
			//HSSFSheet sheet = workbook.getSheet("newExcel1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("rows count is :"+rowCount);

		}catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}

	public static void getRowdataString() {

		try {

			projectPath = System.getProperty("user.dir");
			workBook = new XSSFWorkbook(projectPath+"/Excel/Book5.xlsx");
			sheet = workBook.getSheet("Sheet1");
			String rowData=sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Row data is :"+rowData);

		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}

	public static void getCelldataNumber() {

		try {

			projectPath = System.getProperty("user.dir");
			workBook = new XSSFWorkbook(projectPath+"/Excel/Book5.xlsx");
			sheet = workBook.getSheet("Sheet1");
			double Celldata=sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println("Row data is :"+Celldata);

		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}

}

