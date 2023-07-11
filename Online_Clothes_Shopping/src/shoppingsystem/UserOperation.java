package shoppingsystem;
import static shoppingsystem.AdminOperation.*;
import static shoppingsystem.MainArea.*;
public class UserOperation 
{
	static TypeOfClothes[] cart = new TypeOfClothes[10];
	static int cartCount = 0;
	public static void userSections()
	{
		int choice;
		while(true)
		{
			System.out.println("===============================================");
			System.out.println("Press 1. Clothes Details\nPress 2. Add To Cart\nPress 3. Display Cart\n"
					                                         + "Press 4. Back To Main Menu\n");
			System.out.println("===============================================");
			System.out.println("Enter your choice : ");
			System.out.println("===============================================");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: clothesDetailsDisplay();
						System.out.println("===========================================");
						break;
				
				case 2: addToCart();
						System.out.println("===========================================");
						break;
						
				case 3: displayCart();
				        System.out.println("===========================================");
				        break;
						
				case 4: allAccessories();
				        System.out.println("=======================================");
				        break;
			}
		}
	}
	
	public static void addToCart()
	{
		System.out.println("Cart Count = "+cartCount);
		System.out.println("Enter Clothes Id : ");
		int clothesId = sc.nextInt();
		
		for(int i=0; i<womenCount; i++)
		{
			if(clothesId == women[i].getId())
			{
				cart[cartCount++] = women[i];
				System.out.println("Cart Count = "+cartCount);
				break;
			}
		}
		
		for(int i=0; i<menCount; i++)
		{
			if(clothesId == men[i].getId())
			{
				cart[cartCount++] = men[i];
				break;
			}
		}
		System.out.println("Cart Count = "+cartCount);
	}
	
	public static void displayCart()
	{
		System.out.println("=================================");
		for(int i=0; i<cartCount; i++)
		{
			System.out.println("Id : "+cart[i].getId());
			System.out.println("Name : "+cart[i].getClothesName());
			System.out.println("Size: "+cart[i].getSize());
			System.out.println("Colour: "+cart[i].getColour());
			System.out.println("Material: "+cart[i].getMaterial());
			System.out.println("Price: "+cart[i].getPrice());
			System.out.println("=================================");
		}
		sc.nextLine();
		System.out.println("Confirm?(Y/N) : ");
		String choice = sc.nextLine();
		if(choice.equalsIgnoreCase("Y"))
		{
			System.out.println("Purchase Successful!!");
		}
		else
		{
			sc.nextLine();
			System.out.println("Add more in cart?(Y/N) : ");
			String choice1 = sc.nextLine();
			if(choice1.equalsIgnoreCase("Y"))
			{
				addToCart();
			}
			else
			{
				removeFromCart();
			}
		}
	}
	
	public static void removeFromCart()
	{
		System.out.println("Enter the id for which you want to remove the clothes : ");
		int clothesId = sc.nextInt();
	
		for(int i=0; i<cartCount; i++)
		{
			if(cart[i].getId() == clothesId)
			{
				for(int j=i; j<cartCount-1; j++)
				{
					cart[j] = cart[j+1];
				}
				cartCount--;
				System.out.println("The clothes has been removed.");
				break;
			}
		}
	}
}


