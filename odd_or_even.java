import java.io.*;
import java.util.*;
public class odd_or_even
{
	public static void main(String args[])
	{
		int n;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the N valuse:");
				n=ob.nextInt();

				if(n%2==0)
					System.out.println("The value "+n+"  is even");
				
				else
					System.out.println("The value "+n+"  is odd");
	}
}
