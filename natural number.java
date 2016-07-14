import java.io.*;
import java.util.*;
import java.lang.*;
public class natural_number
{
	public static void main(String args[])
	{
		int n,i,sum=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the N value");
				n=ob.nextInt();
				
				for(i=1;i<=n;i++)
					sum+=i;
		System.out.println("Natural number "+n+" sum is "+sum);	
	}
}
