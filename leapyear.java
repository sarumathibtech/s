import java.io.*;
import java.util.*;
public class leap_year
{
	public static void main(String args[])
	{
		int n;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter year:");
				n=ob.nextInt();

				if(n%4==0)
				{
					if(n%100==0)
					{
						if(n%400==0)
							System.out.println("The "+n+" is leap year");
						else
							System.out.println("The "+n+" is not a leap year");
					}
					else
						System.out.println("The "+n+" is leap year");
				}
				else
					System.out.println("The "+n+"is leap year");
	}
}
