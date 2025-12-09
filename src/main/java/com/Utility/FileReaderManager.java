package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManager {
	
	private static FileInputStream fileinputstream;
	private static Properties property;
	
	public static void setupProperty() throws IOException {
		File file = new File("C:\\Users\\Monicka\\eclipse-workspace\\MavenProject\\src\\main\\resources\\TestData.Properties");
		try {
			fileinputstream = new FileInputStream(file);	
			property = new Properties();
			property.load(fileinputstream);
		} catch (FileNotFoundException e) {
			Assert.fail("Error: Occured during file loading");
		}catch(Exception e) {
			Assert.fail("Error: Occured during file reading");
		}
	}
	public static String getDataProperty(String datavalue) throws IOException {
		setupProperty();
		String value = property.getProperty(datavalue);
		return value;
	}
	
}
