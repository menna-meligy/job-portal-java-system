package job_portal_system;

import java.util.ArrayList;
public class Main implements Runnable {
	public static void main(String[] args) {
	    Main obj = new Main();
	    Thread thread = new Thread(obj);
	    thread.start();
	
		//System.out.println();
	//	ArrayList<Applicant> applicants = new ArrayList<Applicant>();
	//	applicants = Serialize.load();
		//Applicant app1 = new Applicant();
	//	LoginPage page = new LoginPage(applicants);
		//System.out.print(app1.getSkills());

	}

	@Override
	public void run() {
		FirstPage fp = new FirstPage();
		
	}
}