package com.jspiders.FileHandling.File;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File file=new File("DemoFile.txt");
		
//		try {
//			file.createNewFile();
//			System.out.println("File is Created Succesfully.");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		if(file.canRead())
		{
			System.out.println("File can Read.");
		}
		else {
			System.out.println("not read.");
		}
	}

}
