package core_java;

public class Ternary
{
	public static void main(String []args)
	{
		int n=10;
		int result=0;
		
//		if(n%2==4)
//			result=10;
//		else
//			result=20;
		// ?:
		result= n%2==0? 10 : 20;
				
		System.out.println(result);
		
	}
}
