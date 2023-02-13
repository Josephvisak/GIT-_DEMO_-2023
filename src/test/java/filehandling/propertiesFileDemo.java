package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class propertiesFileDemo {
	@Test(groups= {"smoke"})
	public void testpropertiesfile() throws IOException {

		// Create object for the file class
		File f = new File("./configuration.properties");

		// create object for the file input stream

		FileInputStream fis = new FileInputStream(f);

		// Create object for the properties

		Properties prop = new Properties();
		// Loading the property file
		prop.load(fis);
	
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("stg_app_url"));
	
	
	
	
	}
	
	
	
	
}
