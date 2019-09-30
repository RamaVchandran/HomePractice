package org.framework.framewrk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Writeconfig {

	public static void main(String[] args) throws IOException {
		FileOutputStream stream = new FileOutputStream("E:\\Project workspace\\framewrk\\Config.properties");
		Properties p = new Properties();
		p.setProperty("Username", "Java");
		p.setProperty("password", "ram");
		p.store(stream, "hello");

	}

}
