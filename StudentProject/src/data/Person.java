package data;

import exceptions.AgeOutOfRangeException;
import exceptions.FullNameFormatException;
import helpers.Validator;

public class Person {
	private String fullname;
	private Float age;
	private Float minAge = 18f;
	private Float maxAge = 65f;
	private Integer minCName = 5;
	private Integer maxCName = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Person(String fullname, Float age) throws FullNameFormatException,AgeOutOfRangeException {
		super();
		if(Validator.checkName(fullname, minCName, maxCName))
			this.fullname = fullname;
		else throw new FullNameFormatException("Wrong Name!");
		
		if(Validator.checkAge(age, minAge, maxAge))
			this.age = age;
		else throw new AgeOutOfRangeException("Wrong age!");
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) throws FullNameFormatException {
		if(Validator.checkName(fullname, minCName, maxCName))
				this.fullname = fullname;
		else throw new FullNameFormatException("Wrong Name!");
	}

	public Float getAge() {
		return age;
	}

	public void setAge(Float age) throws AgeOutOfRangeException {
		if(Validator.checkAge(age, minAge, maxAge))
			this.age = age;
		else throw new AgeOutOfRangeException("Wrong age!");
	}

	@Override
	public String toString() {
		return "Person [fullname=" + fullname + ", age=" + age + "]";
	}
	
	

}
