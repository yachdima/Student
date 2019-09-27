package data;

import java.util.ArrayList;

public class University {
	private String name;
	private Administrator director;
	private ArrayList groups;
	private ArrayList domains;
	private ArrayList teachers;
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

	public Administrator getDirector() {
		return director;
	}

	public void setDirector(Administrator director) {
		this.director = director;
	}

	public ArrayList getGroups() {
		return groups;
	}

	public void setGroups(ArrayList groups) {
		this.groups = groups;
	}

	public ArrayList getDomains() {
		return domains;
	}

	public void setDomains(ArrayList domains) {
		this.domains = domains;
	}

	public ArrayList getTeachers() {
		return teachers;
	}

	public void setTeachers(ArrayList teachers) {
		this.teachers = teachers;
	}

	public ArrayList getStudents() {
		return students;
	}

	public void setStudents(ArrayList students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", director=" + director + ", groups=" + groups + ", domains=" + domains
				+ ", teachers=" + teachers + ", students=" + students + "]";
	}
	
	
}
