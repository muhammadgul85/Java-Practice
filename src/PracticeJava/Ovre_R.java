package PracticeJava;

class O_R 
{
	void tang1 (int a, int b)
	{
		System.out.println("Addition : " + "  " +(a+b));
	}
	void tang2 (int a, int b)
	{
		System.out.println("Subtraction : " + "  " +(a-b));
	}
}
class second extends O_R 
{
	
	
	void tang1 (int a, int b)
	{
		System.out.println("Multiplication: " + "  " + a * b);
		super.tang1(22, 3);
	}
	void tang2 (int a, int b)
	{ 
		System.out.println("Division" + "  " + a/b);
	}	
}
public class Ovre_R {
	public static void main(String[] args) {
		second sec = new second ();
		sec.tang1(2, 3);
		sec.tang2(33, 3);		
	}
}