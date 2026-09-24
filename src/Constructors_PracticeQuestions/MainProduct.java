package Constructors_PracticeQuestions;

class Product
{
	int productId;
    String productName;
    double price;
    
    Product(int id, String name, double p) {
        productId = id;
        productName = name;
        price = p;
	}
}

public class MainProduct 
{
	public static void main(String[]args)
	{
		 Product p1 = new Product(101, "Laptop", 50000);

	        System.out.println("Product ID: " + p1.productId);
	        System.out.println("Product Name: " + p1.productName);
	        System.out.println("Price: " + p1.price);
	}
}
