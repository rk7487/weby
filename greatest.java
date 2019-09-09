import java.util.Scanner;
class greatest
{
	static int great(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if(b>a && b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
		
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter three number");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		System.out.println("you entered a ="+a+" b = "+b+" c = "+c);
		System.out.println("greatest is "+great(a,b,c));
	}
}
	