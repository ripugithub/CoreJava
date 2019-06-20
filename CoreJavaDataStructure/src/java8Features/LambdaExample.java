package java8Features;

interface MyLambda{
	 int add(int a, int b);
}
interface MyLambda1{
	void sayHello();
}
public class LambdaExample {

	public static void main(String s[])
	{
		MyLambda sum = (int a, int b)->a+b;
		System.out.println("Sum is: "+sum.add(20, 50));
		 
		 MyLambda1 sayHello = new MyLambda1() {
			 @Override
			 public void sayHello() {
				 System.out.println("Say Hello from Anonymous clas");
			 }
		 };
		 sayHello.sayHello();
		 MyLambda1 lambda = ()->System.out.println("Say Hello from Lambda");
		 lambda.sayHello();
	}
	

}
