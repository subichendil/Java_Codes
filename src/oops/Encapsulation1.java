package oops;

class Person_A
{
	private String name;
	private int age;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		if(age>0)
		{
			this.age=age;
		}
	}
	public int getAge() {
		return age;
	}
}
public class Encapsulation1 {
	public static void main(String[]args)
	{
		Person_A person=new Person_A();
		person.setName("Annie");
		person.setAge(23);
		
		System.out.println("Name: "+ person.getName()+ " Age: "+ person.getAge());
		person.setAge(-5);/* -5 !> 0 ==> So the age will not change It'll remain same as before i.e.,23 */
	}
}
