package helpers;

import java.util.ArrayList;

public class Validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Boolean checkAge(Float age, Float minAge, Float maxAge) {
		if(age >= minAge && age <= maxAge)
			return true;
		else 
			return false;
	}
	
	public static Boolean checkExperience(Integer experience, Integer min, Integer max) {
		if(experience >= min && experience <= max)
			return true;
		else 
			return false;
	}
	
	public static Boolean checkName(String name, Integer min, Integer max) {
		if(name.length() >= min && name.length() <= max && name.indexOf(" ") > 1 
				&& name.lastIndexOf(" ") < name.length()-2)
			return true;
		else 
			return false;
	}
	
	public static Boolean checkDomain(ArrayList domains, Integer min) {
		if (domains.size() < min)
			return true;
		else 
			return false;
	}
}
