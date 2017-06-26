package io;

import java.io.File;

public class PrintFileName {
	public void getFileName(File file) {
		if(file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				if(file2.isDirectory()) {
					System.out.println("文件夹 ： " + file2.getAbsolutePath());
					getFileName(file2);
				} else {
					System.out.println("文件 ： " + file2.getAbsolutePath());
				}
			}
		} else {
			System.out.println("文件 ： " + file.getAbsolutePath());
		}
	}
	
	public static void main(String[] args) {
		new PrintFileName().getFileName(new File("E:\\个人简历"));
	}
}
