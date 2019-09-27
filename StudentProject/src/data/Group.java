package data;

import java.util.ArrayList;

public class Group {
	private String name;
	private Integer year;
	private ArrayList students;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public ArrayList getStudents() {
		return students;
	}

	public void setStudents(ArrayList students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Group [name=" + name + ", year=" + year + ", students=" + students + "]";
	}
	
	

}
