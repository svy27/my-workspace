package com.java.exceptionhandling;

import java.util.ArrayList;

public class TryCatch 
{

	public static void main(String[] args)
	{

		try {
	

		ArrayList num = new ArrayList<>();
		
		num.add(100);
		num.add("sathsih");
		System.out.println(num.get(0));
		System.out.println(num.get(3));
		
		}
		
		/*catch(NullPointerException n)
		{
			System.out.println("valid index is not given");
		}*/
		
		
		catch(Exception e ) 
		{
			System.out.println("give the valid index");
			
		}
		finally {
			System.out.println("all is well");
		}
		
		
			
		


	}

}
