package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * This class contains reusable methods to perform actions on Properties file
 * @author hemad
 *
 */

public class PropertiesUtility {
	private Properties property;
	/**
	 * This method is to initialize Properties file
	 * @param filepath
	 */
	
	public void propertiesInitialization(String filepath) {
		FileInputStream fis = null;
		try {
			fis=new FileInputStream(filepath);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			}
		
		
		property = new Properties();
		try {
			property.load(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * This method is used to initialize Properties file
	 * @param key
	 * @return
	 */
public String fetchProperty(String key) {
	return property.getProperty(key);
}
}
