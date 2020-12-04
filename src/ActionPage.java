import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionPage implements ActionListener
{
	JFrame frame = new JFrame();
	JLabel welcome = new JLabel();
	JLabel accounts = new JLabel("Bank Accounts");
	JLabel transaction = new JLabel("Transactions");
	JButton Logout = new JButton("Logout");
	JButton view = new JButton("View Transaction History");
	JButton make = new JButton("Make Transaction");
	JButton accountButton = new JButton("View Accounts");
	String userName;
	double check;
	double save;
	
	AccountInfo info = new AccountInfo();
	
	
	
	
	ActionPage(String user)
	{
		userName = user;
		info.setCheck(userName);
		info.setSave(userName);
		welcome.setBounds(0,0,200,35);
		welcome.setFont(new Font(null,Font.ITALIC,25));
		welcome.setText("Welcome"+" "+user);
		
		accounts.setBounds(200,100,100,25);
		transaction.setBounds(200,200,100,25);
		
		Logout.setBounds(380,0,100,25);
		Logout.addActionListener(this);
		
		view.setBounds(130,220,220,25);
		view.addActionListener(this);
		
		make.setBounds(130,260,220,25);
		make.addActionListener(this);
		
		accountButton.setBounds(130,120, 220,25);
		accountButton.addActionListener(this);
		
		frame.add(welcome);
		frame.add(Logout);
		frame.add(transaction);
		frame.add(accounts);
		frame.add(accountButton);
		frame.add(view);
		frame.add(make);
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == accountButton)
		{
			check = info.getCheck();
			save = info.getSave();
			AccountPage accounts = new AccountPage(userName, check, save);
		}
		
		if(e.getSource() == make)
		{
			Transactions transact = new Transactions(userName,info);
			check = transact.getCheck();
			save = transact.getSave();
		}
		
		if(e.getSource() == view)
		{
			TransactionHistory history = new TransactionHistory();
		}
		
		if(e.getSource() == Logout)
		{
			frame.dispose();
			UsersandPasswords users = new UsersandPasswords(); 
			Login log = new Login(users.getLogin());
		}
	}
}
