package com.practice.topics.comparablecomparator;


public class Author implements Comparable<Author>{
	
	String firstname;
	String lastname;
	String bookname;
	
	public Author(String fname, String lname, String bookname) {
		this.firstname = fname;
		this.lastname = lname;
		this.bookname = bookname; 
	}

	@Override
	public int compareTo(Author o) {
		
		
		int last  = this.lastname.compareTo(o.lastname);
		
		return last==0?this.firstname.compareTo(o.firstname):last;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookname == null) ? 0 : bookname.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (bookname == null) {
			if (other.bookname != null)
				return false;
		} else if (!bookname.equals(other.bookname))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	

	
	
	

}
