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
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
	JButton deletepositionOk = new JButton("OK");
	JTextField GmailInput = new JTextField();
	JLabel Mymessage =new JLabel();
	JTextField MymessageInput = new JTextField();
	 JTextField PositionNameInput = new JTextField();
	 JLabel PositionName = new JLabel();
	 JLabel Message3 = new JLabel();
	 
	int Current_user;
	ArrayList<Applicant> Users = new ArrayList<Applicant>();
	ArrayList <Message> Messages = new ArrayList <Message>();
	 ArrayList <Company> companies = new ArrayList <Company>();
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
		
		
		companies = Serialize.Cload();
		Current_user= i;
		Users = Applicants;
		Messages = Serialize.Mload();
		infomenu.add(viewInfo);
		infomenu.add(editmenu);
		deletepositionOk.setBounds(100, 250, 100, 25);
		GmailInput.setBounds(150, 130, 250, 25);
		MymessageInput.setBounds(150, 180, 250, 25);
		Mymessage.setBounds(10, 180, 160, 25);
		PositionNameInput.setBounds(150, 130, 250, 25);
		PositionName.setBounds(10, 130, 160, 25);
		Message3.setBounds(10, -50, 400, 300);
		
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
		
		frame.add(deletepositionOk);
		frame.add(GmailInput);
		frame.add(MymessageInput);
		frame.add(Mymessage);
		deletepositionOk.addActionListener(this);
	
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
		frame.add(PositionNameInput);
		frame.add(PositionName);
		frame.add(Message3);
		deletepositionOk.setVisible(false);
		GmailInput.setVisible(false);
		Mymessage.setVisible(false);
		MymessageInput.setVisible(false);
		PositionName.setVisible(false);
		Mymessage.setVisible(false);
		PositionNameInput.setVisible(false);
		Message3.setVisible(false);
		MymessageInput.setVisible(false);
		Mymessage.setVisible(false);
		PositionNameInput.setVisible(false);
}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == viewInfo)
		{
			Message2.setVisible(true);
			changename.setVisible(false);
			textfield.setVisible(false);
			changepass.setVisible(false);
			passwordfield.setVisible(false);
			deletepositionOk.setVisible(false);
			GmailInput.setVisible(false);
			Mymessage.setVisible(false);
			MymessageInput.setVisible(false);
			PositionName.setVisible(false);
			Mymessage.setVisible(false);
			PositionNameInput.setVisible(false);
			Message3.setVisible(false);
			MymessageInput.setVisible(false);
			Mymessage.setVisible(false);
			Message2.setText("<html>Username: " + Users.get(Current_user).getName() + "<br/>Password: " + Users.get(Current_user).getPassword() + "<br/>Gmail :"+ Users.get(Current_user).getEmail() +  "<br/>Years of experience:"+ Users.get(Current_user).gettotalExperiance() +  "<br/>Set of Skills:"+ Users.get(Current_user).getSkills() +"</html>");
		}
		if(e.getSource() == editPass)
		{
			Message2.setVisible(true);
			deletepositionOk.setVisible(false);
			GmailInput.setVisible(false);
			Mymessage.setVisible(false);
			MymessageInput.setVisible(false);
			PositionName.setVisible(false);
			Mymessage.setVisible(false);
			PositionNameInput.setVisible(false);
			Message3.setVisible(false);
			MymessageInput.setVisible(false);
			Mymessage.setVisible(false);
			Message2.setText("Enter the new Password: ");
			changepass.setVisible(true);
			passwordfield.setVisible(true);
			frame.add(passwordfield);
			frame.add(changepass);
		}
		if(e.getSource() == changepass)
		{   Message2.setVisible(true);
			deletepositionOk.setVisible(false);
			deletepositionOk.setVisible(false);
			GmailInput.setVisible(false);
			Mymessage.setVisible(false);
			MymessageInput.setVisible(false);
			PositionName.setVisible(false);
			Mymessage.setVisible(false);
			PositionNameInput.setVisible(false);
			Message3.setVisible(false);
			MymessageInput.setVisible(false);
			Mymessage.setVisible(false);
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
			Message2.setVisible(true);
			deletepositionOk.setVisible(false);
			GmailInput.setVisible(false);
			Mymessage.setVisible(false);
			MymessageInput.setVisible(false);
			PositionName.setVisible(false);
			Mymessage.setVisible(false);
			PositionNameInput.setVisible(false);
			Message3.setVisible(false);
			MymessageInput.setVisible(false);
			Mymessage.setVisible(false);
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
				deletepositionOk.setVisible(false);
				GmailInput.setVisible(false);
				Mymessage.setVisible(false);
				MymessageInput.setVisible(false);
				PositionName.setVisible(false);
				Mymessage.setVisible(false);
				PositionNameInput.setVisible(false);
				Message3.setVisible(false);
				MymessageInput.setVisible(false);
				Mymessage.setVisible(false);
			Users.get(Current_user).setfName(textfield.getText());
			Message.setText("Welcome " + Users.get(Current_user).getName());
			Message2.setText("Done!");
			textfield.setText("");
			textfield.setVisible(false);
			changename.setVisible(false);
			Serialize.Save(Users);}
		}
		  
		if(e.getSource() == viewcompany) {
			/*for(int k =0 ; k< companies.size() ; k++) {
			JFrame fse=new JFrame();
			String[][] dataae = new String[companies.get(k).getpositions().size()][];
			for (int i = 0; i < companies.get(k).getpositions().size(); i++) {
				dataae[i] = new String[]{companies.get(k).getpositions().get(i).getRequirements(), companies.get(k).getpositions().get(i).getName()};
			}
			
			String[] columnNamess = { "Requirements", "Position"};
			JTable jttr=new JTable(dataae,columnNamess);    
		    jttr.setBounds(10,10,500,500);          
		    JScrollPane sp=new JScrollPane(jttr);    
		    fse.add(sp);          
		    fse.setSize(500,500);
		    fse.setVisible(true);}*/
			ArrayList<Position> Allpositions = new ArrayList<>();
			for(Company c : companies) {
				Allpositions.addAll(c.getpositions());
			}
			
			JFrame f=new JFrame(); 
			String[][] data = new String[Allpositions.size()][];
			for (int i = 0; i < Allpositions.size(); i++) {
				data[i] = new String[]{Allpositions.get(i).getRequirements(), Allpositions.get(i).getName()};
			}
			
			String[] columnNames = { "Requirements", "Position"};
			JTable jt=new JTable(data,columnNames);    
		    jt.setBounds(10,10,500,500);          
		    JScrollPane sp=new JScrollPane(jt);    
		    f.add(sp);          
		    f.setSize(500,500);    
		    f.setVisible(true);
		}
		
		if(e.getSource() == sendMesseges) {
			Message2.setVisible(false);
			deletepositionOk.setVisible(true);
			GmailInput.setVisible(false);
			Mymessage.setVisible(true);
			MymessageInput.setVisible(true);
			PositionName.setVisible(true);
			PositionNameInput.setVisible(true);
			Message3.setVisible(true);
			PositionName.setText("Company Gmail :");
			MymessageInput.setVisible(true);
			
			Mymessage.setText("Message :");
			//PositionNameInput.setText("");
			Message3.setText("TO Send A Message Please enter the Applicant Gmail: ");
			
		}
		//ArrayList<Message> Messagess = new ArrayList<>();
		
		if( e.getSource() == deletepositionOk){
			Message2.setVisible(false);
		
			ArrayList<String> CompanyMails = new ArrayList<>();
			Message v = new Message();
			v.setSender(Users.get(Current_user).getEmail());
			v.setReceiver(PositionNameInput.getText());
			v.setContent(MymessageInput.getText());
		
			for (Company c : companies)
				
			{
				CompanyMails.add(c.getEmail());
			}
			
			if(!CompanyMails.contains(PositionNameInput.getText()))
			{
				Message3.setText("company gmail cannot be found!");	
			} else {
	
			
			if(!(v.Is_Empty()))
			{
				Messages.add(v);
				Serialize.Save(Users);
				Serialize.Msave(Messages);
				Message3.setText("Done!");
			}
			else
			{
				Message3.setText("Sorry message empty!");
			}	
			Mymessage.setVisible(false);	
			MymessageInput.setVisible(false);
			PositionName.setVisible(false);
			deletepositionOk.setVisible(false);
			GmailInput.setVisible(false);
			PositionNameInput.setVisible(false);
			}
		}
		
		if(e.getSource() == viewMesseges) {
			Message2.setVisible(false);
			JFrame f=new JFrame(); 
			String[][] data = new String[Messages.size()][];
			for (int i = 0; i < Messages.size(); i++) {
				data[i] = new String[]{Messages.get(i).getReceiver(), Messages.get(i).getContent()};
			}
			
			String[] columnNames = { "To", "Message"};
			JTable jt=new JTable(data,columnNames);    
		    jt.setBounds(10,10,500,500);          
		    JScrollPane sp=new JScrollPane(jt);    
		    f.add(sp);          
		    f.setSize(500,500);    
		    f.setVisible(true);
			
		}
		
		if(e.getSource() == Signout) {
			frame.dispose();
			LoginPage loginpage = new LoginPage(Users);
		}
		
	}
}