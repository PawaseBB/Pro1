package com.jspiders.FileHandling.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileRW {

	public static void main(String[] args) {
		File file=new File("Read-File");
//		if(file.exists())
//		{
//			System.out.println("File Exist");
//		}else 
		{
			try {
				file.createNewFile();
				System.out.println("File is Created");
				
				FileOutputStream opStream=new FileOutputStream(file);
				opStream.write(45);
				System.out.println("Content writter to file");
				opStream.close();
				
				FileInputStream ipStream=new FileInputStream(file);
				ipStream.read();
				System.out.println("file Readed");
				ipStream.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			file.setReadable(true);
			file.setWritable(true);
		
		

	}

}
}
