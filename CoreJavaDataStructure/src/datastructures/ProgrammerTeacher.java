package datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Programmer {
	Collection<String> list = new ArrayList<>();
	public Collection<String> getLanguages() {
		return list;
	} 
	public  void addLanguage(String string) {
		list.add(string);
	}
	}
public class ProgrammerTeacher extends Programmer{

	public static void main(String[] args) {
      ProgrammerTeacher teacher = new ProgrammerTeacher();
      teacher.addLanguage("Java");
      Programmer programmer = new Programmer();
      teacher.teach(programmer, "Java");

      for(String language : programmer.getLanguages())
          System.out.println(language);
    }

	private boolean teach(Programmer programmer, String string) {
		boolean flag = false;
		Collection<String> languages = programmer.getLanguages();
		
		if(programmer.getLanguages().contains(string))
		{
			flag = true;
		}
		return flag;
	}

	
}
