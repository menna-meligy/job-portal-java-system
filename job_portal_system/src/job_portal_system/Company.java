package job_portal_system;

import java.io.Serializable;
import java.util.ArrayList;


public class Company implements Serializable  {

	private String Name;
	private String email;
	private String Password;
	private String confirmPassword;
	private String profile;
	private ArrayList<Position> positions ; 
	private String Requirements;
	private String Address;
	
	public Company() {
	this.Name=" ";
	this.email=" ";
	this.Password=" ";
	this.confirmPassword=" ";
	this.profile= " ";
	positions = new ArrayList<Position>();
	this.Requirements=" ";
	this.Address= " ";
	}


	public Company(String Name, String email, String Password, String confirmPassword ,  String profile ,String Requirements , String Address ) {
		this.Name = Name;
		this.email = email;
		this.Password = Password;
		this.confirmPassword = confirmPassword;
		this.profile = profile;
		positions = new ArrayList<Position>();
		this.Requirements = Requirements;
		this.Address = Address;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String e) {
		Name = e;
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

	public void setPassword(String e) {
		Password = e;
	}
	
	public String getconfirmPassword() {
		return confirmPassword;
	}

	public void setconfirmPassword(String e) {
		confirmPassword = e;
	}
	
	
	public String getProfile() {
		return profile;
	}

	public void setProfile(String e) {
		profile = e;
	}
	
	public  ArrayList<Position> getpositions() {
		return positions;
	}
	

	public void setpositions(ArrayList<Position> p) {
		 positions = p;
	}
	
	public String getRequirements() {
		return Requirements;
	}

	public void setRequirements(String e) {
		Requirements = e;
	}
	
	public String getAddress() {
		return Address;
	}

	public void setAddress(String e) {
		Address = e;
	}
	//functions 
	
	public boolean Is_exists(ArrayList<Company> companies)
	{
		for(Company i : companies)
		{
			if(i.getEmail().equals(this.email) || i.getName().equals(this.Name) || i.getPassword().equals(this.Password))
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	public boolean Can_Login(ArrayList<Company> companies)
	{
		for(Company i : companies)
		{
			if(i.getEmail().equals(this.email) && i.getPassword().equals(this.getPassword()))
			{
				return true;
			}
		}
		
		return false;
	}

/*

	public boolean Position_Is_Exits(ArrayList<Position> positions) {
		// TODO Auto-generated method stub
		for(Position i : positions)
		{
			if(i.getName().equals(HomePage2.PositionNameInput.getText()))
			{
				return true;
			}
		}
		
		return false;
	}*/

	

/*	public void AddPosition(ArrayList<Company> companies)
	{ 
		Position P = new Position();
		for(Company i : companies)
		{
		i.positions.add(P);
		}
		
	}*/



	/*
	public void RemovePosition(ArrayList<Company> companies)
	{
		for(Company i : companies)
		{
			if (i.getName().equals(HomePage2.CompanyName.getText()))
					{
				for (Position j : positions)
			if(j.getName().equals(HomePage2.PositionNameInput.getText()))
			{
				positions.remove(j);
			}
			
					}
		}
	}*/
	/*
	public static ArrayList<Position> viewPositions(ArrayList<Company> companies) {
		
		for (Company e : companies)
		{
			positions.addAll(e.getPositions());
		}
		return positions;
		
	}*/	



	
	
}
