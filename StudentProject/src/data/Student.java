package data;

import java.security.acl.Group;

import exceptions.AgeOutOfRangeException;
import exceptions.FullNameFormatException;

public class Student extends Person {
	private Group group;
	private Float mark;
	
	public Student(String fullname, Float age, Group group, Float mark) throws FullNameFormatException, AgeOutOfRangeException {
		super(fullname, age);
		this.group = group;
		this.mark = mark;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Float getMark() {
		return mark;
	}

	public void setMark(Float mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [group=" + group + ", mark=" + mark + "]";
	}
	
	
}
