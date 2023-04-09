package Package1;

public class Bodmas {
	public int sum (int n1, int n2)
	{
		int n;
		n=n1+n2;
		System.out.println("The sum is "+n);
		return n;
	}
	public int subs(int a1,int a2)
	{
		int a;
		a=a1-a2;
		System.out.println("The substraction is " +a);
		return a;
	}
	public int multi(int x1,int x2)
	{
		int x;
		x=x1*x2;
		System.out.println("The multiplicatin is "+x);
		return x;
		
	}
	public int div(int d1,int d2)
	{
		int d;
		d=d1/d2;
		return d;
	}
	public static void main(String[] args) { 
		
		Bodmas ref_var=new Bodmas();
		int sumresult=ref_var.sum(10,2);
		int sumresult1=ref_var.sum(sumresult, 2);
		int substractionresult=ref_var.subs(sumresult1,2);
		int multplicationresult=ref_var.multi(substractionresult,2);
		    int Finalresult=ref_var.div(multplicationresult, 2);
		    System.out.println("The Final result is "+Finalresult);
	}
}
	
		

	



 