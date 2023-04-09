package PracticeJava;

public class Cons_Ex2 {
	Cons_Ex2 ()
	{
		System.out.println("Constructor");
	}
	Cons_Ex2 (String name , String grade)
	{
		System.out.println("Name: "+ name +" : Grade: "+grade);
	}
	
	public static void main(String[] args) {
		Cons_Ex2 ce = new Cons_Ex2 ();
		Cons_Ex2 ce1 = new Cons_Ex2 ("Ali", "A");
		Cons_Ex2 ce2 = new Cons_Ex2 ("Afzal Khan", " B");
		Cons_Ex2 ce3 = new Cons_Ex2 ("Mumtaz ", " C");
		Cons_Ex2 ce4 = new Cons_Ex2 (" Banut " , "D ");
		
		
	}

}
