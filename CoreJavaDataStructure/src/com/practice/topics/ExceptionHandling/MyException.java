package com.practice.topics.ExceptionHandling;
class Person{
	public void talk() {}
}
public class MyException{
	
	
	public static void main(String args[]){
        Person p = null;
        try{
                p.talk();
        }
        catch(NullPointerException e){
                System.out.println("There is a NullPointerException. ");
        }
        catch(Exception e){
                System.out.print("There is an Exception. ");
        }
        
        System.out.println("Everything went fine. ");
    }

}
