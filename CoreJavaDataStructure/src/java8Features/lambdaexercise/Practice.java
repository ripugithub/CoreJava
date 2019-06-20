package java8Features.lambdaexercise;

public class Practice {
	
	public static void main(String str[])
	{
		Language lan = (language)->System.out.println(language+" programming language");
		lan.getProgrammingLanguage("Java");
		lan.getProgrammingLanguage("Python");
		lan.getProgrammingLanguage("Scala");
		
	}

	
}
interface Language{
	void getProgrammingLanguage(String s);
}