package ClassesAndObjects_PracticeQuestions;

class Book
{
	int bookId;
	String bookName;
	String author;
}

public class BookClassQ4 
{
	public static void main(String[]args)
	{
		Book b1=new Book();
		b1.bookId=1;
		b1.bookName="English";
		b1.author="James";
		
		Book b2=new Book();
		b2.bookId=2;
		b2.bookName="Maths";
		b2.author="Ramanuja";
		
		Book b3=new Book();
		b3.bookId=3;
		b3.bookName="Science";
		b3.author="Newton";
		
		System.out.println("Book 1 Details: ");
		System.out.println("Book ID: "+ b1.bookId);
		System.out.println("Book Name: "+b1.bookName);
		System.out.println("Author: "+b1.author);
		
		System.out.println("Book 2 Details: ");
		System.out.println("Book ID: "+ b2.bookId);
		System.out.println("Book Name: "+b2.bookName);
		System.out.println("Author: "+b2.author);
		
		System.out.println("Book 3 Details: ");
		System.out.println("Book ID: "+ b3.bookId);
		System.out.println("Book Name: "+b3.bookName);
		System.out.println("Author: "+b3.author);
	}
}
