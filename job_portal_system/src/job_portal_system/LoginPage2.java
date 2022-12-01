package job_portal_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
public class LoginPage2 implements ActionListener , Serializable{
		JLabel welcome = new JLabel("WELCOME TO OUR JOB PORTAL");
		JFrame frame = new JFrame();
		JButton loginbutton = new JButton("Login");
		JButton resetbutton = new JButton("Reset");
		JButton registerbutton = new JButton("Register");
		JTextField UserNameField = new JTextField();
		JPasswordField PasswordField = new JPasswordField();
		JLabel UserName = new JLabel("Username:");
		JLabel UserPassword = new JLabel("Password:");
		JLabel Message = new JLabel();
		JLabel Registerask = new JLabel("if you don't have an account yet please register here");
		JButton backbutton = new JButton("Back");
		ArrayList <Company> companies = new ArrayList <Company>();
		
		LoginPage2(ArrayList<Company> OUsers)
		{
			companies = OUsers;
			
			UserName.setBounds(50, 100, 125, 25);
			UserPassword.setBounds(50, 150, 125, 25);
			Message.setBounds(150, 400, 250, 35);
			Message.setFont(new Font(null, Font.BOLD, 25));
			UserNameField.setBounds(175, 100 , 200, 25);
			welcome.setBounds(150, -30, 500 ,200);
			PasswordField.setBounds(175, 150 , 200, 25);
			loginbutton.setBounds(140, 200, 100, 25);
			loginbutton.setFocusable(false);
			loginbutton.addActionListener(this);
			resetbutton.setBounds(250, 200, 100, 25);
			resetbutton.setFocusable(false);
			resetbutton.addActionListener(this);
			Registerask.setBounds(100, 270, 300, 25);
			registerbutton.setBounds(140, 320, 90, 25);
			registerbutton.setFocusable(false);
			registerbutton.addActionListener(this);
			
			
			backbutton.setBounds(240, 320, 90, 25);
			backbutton.setFocusable(false);
			backbutton.addActionListener(this);
			
			frame.add(welcome);
			frame.add(loginbutton);
			frame.add(resetbutton);
			frame.add(registerbutton);
			frame.add(Message);
			frame.add(UserName);
			frame.add(UserPassword);
			frame.add(UserNameField);
			frame.add(PasswordField);
			frame.add(Registerask);
			frame.add(backbutton);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500,500);
			frame.setLayout(null);
			frame.setVisible(true);
			
		}

	

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
				if(e.getSource() == resetbutton) {
					UserNameField.setText("");
					PasswordField.setText("");
					Message.setText("");
				}
				if(e.getSource() == loginbutton) {
					String username = UserNameField.getText();
					String Password = String.copyValueOf(PasswordField.getPassword());
					int i;
					for(i = 0; i < companies.size(); i++)
					{
						if(companies.get(i).getName().equals(username) && companies.get(i).getPassword().equals(Password))
						{
							Message.setText("Weclcome");
							frame.dispose();
							HomePage2 homepage = new HomePage2(i, companies);
						}
						else
						{
							PasswordField.setText("");
							Message.setText("Invalid Data");
						}
					}
					
				}
				if(e.getSource() == registerbutton) {
					frame.dispose();
					RegistrationPage2 registrationPage = new RegistrationPage2(companies);
				}
				
				
				if(e.getSource() == backbutton) {
					frame.dispose();
					FirstPage fp = new FirstPage();
				}
				
			
			
		}
	
	
	
	
}
