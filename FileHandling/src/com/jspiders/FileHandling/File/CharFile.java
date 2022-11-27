package com.jspiders.FileHandling.File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharFile {

	public static void main(String[] args) {
	File file=new File("CharStream.txt");
//	if(file.exists()){
//			System.out.println("File Exist.");
//	}else {
		file.setReadable(true);
		file.setWritable(true);
		try {
			file.createNewFile();
			System.out.println("File Created.");
			
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("This is the data sent to that file.");
			System.out.println("Content Written to the File.");
			fileWriter.close();
			
			FileReader fileReader=new FileReader(file);
			System.out.println(fileReader.read());
			System.out.println("Content is Readed.");
			fileReader.close();
			
			Scanner scanner=new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			System.out.println("content is Readed");
			scanner.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	}

//}
