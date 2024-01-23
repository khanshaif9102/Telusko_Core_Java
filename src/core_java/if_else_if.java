package core_java;

public class if_else_if 
{
	public static void main(String []args)
	{
		int x=20;
		int y=55;
		int z=25;
		if(x>y&&x>z)
		{
			System.out.println("x");
		}
			else if(y>x&&y>z) 
		{
			System.out.println(y);
		}
			else if(z>x&&z>y)
		{
			System.out.println(z);
		}
	}
}
