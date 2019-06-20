package java8Features;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	
	
	public static void main(String s[])
	{
		Stream<String> names = Stream.of("Ripu","Lokesh","Amit","Raj");
		
		//Once stream processing is done we cannot apply another stream processing on the same stream
		//Find the first occurrence of name starting with R
		//Optional<String> name = names.filter((i)->i.startsWith("R")).findFirst();
		
		//System.out.println(name.get());
		
		List<String>  namesArray = names.filter((i)->i.startsWith("R")).collect(Collectors.toList());
		namesArray.forEach(nam->System.out.println(nam));
	}

}
