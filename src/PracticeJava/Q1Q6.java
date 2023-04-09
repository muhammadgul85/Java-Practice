package PracticeJava;

public class Q1Q6 {
	int a = 1; // Global variable, it's a catch, nothing to do in quiz/program
	
	public void method (int a)
	{
		a += 1;
		System.out.println(++a);
	}
	public static void main(String[] args) {
		Q1Q6 qz = new Q1Q6 ();
		qz.method(2);
		// we are calling method and passing value 2
		// then we are adding a += 1; which makes it 3
		// then System.out.println(++a); will add 1 = makes it 4
	}

}
