import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Transactions implements ActionListener
{
	JFrame frame = new JFrame();
	JTextField nameField = new JTextField();
	JTextField moneyField = new JTextField();
	JTextField accountField = new JTextField();
	JLabel accountL = new JLabel("Enter Account:");
	JLabel message = new JLabel("");
	JLabel header = new JLabel("Transactions");
	JLabel name = new JLabel("Enter User:");
	JLabel money = new JLabel("Enter Transaction Amount:");
	JButton back = new JButton("Back");
	JButton send = new JButton("Send");
	JButton clear = new JButton("Clear");
	String userName;
	public static double checkings= 500;
	public static double savings = 500;
	AccountInfo accounts = new AccountInfo();
	
	Transactions(String user,AccountInfo info)
	{
		userName = user;
		accounts = info;
		
		name.setBounds(0,140,100,25);
		money.setBounds(0,180,160,25);
		accountL.setBounds(0,100,160,25);
		message.setBounds(80,350,400,25);
		message.setFont(new Font(null,Font.ITALIC,25));
		
		nameField.setBounds(155,140,200,25);
		moneyField.setBounds(155,180,200,25);
		accountField.setBounds(155,100,200,25);
		
		
		back.setBounds(380,0,100,25);
		back.addActionListener(this);
		
		send.setBounds(100,270,100,25);
		send.addActionListener(this);
		
		clear.setBounds(250,270,100,25);
		clear.addActionListener(this);
		
		header.setBounds(0,0,400,45);
		header.setFont(new Font(null,Font.ITALIC,25));
		
		frame.add(name);
		frame.add(money);
		frame.add(back);
		frame.add(nameField);
		frame.add(moneyField);
		frame.add(header);
		frame.add(send);
		frame.add(clear);
		frame.add(accountField);
		frame.add(accountL);
		frame.add(message);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		String accountName = accountField.getText();
		String users = nameField.getText();
		String moneyAmount = moneyField.getText();
		if(e.getSource()== back)
		{
			frame.dispose();
		}
		
		
		if(e.getSource() == send)
		{
			
			if(accountName.equals("") || users.equals("") || moneyAmount.equals(""))
			{
				message.setForeground(Color.red);
				message.setText("Can not leave spaces blank");
			}
			
			if(accountName.equals("checking") || accountName.equals("Checking"))
			{
				if(users.equals("otherTest"))
				{
					if(checkings < Integer.parseInt(moneyAmount))
					{
						message.setForeground(Color.red);
						message.setText("Amount Entered Too Great");
					}
					
					else if(Integer.parseInt(moneyAmount) < 0)
					{
						message.setForeground(Color.red);
						message.setText("Amount Entered Less Than Zero");
					}
					
					else
					{
						checkings = checkings - Integer.parseInt(moneyAmount);
						accounts.updateCheck(checkings);
						message.setForeground(Color.green);
						message.setText("Transaction was successful");
					}
				}
				
				else
				{
					message.setForeground(Color.red);
					message.setBounds(130,350,400,35);
					message.setText("User Not Found");
				}
			}
			if(accountName.equals("saving") || accountName.equals("Saving"))
			{
				if(users.equals("otherTest"))
				{
					if(savings < Integer.parseInt(moneyAmount))
					{
						message.setForeground(Color.red);
						message.setText("Amount Entered Too Great");
					}
					
					else if(Integer.parseInt(moneyAmount)< 0)
					{
						message.setForeground(Color.red);
						message.setText("Amount Entered Less Than Zero");
					}
					
					else
					{
						savings = savings - Integer.parseInt(moneyAmount);
						accounts.updateSave(savings);
						message.setForeground(Color.green);
						message.setText("Transaction was successful");
					}
				}
				
				else
				{
					message.setForeground(Color.red);
					message.setBounds(130,350,400,35);
					message.setText("User Not Found");
				}
			}
		}
		
		if(e.getSource() == clear)
		{
			nameField.setText("");
			moneyField.setText("");
			accountField.setText("");
			message.setText("");
		}
	}
	
	public double getCheck() 
	{ 
		return accounts.checking; 
	} 
	
	public double getSave() 
	{ 
		return accounts.saving; 
	} 
	
}
