package com.foxmula.assignment3;
import java.util.*;
public class CustomException {
	void process(int n) throws InvalidException
	{
		int Flag=0;
		try
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					Flag++;
			}
			
			if(Flag==2 && n%2==1)
			{
				throw new InvalidException("Invalid Number"); 
			}
			else
			{
				System.out.println("No exception found");
			}
		}
		
		catch(InvalidException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
				
		System.out.println("Enter the  number:");
		int n=input.nextInt();	
		CustomException Exception1 = new CustomException();
		Exception1.process(n);
		input.close();
	}
	}
