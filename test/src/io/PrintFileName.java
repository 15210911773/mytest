package io;

import java.io.File;

public class PrintFileName {
	public void getFileName(File file) {
		if(file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				if(file2.isDirectory()) {
					System.out.println("�ļ��� �� " + file2.getAbsolutePath());
					getFileName(file2);
				} else {
					System.out.println("�ļ� �� " + file2.getAbsolutePath());
				}
			}
		} else {
			System.out.println("�ļ� �� " + file.getAbsolutePath());
		}
	}
	
	public static void main(String[] args) {
		new PrintFileName().getFileName(new File("E:\\���˼���"));
	}
}
