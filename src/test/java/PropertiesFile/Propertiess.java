package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class Propertiess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Properties prop=new Properties();	
		
		
		//reading the data from input file
		FileInputStream fis =new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\PropertiesFile\\data.properties");
		
		//load into property file
		
	    prop.load(fis);
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("password"));
		
		
		//Updating into properties file
		prop.setProperty("result", "pass");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\src\\test\\java\\PropertiesFile\\data.properties");
		prop.store(fos, null);


		
	}



}
