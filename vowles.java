import java.io.*;
import java.util.*;
public class vowles
{
	public static void main(String args[])
	{
		String charc;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the character");
				charc=ob.nextLine();

				if(charc=="a"||charc=="e"||charc=="i"||charc=="o"||charc=="u"||charc=="A"||charc=="E"||charc=="I"||charc=="O"||charc=="U")
					System.out.println("Giving the character "+charc+" is vowle");
				
				else
					System.out.println("Giving the character "+charc+" is not a vowle");
	}
}
