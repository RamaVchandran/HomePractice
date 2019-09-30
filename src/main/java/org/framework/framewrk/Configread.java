package org.framework.framewrk;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configread {

	public static void main(String[] args) throws IOException {
		File f = new File ("E:\\Project workspace\\framewrk\\Config.properties");
		FileInputStream stream = new FileInputStream(f);
		Properties p = new Properties();
		p.load(stream);
		System.out.println(p.get("url"));
	}

}
