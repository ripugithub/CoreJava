package corejava;

public class SwapTwoNosJava {
	public static void swap(Integer i, Integer j) {
	      Integer temp = new Integer(i);
	      i = j;
	      j = temp;
	   }
	
	public static void swap1(int i, int j) {
	      int temp = i;
	      i = j;
	      j = temp;
	   }
	
	public static void main(String[] str)
	{
		Integer i = new Integer(10);
	    Integer j = new Integer(20);
	      swap(i, j);
	      System.out.println("i = " + i + ", j = " + j);
 
        
	      int a = 10;
	      int b = 20;
		      swap(a, b);
		      System.out.println("a = " + a + ", b = " + b);
	}
}
