package com.practice.topics.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
//throws FileNotFoundException, IOException
	public static void main(String[] args)  {
		try{
			testException(-5);
			testException(-10);
		}catch(FileNotFoundException e){
			//e.printStackTrace();
			System.out.println("Exception thrown");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			System.out.println("Releasing resources");			
		}
		//testException(15);
	}
	
	public static void testException(int i) throws FileNotFoundException, IOException{
		if(i < 0){
			FileNotFoundException myException = new FileNotFoundException("Negative Integer "+i);
			throw myException;
		}else if(i > 10){
			throw new IOException("Only supported for index 0 to 10");
		}

	}

}
