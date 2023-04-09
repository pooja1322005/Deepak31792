package Package1;

public class Solution2 
{
	int a,b,c,d,e;
	public void method(int a1,int a2,int a3,int a4,int a5)
	{
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;
	}
	public static void main(String[] args)
	{
		Solution2 obj=new Solution2();
		obj.method(12, 222, 113, 1114, 1115);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
		
	}
	

}
