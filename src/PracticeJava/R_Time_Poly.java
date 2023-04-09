package PracticeJava;

class Grandfather
{
	void G1 ()
	{
		System.out.println("Grandpa");
	}
}
class Father extends Grandfather 
{
	void G1 ()
	{
		System.out.println("Father inheriting Grandpa");
	}
}
class Son extends Grandfather
{
	void G1 ()
	{
		System.out.println(" Son inheriting");
		super.G1();// calling Grandpa method with super keyword
	}	
}
public class R_Time_Poly {
	public static void main(String[] args) {		
		Grandfather aa = new Son();
		aa.G1();		
	}
}