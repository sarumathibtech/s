import java.io.*;
import java.util.*;
public class greatest_number
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the A,B,C valuses:");
				a=ob.nextInt();
				b=ob.nextInt();
				c=ob.nextInt();

				if(a>b && a>c)
					System.out.println("The value "+a+"  is greatest");
				
				else if(b>c)
					System.out.println("The value "+b+"  is greatest");
				else 
					System.out.println("The value "+c+"  is greatest");
					
	}
}
