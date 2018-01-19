package org.garapata.angas.tools.core.file.parsing;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class PropertiesFileLoader {
	public InputStream getPropertiesFromInternalFile(String propFile){
		InputStream is = getClass().getClassLoader().getResourceAsStream(propFile);
		return is;
	}
	
	public InputStream getPropertiesFromExternalFile(String propFile) throws FileNotFoundException {
		FileInputStream fis = null;
		InputStream bis = null;
		File extFile = new File(propFile);
		if (null != extFile && extFile.exists() && !extFile.isDirectory()) {
			fis = new FileInputStream(extFile);
		} else {
			throw new FileNotFoundException(getClass().getSimpleName() + "External properties file " + propFile  + " does not exist.");
		}
		bis = new BufferedInputStream(fis);
		return bis;
	}
}
