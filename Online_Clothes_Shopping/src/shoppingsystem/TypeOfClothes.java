package shoppingsystem;

import java.util.Arrays;

public class TypeOfClothes 
{
	private int id;
	private String clothesName;
	private String size;
	private String colour;
	private String material;
	private int price;
	private int quantity = 0;
	
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getClothesName() 
	{
		return clothesName;
	}
	public void setClothesName(String clothesName) 
	{
		this.clothesName = clothesName;
	}
	public String getSize() 
	{
		return size;
	}
	public void setSize(String size) 
	{
		this.size = size;
	}
	public String getColour() 
	{
		return colour;
	}
	public void setColour(String colour) 
	{
		this.colour = colour;
	}
	public String getMaterial() 
	{
		return material;
	}
	public void setMaterial(String material) 
	{
		this.material = material;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	
	
	public TypeOfClothes(int id, String clothesName, String size, String colour, String material, int price,
			int quantity) 
	{
		super();
		this.id = id;
		this.clothesName = clothesName;
		this.size = size;
		this.colour = colour;
		this.material = material;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("TypeOfClothes [id=");
		builder.append(id);
		builder.append(", clothesName=");
		builder.append(clothesName);
		builder.append(", size=");
		builder.append(size);
		builder.append(", colour=");
		builder.append(colour);
		builder.append(", material=");
		builder.append(material);
		builder.append(", price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}
}
