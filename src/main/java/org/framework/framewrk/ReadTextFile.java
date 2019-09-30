package org.framework.framewrk;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ReadTextFile {
	public static void main(String[] args) throws IOException {
		File f = new File ("C:\\Users\\Dhamo\\Desktop\\read.txt");
		List<String> readLines = FileUtils.readLines(f);
		for (String string : readLines) {
			System.out.println(string);
		}
	}

}
