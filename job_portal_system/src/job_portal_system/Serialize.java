package job_portal_system;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Serialize  implements Serializable{

		public static void Save(ArrayList<Applicant> applicants) {
			try {
				FileOutputStream fileOut = new FileOutputStream("Applicants.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(applicants);
				out.close();
				fileOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static ArrayList<Applicant> load() {
			ArrayList<Applicant> applicants = new ArrayList<>();
			try {
				FileInputStream fileIn = new FileInputStream("Applicants.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				applicants = (ArrayList<Applicant>) in.readObject();
				in.close();
				fileIn.close();
			} catch (IOException i) {
				i.printStackTrace();
			} catch (ClassNotFoundException a) {
				System.out.println("User class not found");
				a.printStackTrace();
			}
			return applicants;

		}

		public static void Csave(ArrayList<Company> Companies) {
			try {
				FileOutputStream fileOut1 = new FileOutputStream("companies.ser");
				ObjectOutputStream out1 = new ObjectOutputStream(fileOut1);
				out1.writeObject(Companies);
				out1.close();
				fileOut1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static ArrayList<Company> Cload() {
			ArrayList<Company> Companies = new ArrayList<>();
			try {
				FileInputStream fileIn1 = new FileInputStream("companies.ser");
				ObjectInputStream in1 = new ObjectInputStream(fileIn1);
				Companies = (ArrayList<Company>) in1.readObject();
				in1.close();
				fileIn1.close();
			} catch (IOException i) {
				i.printStackTrace();
			} catch (ClassNotFoundException a) {
				System.out.println("company class not found");
				a.printStackTrace();
			}
			return Companies;
		}
		
		/*
		public static void ASave(ArrayList<Application> applications) {
			try {
				FileOutputStream fileOut = new FileOutputStream("Applicants.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(applications);
				out.close();
				fileOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static ArrayList<Application> Aload() {
			ArrayList<Application> applications = new ArrayList<>();
			try {
				FileInputStream fileIn = new FileInputStream("Applicants.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				applications = (ArrayList<Application>) in.readObject();
				in.close();
				fileIn.close();
			} catch (IOException i) {
				i.printStackTrace();
			} catch (ClassNotFoundException a) {
				System.out.println("User class not found");
				a.printStackTrace();
			}
			return applications;

		}*/
		
		public static void Msave(ArrayList<Message> Messages) {
			try {
				FileOutputStream fileOut1 = new FileOutputStream("Messages.ser");
				ObjectOutputStream out1 = new ObjectOutputStream(fileOut1);
				out1.writeObject(Messages);
				out1.close();
				fileOut1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static ArrayList<Message> Mload() {
			ArrayList<Message> Messages = new ArrayList<>();
			try {
				FileInputStream fileIn1 = new FileInputStream("Messages.ser");
				ObjectInputStream in1 = new ObjectInputStream(fileIn1);
				Messages = (ArrayList<Message>) in1.readObject();
				in1.close();
				fileIn1.close();
			} catch (IOException i) {
				i.printStackTrace();
			} catch (ClassNotFoundException a) {
				System.out.println("Message class not found");
				a.printStackTrace();
			}
			return Messages;
		}
		
		
	}
	
	
	
	
	
	
	
	

