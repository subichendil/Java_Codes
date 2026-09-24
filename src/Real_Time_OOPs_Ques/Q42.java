package Real_Time_OOPs_Ques;

class Book
{
	int bookId;
 	String bookName;
 	String author;
 	
 	Book(int id, String name, String authorName)
 	{
 		bookId=id;
 		bookName=name;
 		author=authorName;
 	}
 	
 	void displayBook()
 	{
 		System.out.println("Book ID: "+bookId);
 		System.out.println("Book Name: "+bookName);
 		System.out.println("Author: "+author);
 	}
}

public class Q42 
{
	public static void main(String[]args)
	{
		Book b1=new Book(101,"Java Basics", "James");
		b1.displayBook();
	}
}
