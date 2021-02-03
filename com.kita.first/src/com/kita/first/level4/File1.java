package com.kita.first.level4;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		File file1 = new File("C:/java_jiho/file_test/file1.txt");
		boolean isExist = file1.exists();
		
		if(isExist == false) {
			file1.mkdirs();
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}catch(Exception e) {
				
			}
		}
		
		String file1Path = file1.getPath();   //파일의 경로값을 알고싶을때 
		boolean result2 = file1.isDirectory();
		boolean result3 = file1.isFile();
		
		
		
	}
}
