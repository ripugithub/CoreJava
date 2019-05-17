package corejava;

	//super can be used to refer immediate parent class instance variable.
	//super can be used to invoke immediate parent class method.
	//super() can be used to invoke immediate parent class constructor.

class Alpha 
{ 
    public String type = "a "; 
    public Alpha() {  System.out.print("alpha "); } 
} 
public class ThisSuperTest extends Alpha {

	//public String type = "c";  //Enabling this code will give a different output since super.type will refer to the supertype
	
	 public ThisSuperTest()  {  System.out.print("beta ");  } 
	void go() 
   { 
       type = "b "; 
       System.out.print(this.type + super.type); 
   } 
	public static void main(String[] args) 
    { 
        new ThisSuperTest().go(); 
    } 
}
