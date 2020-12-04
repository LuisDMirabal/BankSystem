import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AccountPage implements ActionListener
{
	
	JFrame frame = new JFrame();
	JLabel check = new JLabel("");
	JLabel save = new JLabel("");
	JLabel header = new JLabel("Account Information");
	JButton back = new JButton("Back");
	String userName;
	double moneyC;
	double moneyS;
	
	
	AccountPage(String user, double checking, double saving)
	{
		userName = user;
		moneyC = checking;
		moneyS = saving;
		header.setBounds(0,0,400,45);
		header.setFont(new Font(null,Font.ITALIC,25));
		
		check.setBounds(0,100,200,25);
		check.setText("Checkings Account: "+moneyC);
		
		save.setBounds(0,150,200,25);
		save.setText("Savings Account: "+moneyS);
		
		back.setBounds(380,0,100,25);
		back.addActionListener(this);
		frame.add(check);
		frame.add(save);
		frame.add(header);
		frame.add(back);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}



	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()== back)
		{
			frame.dispose();
		}
		
	}
	
	
}
