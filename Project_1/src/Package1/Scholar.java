package Package1;

public class Scholar
{
	public Scholar() 
	{
		System.out.println("Default constructor");
		// TODO Auto-generated constructor stub
	}
	public Scholar(int a)
	{
		System.out.println("One parameterized constructor");
	}
	public  Scholar(int a,int b)
	{
		System.out.println("Two parameterised constructor");
	}
	public static void main(String[] args)
	{
		Scholar ob=new Scholar(344,222);
		
	}

}
