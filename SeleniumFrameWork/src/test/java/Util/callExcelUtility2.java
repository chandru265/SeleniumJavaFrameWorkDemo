package Util;

public class callExcelUtility2 {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		
		ExcelUtility2 excel1 = new ExcelUtility2(projectPath+"/Excel/Book5.xlsx","Sheet1");
		
		excel1.getRowCount();
		excel1.getCelldataNumber(1, 1);
		excel1.getRowdataString(0, 0);
	}

}
