package com.java.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Throw_Throws 
{
	static int  i = 100; 

	public static void main(String[] args) throws Exception 

	
	{
		
		
		file();
		Throw_Throws obj = new Throw_Throws();
		obj.add();
		
	}

	public static void file() throws FileNotFoundException, InterruptedException
		
	{
		/*File f = new File("sathish");// wrong path
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook();*/
		Thread.sleep(500);
	}
		public void add() throws Exception 
		{
			int a = 100;
			int b = 200;
			int c= 100;
		int ad = a+b+c;
				
				System.out.println(ad);
				throw new Exception("number is not valid");
		
		
		}
		
		
		
		
	}
	
	


