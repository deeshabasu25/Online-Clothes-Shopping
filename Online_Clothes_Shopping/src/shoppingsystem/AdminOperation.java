package shoppingsystem;

import static shoppingsystem.MainArea.*;
import java.util.Scanner;

public class AdminOperation 
{
	static Scanner sc = new Scanner(System.in);
	static TypeOfClothes[] women = new TypeOfClothes[10];
	static int womenCount = 0;
	static TypeOfClothes[] men = new TypeOfClothes[10];
	static int menCount = 0;
	static TypeOfClothes t1;
	static void createClothes(String sectionName)
	{
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Name : ");
		String clothesName = sc.nextLine();
		
		System.out.println("Enter Size : ");
		String size = sc.nextLine();
		
		System.out.println("Enter Colour : ");
		String colour = sc.nextLine();
		
		System.out.println("Enter Material : ");
		String material = sc.nextLine();
		
		System.out.println("Enter Price : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Quantity : ");
		int quantity = sc.nextInt();
		
		sc.nextLine();
		
		t1 = new TypeOfClothes(id,clothesName,size,colour,material,price,quantity);
		if(sectionName.equalsIgnoreCase("Women"))
		{
			addClothesInWomen(t1);
		}
		
		if(sectionName.equalsIgnoreCase("Men"))
		{
			addClothesInMen(t1);
		}
		
	}
	
	public static void addClothesInWomen(TypeOfClothes t1)
	{
		women[womenCount++] = t1;
		System.out.println("Clothes Added Successfully!!");
	}
	
	public static void addClothesInMen(TypeOfClothes t1)
	{
		men[menCount++] = t1;
		System.out.println("Clothes Added Successfully!!");
	}
	
	public static void addClothesInSection()
	{
		sc.nextLine();
		System.out.println("Enter the section name : ");
		String sectionName = sc.nextLine();
		createClothes(sectionName);
	}
	
	static void adminOperation()
	{
		int choice;
		
		while(true)
		{
			System.out.println("=========================================");
			
			System.out.println("Press 1.Add Clothes in Section\n" 
			                 + "Press 2.Remove Clothes from Section\n"
							 + "Press 3.Display Clothes Details\n"
							 + "Press 4.Back To Main Menu\n");
			
			System.out.println("=========================================");
			System.out.println("Enter your choice!!");
			
			System.out.println("=========================================");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: 
						addClothesInSection();
						System.out.println("=======================================");
						break;
				
				case 2: removeClothesFromSection();
					    System.out.println("=======================================");
					    break;
					    
				case 3: clothesDetailsDisplay();
			    		System.out.println("=======================================");
			    		break;
			    		
				case 4: allAccessories();
	    				System.out.println("=======================================");
	    				break;
			}
			
		}
	}
	
	static void clothesDetailsDisplay()
	{
		sc.nextLine();
		System.out.println("Enter section name : ");
		String sectionName = sc.nextLine();
		if(sectionName.equalsIgnoreCase("Women"))
		{
			System.out.println("=================================");
			for(int i=0; i<womenCount; i++)
			{
				System.out.println("Id : "+women[i].getId());
				System.out.println("Name : "+women[i].getClothesName());
				System.out.println("Size: "+women[i].getSize());
				System.out.println("Colour: "+women[i].getColour());
				System.out.println("Material: "+women[i].getMaterial());
				System.out.println("Price: "+women[i].getPrice());
				System.out.println("=================================");
			}
		}
		
		if(sectionName.equalsIgnoreCase("Men"))
		{
			System.out.println("=================================");
			for(int i=0; i<menCount; i++)
			{
				System.out.println("Id : "+men[i].getId());
				System.out.println("Name : "+men[i].getClothesName());
				System.out.println("Size : "+men[i].getSize());
				System.out.println("Colour : "+men[i].getColour());
				System.out.println("Material: "+men[i].getMaterial());
				System.out.println("Price: "+men[i].getPrice());
				System.out.println("=================================");
			}
		}
	}
	

	public static void removeClothesFromSection()
	{
		sc.nextLine();
		System.out.println("Enter the section name : ");
		String sectionName = sc.nextLine();
		if(sectionName.equalsIgnoreCase("Women"))
		{
			removeClothesInWomen();
		}
		
		if(sectionName.equalsIgnoreCase("Men"))
		{
			removeClothesInMen();
		}
	}
	
	public static void removeClothesInWomen()
	{
		System.out.println("Enter the id for which you want to remove the clothes : ");
		int clothesId = sc.nextInt();
	
		for(int i=0; i<womenCount; i++)
		{
			if(women[i].getId() == clothesId)
			{
				for(int j=i; j<womenCount-1; j++)
				{
					women[j] = women[j+1];
				}
				womenCount--;
				System.out.println("The clothes has been removed.");
				break;
			}
		}
	}
	
	public static void removeClothesInMen()
	{
		System.out.println("Enter the id for which you want to remove the clothes : ");
		int clothesId = sc.nextInt();
	
		for(int i=0; i<menCount; i++)
		{
			if(men[i].getId() == clothesId)
			{
				for(int j=i; j<menCount-1; j++)
				{
					men[j] = men[j+1];
				}
				menCount--;
				System.out.println("The clothes has been removed.");
				break;
			}
		}
	}
}



