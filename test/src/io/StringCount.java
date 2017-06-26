package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StringCount {
	public void countString(File file, String str) throws IOException {
		if(file == null) {
			return ;
		}
		if(file.isDirectory()) {
			return ;
		}
		
		int count = 0;
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line = br.readLine()) != null) {
			if(line != null && !line.equals("")) {
				line = line.toLowerCase();
				if(line.contains(str)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) throws IOException {
		StringCount stringCount = new StringCount();
		stringCount.countString(new File("E:\\个人简历\\Java开发工程师简历模板.html"), "java");
	}
}
