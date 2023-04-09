package PracticeJava;

abstract class abc
{
	abstract void dress();
}
class MuhammadGul extends abc 
{

	@Override
	void dress() {
		System.out.println("Muhammad is wearing black uniform");
		
	}	
}
class AfzalBhai extends abc
{
	@Override
	void dress() {
		
		System.out.println("Afzal Bhai is wearing dress suite");		
	}
	
}
public class Abstraction_Ex1 {
	
	public static void main(String[] args) {
		AfzalBhai az = new AfzalBhai ();
		az.dress();
		
		MuhammadGul mg = new MuhammadGul ();
		mg.dress();
	}

}
