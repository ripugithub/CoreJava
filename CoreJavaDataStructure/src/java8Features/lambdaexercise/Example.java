package java8Features.lambdaexercise;


interface MyInterface{
	default void newMethod() {
		System.out.println("Newly added default Method");
	}
	static void anotherNewMethod() {
		System.out.println("Newly added static method");
	}
	void existingMethod(String str);
		
	
}
public class Example implements MyInterface{

	@Override
	public void existingMethod(String str) {
		System.out.println("Passed String is:"+str);
		
	}
	public static void main(String s[]) {
	
		Example obj = new Example();
		obj.newMethod();
		MyInterface.anotherNewMethod();
		obj.existingMethod("Java-8");
	}

}
