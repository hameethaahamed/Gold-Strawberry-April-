package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties  prop;
		prop = new Properties();
		prop.load(new FileInputStream(new File("./config.properties")));
		
		System.out.println(prop.getProperty("URL"));
	
	}

	
	
	
	
	
	
	
}
