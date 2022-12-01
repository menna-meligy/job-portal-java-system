package job_portal_system;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

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

public class HomePage2 implements ActionListener , Serializable {
	JFrame frame = new JFrame();
	JLabel Message = new JLabel();
	JLabel Message2 = new JLabel();
	JLabel Message3 = new JLabel();
	JTextField textfield = new JTextField();
	JTextField textfield2 = new JTextField();
	JButton changepass = new JButton("OK");
	JButton addpositionOk = new JButton("OK");
	JButton deletepositionOk = new JButton("OK");
	JButton sendMessageOk = new JButton("OK");
	/*positions */
	JTextField GmailInput = new JTextField();
	 JTextField PositionNameInput = new JTextField();
	 JLabel PositionName = new JLabel();
	JTextField PositionRequirements = new JTextField();
	 JTextField CompanyName= new JTextField();
	
	
	JLabel PositionReq = new JLabel();
	JLabel CompanyN= new JLabel();
	
	JLabel Mymessage =new JLabel();
	JTextField MymessageInput = new JTextField();
	/*     */
	
	JButton changename = new JButton("OK");
	JButton addmessage = new JButton("OK");
	JButton addcredit = new JButton("OK");
	JButton addtans = new JButton("OK");
	JPasswordField passwordfield = new JPasswordField();
	JMenuBar menuBar = new JMenuBar();
	JMenu infomenu = new JMenu("Your info");
	JMenu editmenu = new JMenu("Edit");
	JMenu positionmenu = new JMenu("Positions");
	//JMenu Applicants = new JMenu("Applicants");
	JMenu Messages = new JMenu("Messages");
	JMenu Exit = new JMenu("Sign out");
	int Current_user;
	ArrayList<Company> Users = new ArrayList<Company>();
	ArrayList<Message> Messagess = new ArrayList<>();
	ArrayList<Applicant> applicants = new ArrayList<Applicant>();
	
	JMenuItem viewInfo = new JMenuItem("View your info");
	
	JMenuItem editPass = new JMenuItem("Edit your password");
	JMenuItem editUser = new JMenuItem("Edit your Name");
	
	JMenuItem addPostition = new JMenuItem("Add Postition");
	JMenuItem removePosition = new JMenuItem("Remove postition");
	JMenuItem editPostition = new JMenuItem("View Positions");
	
	JMenuItem viewMesseges = new JMenuItem("View sent messeges");
	JMenuItem sendMesseges = new JMenuItem("send messege");
	
//	JMenuItem viewApplicants = new JMenuItem("View Applicants");
	
	JMenuItem Signout = new JMenuItem("Sign out");
	
	
	
	HomePage2(int i, ArrayList<Company> Companies ){
		
		
		Current_user= i;
		Users = Companies;
		Messagess = Serialize.Mload();
		applicants = Serialize.load();
		//PUsers = positions;
		infomenu.add(viewInfo);
		infomenu.add(editmenu);
		
		passwordfield.setBounds(250, 105, 125, 25);
		textfield.setBounds(250, 105, 125, 25);
		textfield2.setBounds(250, 80, 125, 25);
		
		PositionNameInput.setBounds(150, 130, 250, 25);
		
		GmailInput.setBounds(150, 130, 250, 25);
		PositionRequirements.setBounds(150, 180, 250, 25);
		PositionName.setBounds(10, 130, 160, 25);
		CompanyName.setBounds(150, 230, 250, 25);
		MymessageInput.setBounds(150, 180, 250, 25);
		
		
		PositionReq.setBounds(10, 180, 160, 25);
		CompanyN.setBounds(10, 230, 250, 25);
		Mymessage.setBounds(10, 180, 160, 25);
		
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
		
		addpositionOk.setBounds(100, 270, 100, 25);
		addmessage.setFocusable(false);
		deletepositionOk.setBounds(100, 250, 100, 25);
		sendMessageOk.setBounds(100, 250, 100, 25);
		
		addtans.setBounds(20, 135, 100, 25);
		addtans.setFocusable(false);
		//addtans.addActionListener(this);
		
		editmenu.add(editPass);
		editmenu.add(editUser);
		
		positionmenu.add(addPostition);
		positionmenu.add(removePosition);
		positionmenu.add(editPostition);
		
		
	//	Applicants.add(viewApplicants);
		
		Messages.add(viewMesseges);
		Messages.add(sendMesseges);
		
		Exit.add(Signout);
		
		menuBar.add(infomenu);
		menuBar.add(positionmenu);
		//menuBar.add(Applicants);
		menuBar.add(Messages);
		menuBar.add(Exit);
	
		
		viewInfo.addActionListener(this);
		editPass.addActionListener(this);
		editUser.addActionListener(this);
		addPostition.addActionListener(this);
		removePosition.addActionListener(this);
		editPostition.addActionListener(this);
		Messages.addActionListener(this);
		viewMesseges.addActionListener(this);
		sendMesseges.addActionListener(this);
		Signout.addActionListener(this);
		changepass.addActionListener(this);
		changename.addActionListener(this);
		
		addpositionOk.addActionListener(this);
		deletepositionOk.addActionListener(this);
		sendMessageOk.addActionListener(this);
		frame.setJMenuBar(menuBar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		Message.setText("Welcome " + Users.get(i).getName());
		Message.setBounds(10, 10, 250, 20);
		Message.setFont(new Font(null, Font.ITALIC, 16));
		Message2.setBounds(10, -35, 400, 300);
		Message3.setBounds(10, -50, 400, 300);
		/**/
	
		
		//////////////
		Message2.setFont(new Font(null, Font.PLAIN, 14));
		frame.add(Message);
		frame.add(Message2);
		frame.add(Message3);
		frame.add(addpositionOk);
		frame.add(Mymessage);
		frame.add(MymessageInput);
		frame.add(GmailInput);
		frame.add(sendMessageOk);
		sendMessageOk.setVisible(false);
		Mymessage.setVisible(false);
		MymessageInput.setVisible(false);
		addpositionOk.setVisible(false);
		GmailInput.setVisible(false);
		
		frame.add(PositionNameInput);
		frame.add(deletepositionOk);
		deletepositionOk.setVisible(false);
		frame.add(PositionName);
		frame.add(deletepositionOk);
		PositionNameInput.setVisible(false);
		
}
   
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		if(e.getSource() == viewInfo)
		{   CompanyN.setVisible(false);
		    CompanyName.setVisible(false);
			GmailInput.setVisible(false);
			PositionName.setVisible(false);
			Message3.setVisible(false);
			Message2.setVisible(true);
			textfield.setVisible(false);
			changename.setVisible(false);
			passwordfield.setVisible(false);
			changepass.setVisible(false);
			PositionNameInput.setVisible(false);
			addpositionOk.setVisible(false);
			deletepositionOk.setVisible(false);
			PositionRequirements.setVisible(false);
			PositionReq.setVisible(false);
			PositionRequirements.setVisible(false);
			Message2.setText("<html>Username: " + Users.get(Current_user).getName() + "<br/>Password: " + Users.get(Current_user).getPassword() + "<br/>Gmail :"+ Users.get(Current_user).getEmail() +  "<br/>Profile:"+ Users.get(Current_user).getProfile() + Users.get(Current_user).getRequirements() + "<br/>Address:"+ Users.get(Current_user).getAddress() +"</html>");
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
			Serialize.Csave(Users);
			}
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
			Users.get(Current_user).setName(textfield.getText());
			Message.setText("Welcome " + Users.get(Current_user).getName());
			Message2.setText("Done!");
			textfield.setText("");
			textfield.setVisible(false);
			changename.setVisible(false);
			Serialize.Csave(Users);
			}
		}
		
		
		if(e.getSource() == addPostition)
		{   
			Mymessage.setVisible(false);
			MymessageInput.setVisible(false);
			deletepositionOk.setVisible(false);
			Message.setVisible(false);
			Message2.setVisible(false);
			Message3.setVisible(true);
			addpositionOk.setVisible(true);
			PositionName.setVisible(true);
			PositionNameInput.setVisible(true);
			PositionReq.setVisible(true);
			PositionRequirements.setVisible(true);
			CompanyN.setVisible(true);
			CompanyName.setVisible(true);
			Message3.setText("TO ADD A NEW POSITION PLEASE FILL IN THE DATA CAREFULLY: ");
			frame.add(PositionName);
			frame.add(PositionNameInput);
			
			frame.add(PositionReq);
			frame.add(PositionRequirements);
			
			frame.add(CompanyName);
			frame.add(CompanyN);
			
			frame.add(addpositionOk);
			
		PositionName.setText("Position Name: ");
		PositionReq.setText("requirements : ");
		CompanyN.setText("company Name: ");
		}
		
		/////////////////////////////////////
		if(e.getSource() == addpositionOk)
		{
			
			if(PositionNameInput.getText().isEmpty()) {
			Message3.setText("position cannot be empty");
			}
		/*	else if (Users.get(Current_user).Position_Is_Exits(positions)){
				 Message3.setText("position is already existed");
			}*/
			else {
			Position P = new Position();
			P.setName(PositionNameInput.getText());
			P.setReuirements(PositionRequirements.getText());
			//	Users.get(Current_user).AddPosition(Users);
			/*ArrayList<Position> ps = new ArrayList<Position>();
			ps.addAll(Users.get(Current_user).getpositions());
			ps.add(P);
			Users.get(Current_user).setpositions(ps);*/
			
			Users.get(Current_user).AddPosition(P);
			//System.out.println(Users.get(Current_user).getpositions().toString());
			
			//Users.get(Current_user).set(textfield.getText());
			//Message.setText("Welcome " + Users.get(Current_user).getName());
			Message3.setVisible(false);
			PositionName.setText("Done!");
			PositionNameInput.setText("");
			PositionNameInput.setVisible(false);
			addpositionOk.setVisible(false);
			PositionReq.setVisible(false);
			PositionRequirements.setVisible(false);
			addpositionOk.setVisible(false);
			CompanyName.setVisible(false);
			CompanyN.setVisible(false);
			Serialize.Csave(Users);
			
			}
		}
		/////////////////////////////////////////////
		if(e.getSource() == removePosition)
		{   
			addpositionOk.setVisible(false);
			Mymessage.setVisible(false);
			MymessageInput.setVisible(false);
			//Users.get(Current_user).RemovePosition(positions);
			CompanyN.setVisible(false);
			CompanyName.setVisible(false);
			PositionName.setVisible(true);
			PositionName.setText("Position Name:");
			PositionNameInput.setText("");
			PositionNameInput.setVisible(true);
			PositionReq.setVisible(false);
			PositionRequirements.setVisible(false);
			Message.setVisible(false);
			Message2.setVisible(false);
			addpositionOk.setVisible(false);
			Message3.setVisible(true);
			deletepositionOk.setVisible(true);
			Message3.setText("TO REMOVE A POSITION PLEASE ENTER THE POSITION : ");
		}
		
		if(e.getSource() == deletepositionOk) {
			Position Rp = new Position();
			Rp.setName(PositionNameInput.getText());
			Users.get(Current_user).RemovePosition(Rp);
			Message3.setText("position specified deleted successfully");
			//System.out.println(Users.get(Current_user).getpositions().toString());
		}
		
		
		
		if (e.getSource() == editPostition) {
			JFrame fs=new JFrame();
			String[][] dataa = new String[Users.get(Current_user).getpositions().size()][];
			for (int i = 0; i < Users.get(Current_user).getpositions().size(); i++) {
				dataa[i] = new String[]{Users.get(Current_user).getpositions().get(i).getRequirements(), Users.get(Current_user).getpositions().get(i).getName()};
			}
			
			String[] columnNamess = { "Requirements", "Position"};
			JTable jtt=new JTable(dataa,columnNamess);    
		    jtt.setBounds(10,10,500,500);          
		    JScrollPane sp=new JScrollPane(jtt);    
		    fs.add(sp);          
		    fs.setSize(500,500);    
		    fs.setVisible(true);
		}
		
		/////////////////////////////////////////
		ArrayList<Position> positions = new ArrayList<Position>();

		
		if(e.getSource() ==sendMesseges) {
			sendMessageOk.setVisible(true);
			addpositionOk.setVisible(false);
			deletepositionOk.setVisible(true);
			GmailInput.setVisible(true);
			Mymessage.setVisible(true);
			MymessageInput.setVisible(true);
			CompanyN.setVisible(false);
			CompanyName.setVisible(false);
			PositionName.setVisible(true);
			PositionName.setText("Applicant Gmail :");
			MymessageInput.setVisible(true);
			Mymessage.setText("Message :");
			//PositionNameInput.setText("");
			PositionNameInput.setVisible(false);
			PositionReq.setVisible(false);
			PositionRequirements.setVisible(false);
			Message.setVisible(false);
			Message2.setVisible(false);
			addpositionOk.setVisible(false);
			Message3.setVisible(true);
			Message3.setText("TO Send A Message Please enter the Applicant Gmail: ");
			MymessageInput.setVisible(true);
			Mymessage.setVisible(true);
			
		}
		//ArrayList<Applicant> applicants = new ArrayList<>();
	
		if(e.getSource() ==sendMessageOk) {
			ArrayList<String> ApplicantEmails = new ArrayList<>();
			Message m = new Message();
			m.setSender(Users.get(Current_user).getEmail());
			m.setReceiver(GmailInput.getText());
			m.setContent(MymessageInput.getText());
			

			for (Applicant a : applicants)
				
			{
				ApplicantEmails.add(a.getEmail());
			}
			
			if(!ApplicantEmails.contains(GmailInput.getText()))
			{
				Message3.setText("applicant gmail cannot be found!");	
			} else {
			if(!(m.Is_Empty()))
			{
				Messagess.add(m);
				Serialize.Csave(Users);
				Serialize.Msave(Messagess);
				Message3.setText("Done!");
				sendMessageOk.setVisible(false);
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
			sendMessageOk.setVisible(false);
			
			}
		}
		
		if(e.getSource() == viewMesseges) {
			
			ArrayList<Message> SentM = new ArrayList<>();
			
			for (int i = 0; i < Messagess.size(); i++) {
				if(Users.get(Current_user).getEmail().equals(Messagess.get(i).getSender()))
				{
					SentM.add(Messagess.get(i));
				}
			}
			JFrame f=new JFrame();
			String[][] data = new String[SentM.size()][];
			for (int i = 0; i < SentM.size(); i++) {
				data[i] = new String[]{SentM.get(i).getReceiver(), SentM.get(i).getContent()};
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
			LoginPage2 loginpage = new LoginPage2(Users);
		}
		
		
		
	}
	
	


}
