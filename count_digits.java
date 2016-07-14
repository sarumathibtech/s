import java.io.*;
import java.util.*;
import java.lang.*;
public class count_digits
{
	public static void main(String args[])
	{
		int n,num,count=0,rem;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number");
				n=ob.nextInt();
				num=n;
				if(n==0)
					System.out.println("Number of digits in "+num+" is 1");
				else
				{
					while(n>0)
					{
						rem=n%10;
						n=n/10;
						count++;
					}
				}
		System.out.println("Number of digits in "+num+" is "+count);	
	}
}
