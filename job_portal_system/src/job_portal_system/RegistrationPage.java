package job_portal_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
public class RegistrationPage implements ActionListener , Serializable {
	JLabel welcome = new JLabel("WELCOME TO OUR JOB PORTAL");
	JFrame frame = new JFrame();
	JButton backbutton = new JButton("Back");
	JButton registerButton = new JButton("Register");
	//JButton cancelButton = new JButton("Cancel");
	JButton resetButton = new JButton("Reset");
	JTextField firstnameinput = new JTextField();
	JPasswordField pass = new JPasswordField();
	JTextField gmailinput = new JTextField();
	JPasswordField confirmpasswordinput = new JPasswordField();
	JTextField skillsinput = new JTextField();
	JLabel Skill = new JLabel("skills:");
	JLabel totalexperiance = new JLabel("Years of Experience:");
	JTextField totalexperianceinput = new JTextField();
	JLabel Name = new JLabel("Name:");
	JLabel UserPassword = new JLabel("Password:");
	JLabel Gmail = new JLabel("Gmail:");
	JLabel confirmpass = new JLabel("confirmPassword:");
	JLabel Message = new JLabel();
	ArrayList <Applicant>  applicants = new ArrayList <Applicant>();
	
	RegistrationPage(ArrayList<Applicant> OUsers){
		
		 

		backbutton.setBounds(325, 400, 100, 25);
		backbutton.setFocusable(false);
		backbutton.addActionListener(this); 
		
		applicants = OUsers;
		Name.setBounds(50, 100, 125, 25);
		UserPassword.setBounds(50, 200, 125, 25);
		Gmail.setBounds(50, 150, 125, 25);
		confirmpass.setBounds(50, 250, 125, 25);
		Message.setBounds(120, 400, 300, 100);
		Message.setFont(new Font(null, Font.BOLD, 10));
		firstnameinput.setBounds(175, 100 , 200, 25);
		welcome.setBounds(140 , 20 , 200 , 100);
		gmailinput.setBounds(175, 150 , 200, 25);
		confirmpasswordinput.setBounds(175, 250, 200, 25);
		pass.setBounds(175, 200 , 200, 25);
		//emailinput.setBounds(175, 200 , 200, 25);
		skillsinput.setBounds(175, 300 , 200, 25);
		Skill.setBounds(50, 300 , 200, 25);
		totalexperiance.setBounds(50, 350 , 200, 25);
		totalexperianceinput.setBounds(175, 350 , 200, 25);
		registerButton.setBounds(125, 400, 100, 25);
		registerButton.setFocusable(false);
		registerButton.addActionListener(this);
		//cancelButton.setBounds(325, 250, 100, 25);
		//cancelButton.setFocusable(false);
		//cancelButton.addActionListener(this);
		resetButton.setBounds(225, 400, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		frame.add(backbutton);
		backbutton.setVisible(true);
		frame.add(registerButton);
		frame.add(resetButton);
		frame.add(Gmail);
		frame.add(UserPassword);
		frame.add(Name);
		frame.add(Message);
		frame.add(pass);
		frame.add(gmailinput);
		frame.add(confirmpasswordinput);
		//frame.add(emailinput);
		frame.add(firstnameinput);
		frame.add(skillsinput);
		frame.add(confirmpass);
		frame.add(welcome);
		frame.add(totalexperianceinput);
		frame.add(Skill);
		frame.add(totalexperiance);
		//frame.add(cancelButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == registerButton)
		{ 
			//checks if the username expists before
			boolean unvalid = false;
			Applicant applicant = new Applicant();
			applicant.setfName(firstnameinput.getText());
			applicant.setPassword(String.valueOf(((JPasswordField) pass).getPassword()));
			applicant.setEmail(gmailinput.getText());
				if (applicant.Is_exists(applicants)) {
					unvalid = true;
					Message.setText("Username Exists");
				}
			if(gmailinput.getText().isEmpty() || firstnameinput.getText().isEmpty() || String.valueOf(((JPasswordField) pass).getPassword()).isEmpty())
			{
				Message.setText("Invalid data , please fill in the empty fields");
				unvalid = true;
			}
			applicant.setfName(firstnameinput.getText());
			applicant.setPassword(String.valueOf(pass.getPassword()));
			applicant.setEmail(gmailinput.getText());
			applicant.setSkills(skillsinput.getText());
			applicant.settotalExperiance(totalexperianceinput.getText());
			applicant.setConfirmPassword1(String.valueOf(confirmpasswordinput.getPassword()));
			if(unvalid == false) {
				applicants.add(applicant);
				Serialize.Save(applicants);
				JOptionPane pane = new JOptionPane();
				pane.setMessage("Successfully Registered");
				JDialog d = pane.createDialog((frame), "Message");
				d.setLocation(200, 200);
				d.setVisible(true);
				frame.dispose();
				LoginPage loginpage = new LoginPage(applicants);
			}
			//Message.setText(Users.get(6).getName());
		}
		/*if(e.getSource() == cancelButton)
		{
			frame.dispose();
			LoginPage loginpage = new LoginPage(Users);
		}*/
		if(e.getSource() == resetButton) {
			firstnameinput.setText("");
			gmailinput.setText("");
			pass.setText("");
			confirmpasswordinput.setText("");
			skillsinput.setText("");
			totalexperianceinput.setText("");
			
		}
		
		if(e.getSource() == backbutton) {
			frame.dispose();
			FirstPage fp = new FirstPage();
		}
	
}





}
	
