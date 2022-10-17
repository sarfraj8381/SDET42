package com.crm.Generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_Utility {
/**
 * this method is used to fetch the data from property file
 * @param key
 * @return
 * @throws IOException
 * @author Sarfraj
 */
	public String getPropertyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream(ipathConstant.PROPERTYFILE_PATH);
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
}
