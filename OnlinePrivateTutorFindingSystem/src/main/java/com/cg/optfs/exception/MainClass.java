package com.cg.optfs.exception;

import java.util.Scanner;

public class MainClass extends Exception {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the username");
		
		String username = scanner.nextLine();
		
		System.out.println("Enter the password");
		
		String password = scanner.nextLine();
		
		
		try
		{
			if(username==" " && password==" ")
			
				throw new NullPointerException();
			}
			catch(NullPointerException e)
			{
				System.out.println("Please enter valid username and password");
			}
	
		
		
		
	}

}


