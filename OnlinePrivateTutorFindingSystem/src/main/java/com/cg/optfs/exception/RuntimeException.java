package com.cg.optfs.exception;

import java.util.Scanner;

import com.cg.optfs.entity.Parent;
import com.cg.optfs.entity.ParentTO;

public class RuntimeException extends Exception {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ParentTO p=new ParentTO();
		
		String regex="^[a-zA-Z][0-9]+@[a-zA-Z]{2,4}$";
		System.out.println("Enter FirstName: ");
		String firstname=scan.nextLine();
		System.out.println("Enter LastName: ");
		String lastname=scan.nextLine();
		System.out.println("Enter Username: ");
		String username=scan.nextLine();
		System.out.println("Enter password: ");
		String password=scan.nextLine();
		System.out.println("Enter Mobileno:");
		String mobileno=scan.nextLine();
		System.out.println("Enter email: ");
		String email=scan.nextLine();
		System.out.println("Enter Address: ");
		String address=scan.nextLine();
	    try {
			
			if(firstname.equals("") && lastname.equals("") && username.equals("") && password.equals("") && mobileno.equals("") && address.equals("") && email.equals("")) {
				throw new NullPointerException();
			}else if(!email.matches(regex)) {
				throw new RuntimeException();
			}
		}catch(NullPointerException e) {
			System.out.println("All the information has to be filled"+e);
		}catch(RuntimeException e) {
			System.out.println("Enter correct Email "+e);
		}
		
	}
}
