package PracticeJava;

//When a member of the class is declared as static, it can be accessed before the objects of its class are created, and without any object reference.

class static21 
{
	static String q = "New String for test";
	public static void test21()
	{
		System.out.println("Static Method 1");
	}
}
public class Static_Pr {
	
	public static int j = 20;
	public static void test22 ()
	{
		System.out.println("Static Method 2 ");
	}	
	static int k ()
	{
		System.out.println("Static int k method");
		return 30;
		
	}
	static
	{
		System.out.println("Static block to be executed");
	}
	public static void main(String[] args) {
		
		static21.test21();
		test22();
		k();
		System.out.println("static var inside public class: "+j);
		System.out.println("static var outside public class: " + static21.q);		
	}
}