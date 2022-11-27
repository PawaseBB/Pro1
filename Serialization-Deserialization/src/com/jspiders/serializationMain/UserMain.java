package com.jspiders.serializationMain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jspiders.serialization.User;

public class UserMain {

	public static void main(String[] args) {
		User user=new User(1,"Aditya", "aditya123");
		
		try {
			FileOutputStream fileOutputSteram=new FileOutputStream("D:\\File.txt");
			
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputSteram);
			objectOutputStream.writeObject(user);
			System.out.println("Object Written.");
			objectOutputStream.flush();
			objectOutputStream.close();
			
			FileInputStream fileInputStream=new FileInputStream("D:\\File.txt");
			
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			
			User readObject=(User) objectInputStream.readObject();
			System.out.println(readObject);
			objectInputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
