package PracticeJava;

public class Quiz {
	 int i = 11;
	 int j = 10;
	public static void main(String[] args) {
		Quiz a = new Quiz ();
		a.sub();
		
	}
	
	 void sub() // we can also use: public void sub () 
	{
		int k = i - j;
		System.out.println(k);
	}

}
