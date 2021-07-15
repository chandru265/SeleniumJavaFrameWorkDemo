package PropertiesFileDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import SeleniumF1.GoogleSearchPMO;

public class PropertiesFile_demo {

	static Properties prop =new Properties();
	static	String ProjectPath = System.getProperty("user.dir");

	public static void main(String[] args) {

		testing();
		testing2();
		testing();
	}

	public static void testing() {

		try {
			//System.out.println(ProjectPath);
			InputStream input = new FileInputStream(ProjectPath+"\\src\\test\\java\\PropertiesFileDemo\\propertiesFile1.properties");	
			prop.load(input);
			String brow= prop.getProperty("browser");
			System.out.println(brow);
			GoogleSearchPMO.browserName=brow;
		
		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(	exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void testing2() {
		try {
			OutputStream output = new FileOutputStream(ProjectPath+"\\src\\test\\java\\PropertiesFileDemo\\propertiesFile1.properties");	
			prop.setProperty("result", "pass");
			prop.store(output, null);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}



	}

}
