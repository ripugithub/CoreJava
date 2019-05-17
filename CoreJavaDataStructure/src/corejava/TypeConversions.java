package corejava;

public class TypeConversions {
	
	public static void main(String str[])
	{
		//1.
		/*double data = 444.324; 
        int value = data; //gives error since bigger datatype cannot be converted to 
        				 //smaller type without explicit casting can be corrected by casting 
        				// (int)data;
        System.out.println(data); */
        
        //2.
        
        /*int val = 554; 
        String var = (String)val;  //line 1  cannot be casted, can be fixed by String.valueOf(val)
        String temp = "123"; 
        int data = (int)temp; //line 2  cannot be casted, can be fixed by Integer.valueOf(temp)
        System.out.println(data + var); */
		
		
		//3.
		/*byte var = 1; 
        var = (byte) var * 0; //line 1  Explicit cast required
        byte data = (byte) (var * 0); //line 2 
        System.out.println(var);
		*/
		//4.
		System.out.println((100/25.0)*Integer.parseInt("5") + 50);// if a double value is there in an 
																 //expression then double value is returned
		System.out.println((100/25.0));
        
	}

}
