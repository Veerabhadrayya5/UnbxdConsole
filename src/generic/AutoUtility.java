package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class AutoUtility {

	public static String getPropertyValue(String path, String key)
	{
	String value=" ";
	try
	{
	
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		
		
		value=p.getProperty(key);
	}
	
	catch(Exception e)
	{
		
	}
	return value;
	}
	
}
