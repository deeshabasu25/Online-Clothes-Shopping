package shoppingsystem;

import static shoppingsystem.AdminOperation.*;
import static shoppingsystem.UserOperation.*;

public class MainArea 
{
	public static void allAccessories()
	{
		int choice;
		while(true)
		{
			System.out.println("===============================================");
			System.out.println("Press 1. Admin Panel\nPress 2. User Panel\nPress 3. Exit");
			System.out.println("===============================================");
			System.out.println("Enter your choice : ");
			System.out.println("===============================================");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: adminOperation();
						System.out.println("===========================================");
						break;
				
				case 2: userSections();
						break;
				
				case 3: System.exit(0);
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("~~~~WELCOME TO ZARA~~~~");
		allAccessories();
	}
}
