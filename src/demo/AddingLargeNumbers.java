package demo;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {

	
		public static void main(String[] args) throws IOException
		{
			String num1,num2;
			Scanner in = new Scanner(System.in);
				System.out.println("enter 1st number");
			num1=in.nextLine();
			System.out.println("enter 2nd number");
		num2=in.nextLine();
		BigInteger first=new BigInteger(num1);
		BigInteger second=new BigInteger(num2);
	BigInteger sum;
	sum=first.add(second);
	System.out.println("sum of num="+sum);

		
		}
	}


