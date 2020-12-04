import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Login implements ActionListener
{
	JFrame frame = new JFrame();
	JButton lButton = new JButton("Login");
	JButton cButton = new JButton("Clear");
	JTextField userField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JLabel user = new JLabel("User:");
	JLabel password = new JLabel("Password:");
	JLabel message = new JLabel("");
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	
	Login(HashMap<String,String> theLogs)
	{
		logininfo = theLogs;
		
		user.setBounds(40,90,75,25);
		password.setBounds(40,140,75,25);
		message.setBounds(80,180,200,40);
		message.setFont(new Font(null,Font.ITALIC,25));
		
		userField.setBounds(110,90,200,25);
		passwordField.setBounds(110,140,200,25);
		
		lButton.setBounds(80,250,100,25);
		lButton.addActionListener(this);
		
		cButton.setBounds(200,250,100,25);
		cButton.addActionListener(this);
		
		
		frame.add(user);
		frame.add(password);
		frame.add(message);
		frame.add(userField);
		frame.add(passwordField);
		frame.add(lButton);
		frame.add(cButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == cButton)
		{
			userField.setText("");
			passwordField.setText("");
		}
		
		if(e.getSource() == lButton)
		{
			String userName = userField.getText();
			String passwordName = String.valueOf(passwordField.getPassword());
			
			if(logininfo.containsKey(userName))
			{
				if(logininfo.get(userName).equals(passwordName))
				{
					frame.dispose();
					ActionPage action = new ActionPage(userName);
				}
				
				else
				{
					message.setForeground(Color.red);
					message.setText("Wrong Password");
				}
			}
			
			else
			{
				message.setForeground(Color.red);
				message.setText("Unknown User");
			}
		}
		
	}
}
