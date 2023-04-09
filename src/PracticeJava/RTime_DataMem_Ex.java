package PracticeJava;
//Run time polymorphism is applicable to method only, not data members
class Honda
{
	int speed = 90;
	
	void test1 ()
	{
		System.out.println("Honda Method");
	}
}

class Suzuki extends Honda
{
	
	int speed = 100;
	void test1 ()
	{
		super.test1();
		//System.out.println("Suzuki Method");
	}
}



public class RTime_DataMem_Ex {
	public static void main(String[] args) {
		
		
		Honda test = new Suzuki ();
		System.out.println(test.speed);
		test.test1();
	}

}
