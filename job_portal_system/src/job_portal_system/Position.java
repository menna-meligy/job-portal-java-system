package job_portal_system;

import java.io.Serializable;
import java.util.ArrayList;

public class Position implements Serializable{

	private String Name;
	private String Reuirements;
	private String companyName;
	
	//Application application ;
	//private ArrayList <Application> applications;
	Position()
	{
		this.Name = "";
		this.Reuirements = "";
		this.companyName = "";
		//application = new Application();
		//applications= new ArrayList <Application>();
	}
	
	Position(String n , String r , String c)
	{
		this.Name = n;
		this.Reuirements = r;
		this.companyName = c;
		//application= new Application();
		//applications= new ArrayList <Application>();
	} 
	/*public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}*/

	public String getName() {
		return Name;
	}
	public void setName(String na) {
		Name = na;
	}
	public String getRequirements() {
		return Reuirements;
	}
	public void setReuirements(String re) {
		Reuirements = re;
	}
	public String getcompanyName() {
		return companyName;
	}
	public void setcompanyName(String comName) {
		companyName = comName;
	}
	
	public boolean Is_Empty()
	{
		if(this.Name.equals("") ||  this.companyName.equals("") || this.Reuirements.equals(""))
		{
			return true;
		}
		else return false;
	}
/*
	public ArrayList <Application> getApplications() {
		return applications;
	}

	public void setApplications(ArrayList <Application> applications) {
		this.applications = applications;
	}*/	
}
