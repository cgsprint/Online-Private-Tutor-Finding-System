package com.cg.optfs.exception;

import java.util.Scanner;
class NullPointerException extends Exception{
	public NullPointerException() {
		super();
	}
}

public class MainClass extends Exception {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the username");
		
		String username = scanner.nextLine();
		
		System.out.println("Enter the password");
		
		String password = scanner.nextLine();
		
		
		try
		{
			if(username.equals("") && password.equals(""))
			
				throw new NullPointerException();
			else if(password.length()<=8) 
				throw new Exception();
			
		}catch(NullPointerException e)
			{
				System.out.println("Please enter valid username and password "+e);
			}catch(Exception e) {
				System.out.println("Please enter password of more than 8 charachters "+e);
			}
	
		
		
		
	}

}


