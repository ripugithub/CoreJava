package corejava.collections.set;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getsId()==o2.getsId())
		{
			return 0;
		}else if(o1.getsId()>o2.getsId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
