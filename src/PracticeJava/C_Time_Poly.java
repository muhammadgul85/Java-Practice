package PracticeJava;

class compilet
{
	void samemethod ()
	{
		System.out.println("No parameter");
	}
	void samemethod (int a, int b) 
	{
		System.out.println("int a: "+ a + " int b: " +b);	
	}
	void samemethod (String a, int b)
	{
		System.out.println("String a: "+a + "  "+ "int b: " +b);
	}
}

public class C_Time_Poly {
	public static void main(String[] args) {
		
		
		compilet cc = new compilet ();
		cc.samemethod();
		cc.samemethod(22, 2);
		cc.samemethod("A" , 44);
	}
}
