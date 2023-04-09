package PracticeJava;


class test11
{
	void test1()
	{
		System.out.println("Test1 No parameters");
	}
	void test1 (int a, int b)
	{
		System.out.println("int a: "+a + " int b: "+b);
	}
	void test1(String a, String b)
	{
		System.out.println("String a: "+ a + " String b: "+b);
		
	}
	
	void test1(double a, float b)
	{
		System.out.println("Double a: "+ a + " Float b:" +b);
	}
}


public class compileT_Poly {
	public static void main(String[] args) {
		test11 demo1 = new test11 ();
		demo1.test1();
		demo1.test1(11d, 44.11f);
		demo1.test1(33, 90);
		demo1.test1("Muhammad Afzal " , " Ansari");
	}

}
