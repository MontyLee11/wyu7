package com.file;
import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("D:\\vue-devtools-dev");
		System.out.println("�ļ���");
		for (File file1 : file.listFiles()) {
			if (file1.isFile()) {
				System.out.println(file1.getName());
			}
		}
		System.out.println("�ļ��У�");
		for (File file2 : file.listFiles()) {
			if(file2.isDirectory()) {
				System.out.println(file2.getName());
			}
		}
		
	}
}
