package job_portal_system;

import java.util.ArrayList;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class HomePage implements ActionListener , Serializable{
	final int message_price = 5;
	JFrame frame = new JFrame();
	JLabel Message = new JLabel();
	JLabel Message2 = new JLabel();
	JTextField textfield = new JTextField();
	JTextField textfield2 = new JTextField();
	JButton changepass = new JButton("OK");
	JButton changename = new JButton("OK");
	JButton addmessage = new JButton("OK");
	JButton addcredit = new JButton("OK");
	JButton addtans = new JButton("OK");
	JPasswordField passwordfield = new JPasswordField();
	JMenuBar menuBar = new JMenuBar();
	JMenu infomenu = new JMenu("Your info");
	JMenu editmenu = new JMenu("Edit");
	JMenu messagemenu = new JMenu("Companies");
	JMenu creditsmenu = new JMenu("Applications");
	JMenu Exit = new JMenu("Sign out");
	int Current_user;
	ArrayList<Applicant> Users = new ArrayList<Applicant>();
	
	
	JMenuItem viewInfo = new JMenuItem("View your info");
	
	JMenuItem editPass = new JMenuItem("Edit your password");
	JMenuItem editUser = new JMenuItem("Edit your Name");
	
	JMenuItem viewcompany = new JMenuItem("View companies positions");
	//JMenuItem viewApplication = new JMenuItem("View sent applications");
	//JMenuItem newApplication = new JMenuItem("New application");
	
	JMenuItem viewMesseges = new JMenuItem("View sent messeges");
	JMenuItem sendMesseges = new JMenuItem("send messege");
	
	JMenuItem Signout = new JMenuItem("Sign out");
	
	
	
	HomePage(int i, ArrayList<Applicant> Applicants){
		
		
		Current_user= i;
		Users = Applicants;
		infomenu.add(viewInfo);
		infomenu.add(editmenu);
		
		passwordfield.setBounds(250, 105, 125, 25);
		textfield.setBounds(250, 105, 125, 25);
		textfield2.setBounds(250, 80, 125, 25);
		
		changepass.setBounds(20, 135, 100, 25);
		changepass.setFocusable(false);
		//changepass.addActionListener(this);
		
		addcredit.setBounds(20, 135, 100, 25);
		addcredit.setFocusable(false);
		//addcredit.addActionListener(this);
		
		changename.setBounds(20, 135, 100, 25);
		changename.setFocusable(false);
		//changename.addActionListener(this);
		
		addmessage.setBounds(20, 135, 100, 25);
		addmessage.setFocusable(false);
		//addmessage.addActionListener(this);
		
		addtans.setBounds(20, 135, 100, 25);
		addtans.setFocusable(false);
		//addtans.addActionListener(this);
		
		editmenu.add(editPass);
		editmenu.add(editUser);
		
		messagemenu.add(viewcompany);
		//messagemenu.add(viewApplication);
		//messagemenu.add(newApplication);
		
		creditsmenu.add(viewMesseges);
		creditsmenu.add(sendMesseges);
		
		Exit.add(Signout);
		
		menuBar.add(infomenu);
		menuBar.add(messagemenu);
		menuBar.add(creditsmenu);
		menuBar.add(Exit);
		
		viewInfo.addActionListener(this);
		editPass.addActionListener(this);
		editUser.addActionListener(this);
		viewcompany.addActionListener(this);
		//viewApplication.addActionListener(this);
		//newApplication.addActionListener(this);
		viewMesseges.addActionListener(this);
		sendMesseges.addActionListener(this);
		Signout.addActionListener(this);
		changepass.addActionListener(this);
		changename.addActionListener(this);
		
		frame.setJMenuBar(menuBar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		Message.setText("Welcome " + Users.get(i).getName());
		Message.setBounds(10, 10, 250, 20);
		Message.setFont(new Font(null, Font.ITALIC, 16));
		Message2.setBounds(10, 60, 250, 100);
		Message2.setFont(new Font(null, Font.PLAIN, 16));
		frame.add(Message);
		frame.add(Message2);
}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == viewInfo)
		{
			Message2.setText("<html>Username: " + Users.get(Current_user).getName() + "<br/>Password: " + Users.get(Current_user).getPassword() + "<br/>Gmail :"+ Users.get(Current_user).getEmail() +  "<br/>Years of experience:"+ Users.get(Current_user).gettotalExperiance() +  "<br/>Set of Skills:"+ Users.get(Current_user).getSkills() +"</html>");
		}
		if(e.getSource() == editPass)
		{
			Message2.setText("Enter the new Password: ");
			changepass.setVisible(true);
			passwordfield.setVisible(true);
			frame.add(passwordfield);
			frame.add(changepass);
		}
		if(e.getSource() == changepass)
		{
			Users.get(Current_user).setPassword(String.valueOf(passwordfield.getPassword()));
			if(String.valueOf(((JPasswordField) passwordfield).getPassword()).isEmpty()) {
				Message2.setText("Password cannot be empty");
			}else {
			Message2.setText("Done!");
			passwordfield.setText("");
			passwordfield.setVisible(false);
			changepass.setVisible(false);
			Serialize.Save(Users);}
		}
		if(e.getSource() == editUser)
		{
			Message2.setText("Enter the new Name: ");
			changename.setVisible(true);
			textfield.setVisible(true);
			frame.add(textfield);
			frame.add(changename);
		}
		if(e.getSource() == changename)
		{
			if(textfield.getText().isEmpty()) {
				Message2.setText("Username cannot be empty");
			}else {
			Users.get(Current_user).setfName(textfield.getText());
			Message.setText("Welcome " + Users.get(Current_user).getName());
			Message2.setText("Done!");
			textfield.setText("");
			textfield.setVisible(false);
			changename.setVisible(false);
			Serialize.Save(Users);}
		}
		
		if(e.getSource() == Signout) {
			frame.dispose();
			LoginPage loginpage = new LoginPage(Users);
		}
		
	}
}