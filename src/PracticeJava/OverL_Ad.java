package PracticeJava;


class overL 
{
	void test1 (double a, int b)
	{
		System.out.println("double a: "+a + " int b: "+b);
	}
	
	void test1 (long a, int b)
	{
		System.out.println("long a: "+ a + " int b: "+ b);
	}
}



public class OverL_Ad {
	public static void main(String[] args) {
		overL ol = new overL ();
		ol.test1(22.3333, 33);
		ol.test1(3l, 4);
		ol.test1(44.44, (int) 55.88);
	}

}
