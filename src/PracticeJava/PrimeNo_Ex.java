package PracticeJava;

public class PrimeNo_Ex {
	public static void main(String[] args) {
		
		
		int n = 8;
		
		for (int i=2; i<=8; i++)
		{
			if (n%i == 0)
			{
				System.out.println("Not a prime No");
				return;
			}
		}
		System.out.println("n is Prime");
	}

}
