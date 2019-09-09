import java.util.Scanner;
class array{
	public static void main(String[] args)
	{
		int arr1[]= new int[20];
		int arr2[]= new int[20];
		int arr3[]= new int[20];
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = in.nextInt();
		System.out.println("Enter array 1");
		for(int i=0;i<n;i++)
		{
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter array 2");
		for(int i=0;i<n;i++)
		{
			arr2[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		System.out.println("Resultant array is");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr3[i]);
		}
	}
}
		
		