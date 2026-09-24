package methods;

class MethodThis{
void show() {
	System.out.println("Welcome");
}
void Display()
{
	this.show();
}
}
public class methodThisDemo {
public static void main(String[]args) {
	MethodThis mt=new MethodThis();
	mt.Display();
}
}
