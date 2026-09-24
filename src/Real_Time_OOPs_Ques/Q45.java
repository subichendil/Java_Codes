package Real_Time_OOPs_Ques;

class Product
{
	int pId;
	String pName;
	double price;
	
	Product(int id, String name, double p)
	{
		pId=id;
		pName=name;
		price=p;
	}
	void displayProduct()
	{
		System.out.println("Product ID: "+pId);
		System.out.println("Product Name: "+pName);
		System.out.println("Price: "+price);
	}
	void shopProduct()
	{
		System.out.println(pName+" Product purchased.");
	}
}

public class Q45 
{
	public static void main(String[]args)
	{
		Product p1=new Product(101,"laptop", 70000);
		
		p1.displayProduct();
		p1.shopProduct();
	}
}
