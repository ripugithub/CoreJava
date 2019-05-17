package corejava;


class Writer 
{ 
    public  static void write() 
    { 
        System.out.println("Writing..."); 
    } 
} 
class Author extends Writer 
{ 
	 public  static void write() 
	    { 
	        System.out.println("Writing book"); 
	    } 
    
} 
public class StaticMethodTest extends Author{

	 public  static void write() 
	    { 
	        System.out.println("Writing code"); 
	    } 
	 public static void main(String[] args) 
	    { 
	        Author a = new StaticMethodTest(); //since static method are not overridden so Author class version of the method is called
	        									// if Author class method is removed then Writer class method will be called.
	        a.write(); 
	    } 
}
