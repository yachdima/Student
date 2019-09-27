package data;

import java.util.ArrayList;

import exceptions.AgeOutOfRangeException;
import exceptions.ExperienceOutOfRangeException;
import exceptions.FullNameFormatException;
import helpers.Validator;

public class Teacher extends Person {
	private Integer experience;
	private ArrayList domains;
	private Integer minEx = 1;
	private Integer maxEx = 40;
	private Integer minD = 1;
	
	public Teacher(String fullname, Float age, Integer experience, ArrayList domains) throws FullNameFormatException, AgeOutOfRangeException, ExperienceOutOfRangeException {
		super(fullname, age);
		if(Validator.checkExperience(experience, minEx, maxEx))	
			this.experience = experience;
		else throw new ExperienceOutOfRangeException("Wrong Experience!");
		
		if(Validator.checkDomain(domains, minD))
			this.domains = domains;
		else throw new ExperienceOutOfRangeException("Not enough!");
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) throws ExperienceOutOfRangeException {
		if(Validator.checkExperience(experience, minEx, maxEx))	
			this.experience = experience;
		else throw new ExperienceOutOfRangeException("Wrong Experience!");
	}

	public ArrayList getDomains() {
		return domains;
	}

	public void setDomains(ArrayList domains) {
		this.domains = domains;
	}

	@Override
	public String toString() {
		return "Teacher [experience=" + experience + ", domains=" + domains + "]";
	}
	
	
}
