package java8Features;

interface Area{
	double getArea(int param);
}
interface CheckNumber{
	boolean checkPrime(int num);
	
	 default String  someMethod() {		
		return "interface Method";
	}
}

public class AreaImpl{
	
	public static void main(String s[])
	{
		double pi = 3.141;
		Area area = (int r)-> pi*r*r;
		System.out.println("Area of Circle: "+area.getArea(6));
		
		CheckNumber oddOrEven = (int num)-> (num%2)==0;
		System.out.println("The number is ::" +oddOrEven.checkPrime(24));
		
		//System.out.println(CheckNumber.someMethod());
		
	}

	

}
