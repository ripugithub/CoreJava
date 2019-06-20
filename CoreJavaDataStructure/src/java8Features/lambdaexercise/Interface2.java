package java8Features.lambdaexercise;

public interface Interface2 {

void method1(String str);
	
	default void log(String str)
	{
		System.out.println("Logging from I1:  "+str);
	}
	static void print(String str)
	{
		System.out.println("From print method I1"+str);
	}
}
