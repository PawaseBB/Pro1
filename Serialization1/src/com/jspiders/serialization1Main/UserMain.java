package com.jspiders.serialization1Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.jspiders.serialization1.User;

public class UserMain{
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("How many of user you want?");
	int noOfUser=scanner.nextInt();
	
	for(int i=1; i<=noOfUser; i++) {
		System.out.println("Enter Id:- ");
		int id=scanner.nextInt();
		System.out.println("Enter User Name:- ");
		String userName=scanner.next();
		System.out.println("Enter Password:- ");
		String password=scanner.next();

		User user=new User(id, userName, password);
		
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("D:\\DemoSerializaton");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(user);
			System.out.println("Object Written");
			objectOutputStream.flush();
			objectOutputStream.close();
			
			FileInputStream fileInputStream=new FileInputStream("D:\\DemoSerializaton");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			User readObject=(User)objectInputStream.readObject();
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
	scanner.close();
	}
}