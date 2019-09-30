package org.framework.framewrk;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Writetext {

	public static void main(String[] args) throws IOException {
		File f = new File ("C:\\Users\\Dhamo\\Desktop\\read.txt");
		FileUtils.write(f, "Hello\t", true);
	}

}
