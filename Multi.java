package program;

import java.util.Scanner;

public class Multi 
{

	public static void main(String[] args)
	{
		int i,n;
		Scanner nu=new Scanner(System.in);
		System.out.println("enter the number");
		n=nu.nextInt();
		for(i=1;i<=20;i++)
		{
			System.out.println(i+"*"+n+"="+i*n);
		}
	}
	
}