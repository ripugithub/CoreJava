package com.practice.topics.ExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionExercise1 {

	
	public static void main(String s[])
	{
		try {
		ExceptionExercise1 exc = new ExceptionExercise1();
		exc.fileBlowUp();
		System.out.println("Some exception Occured");
		exc.databaseBlowUp();
		System.out.println("a");
		}catch(SQLException | IOException e)// Order of the declared exception does not matter
		{
		System.out.println("b");	
		}catch(Exception e)
		//}finally
		{
			System.out.println("c");
		}
		
	}
	
	void databaseBlowUp() throws IOException, SQLException
	{
		throw new SQLException();
	}
	
	void fileBlowUp() throws IOException
	{
		throw new IOException();
	}
	
}
