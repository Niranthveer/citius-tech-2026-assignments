package com.citiustech;

import java.util.Scanner;

public class Registration 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number of usernames : ");
		int n = scanner.nextInt();
		boolean isValid = false;
		
		for (int i = 1 ; i<=n ;i++)
		{
			System.out.println("Enter username "+i);
			// abcd_1234
			String username = scanner.next();
			
			
			if(username.length() > 5 && username.length()<=15 && Character.isLetter(username.charAt(0)))
			{
				isValid = true;
			}
			
			if(isValid)
			{
				System.out.println("Your name is valid !!");
				System.out.println(username.toLowerCase());
			}
			else 
			{
				System.out.println("Invalid username ....");
			}	
			
		}
		
	}
	 
}
