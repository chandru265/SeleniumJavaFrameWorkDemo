package Util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtility2 {

	//static String projectPath;
	static XSSFWorkbook workBook;
	static XSSFSheet sheet;


	public ExcelUtility2(String ExcelPath, String sheetName) {

		try {

			//System.out.println("project path"+projectPath);
			workBook = new XSSFWorkbook(ExcelPath);
			sheet = workBook.getSheet(sheetName);

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		getRowCount();
		getRowdataString(0,0);
		getCelldataNumber(1,1);
	}
	public static void getRowCount() {


		try {

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

	public static void getRowdataString(int rowNum, int cellNum) {

		try {

			String rowData=sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
			System.out.println("Row data is :"+rowData);

		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}

	public static void getCelldataNumber(int rowNum, int cellNum) {

		try {

			double Celldata=sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
			System.out.println("Row data is :"+Celldata);

		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}

}

