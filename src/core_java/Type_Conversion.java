package core_java;

public class Type_Conversion 
{
	public static void main(String [] args) 
	{
		//Type conversion
		byte b=127;
		int a=b;
		
		System.out.println("b"+b);
		System.out.println(a);
		a=258;
		byte k=(byte)a;
		System.out.println(k);
		
		float f=5.6f;
		int t=(int)f;
		System.out.println(t);
		
		//Type promotion
		byte a1=10;
		byte b1=30;
		int c=a1*b1;
		System.out.println(c);
		
	}
}
