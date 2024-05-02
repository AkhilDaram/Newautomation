package com.vtiger.genericUtilities;

import java.io.FileInputStream;
import java.util.Properties;
public class Propertyfileutility {
public String readDataFromPropertyfile(String key) throws Throwable {
	FileInputStream fisp=new FileInputStream(Iconstautility.propertyfilepath);
	Properties p=new Properties();
	p.load(fisp);
	return p.getProperty(key);
}
}
