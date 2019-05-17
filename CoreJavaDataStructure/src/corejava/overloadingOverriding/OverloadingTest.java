package corejava.overloadingOverriding;

public class OverloadingTest {
	
	public int getData() //getdata() 1 //Changing the return type is not enough to achieve 
						//method overloading argument list must be changed to overload a method
    { 
        return 0; 
    } 
    public long getData() //getdata 2 
    { 
        return 1; 
    } 
    
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        System.out.println(obj.getData());     
    } 

}
