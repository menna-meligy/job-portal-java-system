package job_portal_system;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Applicant implements Serializable {
	private String Name;
	private String email;
	private String Password;
	private String confirmPassword;
	private String totalExperiance;
	private String skills ; 

	
	public Applicant() {
	this.Name=" ";
	this.email=" ";
	this.Password=" ";
	this.confirmPassword=" ";
	this.totalExperiance= " ";
	this.skills = " ";

	}
	public Applicant(String fName, String lName, String Password, String confirmPassword ,  String totalExperiance , String sk ) {
		this.Name = fName;
		this.Password = Password;
		this.confirmPassword = confirmPassword;
		this.totalExperiance = totalExperiance;
		this.skills = sk;

	}

	public String getName() {
		return Name;
	}

	public void setfName(String name) {
		Name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String e) {
		email = e;
	}
	
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String pass) {
		Password = pass;
	}
	
	public String getConfirmPassword() {
		return Password;
	}

	public void settotalExperiance(String totex) {
		totalExperiance = totex;
	}
	
	public String gettotalExperiance() {
		return totalExperiance;
	}

	public void setConfirmPassword1(String confirmpass) {
		confirmPassword = confirmpass;
	}
	
	public String getSkills() {
		return skills ;
	}

	public void setSkills(String sk) {
		skills = sk;
	}

	
	
	
	
	
	
	//checking if the applicant Gmail is already registered before
	public boolean Is_exists(ArrayList<Applicant> applicants)
	{
		for(Applicant i : applicants)
		{
			if(i.getEmail().equals(this.email)/* || i.getName().equals(this.Name) || i.getPassword().equals(this.Password)*/)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	public boolean Can_Login(ArrayList<Applicant> applicants)
	{
		for(Applicant i : applicants)
		{
			if(i.getEmail().equals(this.email) && i.getPassword().equals(this.getPassword()))
			{
				return true;
			}
		}
		
		return false;
	}
	/*
	public boolean Can_login()
	{
		if(this.getPassword() == this.confirmPassword )
		{
			return true;
		}
		else return false;
	}
*/
	


	
	
	//
	

}