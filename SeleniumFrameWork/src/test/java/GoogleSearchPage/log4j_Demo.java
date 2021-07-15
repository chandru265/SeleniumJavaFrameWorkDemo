package GoogleSearchPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j_Demo {

private static Logger loggy = LogManager.getLogger(log4j_Demo.class);
	
	public static void main(String[] args) {
		
		System.out.println("\n hello world.....\n");
		
		loggy.info("\n...this is info message\n");
		loggy.error("\n this is error msg\n");
		loggy.fatal("\n this is fatal msg..\n");
		loggy.warn("\n this is warning msg \n");

		System.out.println("\n test completed");
	
	
	

	}

}
