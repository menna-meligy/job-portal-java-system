package job_portal_system;

import java.io.Serializable;

public class Application implements Serializable{
   private String companyName;
   private String ApplicatName;
  
   Application( ){
	   companyName =" ";
	   ApplicatName =" ";   
   }
 Application(String companyN , String applicantN ){
	   companyName =companyN;
	   ApplicatName =applicantN;   
   }
   public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getApplicatName() {
	return ApplicatName;
}
public void setApplicatName(String applicatName) {
	ApplicatName = applicatName;
}

   
}