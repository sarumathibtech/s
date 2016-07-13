import java.io.*;
import java.util.*;
public class singed_or_not
{
	public static void main(String args[])
	{
		int n;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the N valuse:");
				n=ob.nextInt();

				if(n==0)
					System.out.println("The value is Zero");
				else if(n>0)
					System.out.println("The value is Postive");
				else
					System.out.println("The value is negative");
	}
}
