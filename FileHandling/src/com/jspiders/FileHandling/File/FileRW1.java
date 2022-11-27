package com.jspiders.FileHandling.File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW1 {

	public static void main(String[] args) {
		File file=new File("file1.txt");
		
		try {
			file.createNewFile();
			System.out.println("File is Createt");
			
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("this is data sent to the file.");
			System.out.println("content writer into file.");
			fileWriter.close();
			
			FileReader fileReader=new FileReader(file);
			System.out.println(fileReader.read());
			System.out.println("content is read.");
			fileReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		

	}

}
