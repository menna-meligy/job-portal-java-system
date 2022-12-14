package job_portal_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstPage extends JFrame implements ActionListener , Serializable{
	JFrame frame = new JFrame();
	
	JLabel choose = new JLabel("please choose one of the options");
	String choices[] = {"Applicant" , "Company"};
	JComboBox comboBox  =  new JComboBox(choices);
	JButton okButton = new JButton("OK");
	
	FirstPage (){
		//frame.setBounds(300 , 200 , 600 , 400);
		frame.pack();
	//this.setBounds(100, 100, 608, 233);
	//this.setSize(600 ,400);
	//frame.setSize(700 , 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,600);
		this.setVisible(true);
		
		this.add(comboBox);
		comboBox.setBounds(100, 200 , 200 ,40);
        this.getContentPane().setLayout(null);
		
		
		//choose.setFont(new Font("Tahoma", Font.BOLD, 10));
		choose.setBounds(110, 140, 300, 59);
		this.getContentPane().add(choose);
		
		okButton.setBounds(170, 250, 70, 40);
		this.getContentPane().add(okButton);
		
	
	
	
		
		okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int index = comboBox.getSelectedIndex() ;
				if(index == 0 ) {
				// TODO Auto-generated method stub
				//frame.setVisible(false);
					frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.dispose();
				ArrayList<Applicant> applicants = new ArrayList<Applicant>();
				applicants = Serialize.load();
				LoginPage page = new LoginPage(applicants);
				//page.showWindow();
				}
				else {
					//frame.setVisible(false);
					frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame.dispose();
					ArrayList<Company> companies = new ArrayList<Company>();
					companies = Serialize.Cload();
					LoginPage2 page = new LoginPage2(companies);
					
				}
			}
			
		});
	/*	if (e.getSource() == okButton ) {
		
		
			if (index == 0) {
				frame.dispose();
				LoginPage page = new LoginPage(applicants);	
				frame.setVisible(true);
			}
			else {
				frame.dispose();
				LoginPage2 page2 = new LoginPage2(applicants);	
				
			}
		}*/
		
	
	
	
	
	
	
	
	

}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}}
/*
 	private JFrame frame;
	String choices[] = {"Applicant" , "Company"};
	JComboBox comboBox = new JComboBox(choices);
	
	
	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 *//*
	public FirstPage() {
		initialize();
	}
*/
	/**
	
	private void initialize() {
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel choose = new JLabel("please choose one of the options");
		choose.setFont(new Font("Tahoma", Font.BOLD, 10));
		choose.setBounds(202, 25, 300, 59);
		frame.getContentPane().add(choose);
		
	
		comboBox.setSelectedIndex(1);
		comboBox.setToolTipText("");
		comboBox.setBounds(147, 95, 145, 21);
		frame.getContentPane().add(comboBox);
		
		
		
		frame.getContentPane().add(okButton);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<Applicant> applicants = new ArrayList<Applicant>();
		applicants = Serialize.load();
		if (e.getSource() == okButton ) {
			int userchoice =(int) comboBox.getItemAt(comboBox.getSelectedIndex());
			if (userchoice ==0) {
				LoginPage page = new LoginPage(applicants);	
			}
			else {
				LoginPage2 page2 = new LoginPage2(applicants);	
				
			}
		}
		
	}
 
 
 */