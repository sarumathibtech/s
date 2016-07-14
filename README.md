import java.io.*;
import java.util.*;
import java.lang.*;
public class character
{
	public static void main(String args[])
	{
		char c;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the character");
				c=ob.next().charAt(0);
				
				if(Character.isLetter(c))
					System.out.println("Giving the character "+c+" is character");
				else if(Character.isDigit(c))
					System.out.println("Giving the character "+c+" is digit");
				else
					System.out.println("Giving the character "+c+" is symbol");
	}
}
