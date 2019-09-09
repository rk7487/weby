import java.util.Scanner;
class fibo
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number");
		int n = in.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<n;i++)
		{
			if(i<=1)
			{
			c=i;
			}
			else
			{
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println("\t"+c);
			
		}
	}
}
		