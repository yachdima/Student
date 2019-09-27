package data;

import exceptions.AgeOutOfRangeException;
import exceptions.ExperienceOutOfRangeException;
import exceptions.FullNameFormatException;
import helpers.Validator;

public class Administrator extends Person {
	private Integer experience;
	private Integer minEx = 5;
	private Integer maxEx = 40;
	
	public Administrator(String fullname, Float age) throws FullNameFormatException, AgeOutOfRangeException, ExperienceOutOfRangeException {
		super(fullname, age);
		if(Validator.checkExperience(experience, minEx, maxEx))
			this.experience = experience;
		else throw new ExperienceOutOfRangeException("Wrong Experience!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) throws ExperienceOutOfRangeException {
		if(Validator.checkExperience(experience, minEx, maxEx))
			this.experience = experience;
		else throw new ExperienceOutOfRangeException("Wrong Experience!");
	}

	@Override
	public String toString() {
		return "Administrator [experience=" + experience + "]";
	}

	
}
