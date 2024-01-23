package core_java;

public class for_Loop {
	public static void main(String []args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			System.out.println("HI :"+i);
		}
		
		for(int k=n;k>0;k--)
		{
			System.out.println("Hello :"+k);
		}
		System.out.println("========================");
		for(int i=0;i<=n;i++)
		{
			System.out.println("I :"+i);
			for(int j=i+1;j<n;j++) {
				System.out.println("J "+j);
			}
		}
	}
}
