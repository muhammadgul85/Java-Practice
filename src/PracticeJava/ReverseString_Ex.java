package PracticeJava;

public class ReverseString_Ex {
	public static void main(String[] args) {
		
		
		String w = "Mohd Afzal ansari bhai from India Hyderabad";
		System.out.println("Length of w: " + w.length());
		
		for (int i = w.length() -1; i >= 0; i--)// when use i>0 only it will skip M, which is first String
		{
			System.out.println("Reverse: " + w.charAt(i));
		}
		String ap = "I am trying to learn Java for long time";
		System.out.println("Length of ap is: "+ ap.length());
		
		for (int i = ap.length()-1; i >=0; i--)
		{
			System.out.println("ap reverse string: " + ap.charAt(i));
		}
	}
	
	
	

}
