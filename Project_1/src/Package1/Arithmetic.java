package Package1;

public class Arithmetic {
	
 public int add(int a,int b)
 {
	 int c;
	 c=a+b;
	 System.out.println("The addition is "+c);
	return c;
 }
public int subs(int l, int m)
{
	int n;
	n=l-m;
	System.out.println("The substraction is  "+ n);
	return n;
	}

public void multi(int x,int y)
{
	int z;
	z=x*y;
	 System.out.println("The FINAL RESULT (10+2)(10-2) IS "+z);

}
public static void main(String[] args) {
	
	Arithmetic abc = new Arithmetic();
	int sumresult=abc.add(10, 2);
	int substractionresult =abc.subs(10, 2);
    abc.multi(sumresult,substractionresult);
   
	
}
}
