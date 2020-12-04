import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TransactionHistory implements ActionListener
{
	JFrame frame = new JFrame();
	JButton day = new JButton("Date");
	JButton amount = new JButton("Amount");
	JButton back = new JButton("Back");
	JLabel money1 = new JLabel("$400");
	JLabel money2 = new JLabel("$500");
	JLabel money3 = new JLabel("$300");
	JLabel money4 = new JLabel("$-700");
	JLabel date1 = new JLabel("2020-12-3");
	JLabel date2= new JLabel("2020-12-2");
	JLabel date3= new JLabel("2020-12-1");
	JLabel date4= new JLabel("2020-11-30");
	JLabel header = new JLabel("Transaction History");
	JPanel panel=new JPanel();
	int datecounter = 0;
	int moncounter = 0;
	
	
	TransactionHistory()
	{ 
		header.setBounds(0,0,400,45);
		header.setFont(new Font(null,Font.ITALIC,25));
		
		back.setBounds(380,0,100,25);
		back.addActionListener(this);
		
		
		
		day.setBounds(80,100,100,25);
		day.addActionListener(this);
		amount.setBounds(270,100,100,25);
		amount.addActionListener(this);
		
		money1.setBounds(300, 130,100,25);
		money2.setBounds(300, 160,100,25);
		money3.setBounds(300, 190,100,25);
		money4.setBounds(300, 220,100,25);
	
		
		date1.setBounds(100, 130,100,25);
		date2.setBounds(100, 160,100,25);
		date3.setBounds(100, 190,100,25);
		date4.setBounds(100, 220,100,25);
		
		
		
		frame.add(money1);
		frame.add(money2);
		frame.add(money3);
		frame.add(money4);
		frame.add(date1);
		frame.add(date2);
		frame.add(date3);
		frame.add(date4);
		frame.add(header);
		frame.add(back);
		frame.add(day);
		frame.add(amount);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == back)
		{
			frame.dispose();
		}
		
		if(e.getSource() == day)
		{
			datecounter++;
			if(datecounter%2 == 1)
			{
				date1.setText("2020-11-30");
				date2.setText("2020-12-1");
				date3.setText("2020-12-2");
				date4.setText("2020-12-3");
				money1.setText("$-700");
				money2.setText("$300");
				money3.setText("500");
				money4.setText("$400");
			}
			
			else
			{
				date4.setText("2020-11-30");
				date3.setText("2020-12-1");
				date2.setText("2020-12-2");
				date1.setText("2020-12-3");
				money1.setText("$400");
				money2.setText("$500");
				money3.setText("$300");
				money4.setText("$-700");
			}
			
		}
		
		if(e.getSource()== amount)
		{
			moncounter++;
			if(moncounter%2 == 1)
			{
				money1.setText("$-700");
				money2.setText("$300");
				money3.setText("$400");
				money4.setText("$500");
				date1.setText("2020-11-30");
				date2.setText("2020-12-1");
				date3.setText("2020-12-3");
				date4.setText("2020-12-2");
			}
			
			else
			{
				money4.setText("$-700");
				money3.setText("$300");
				money2.setText("$400");
				money1.setText("$500");
				date1.setText("2020-12-2");
				date2.setText("2020-12-1");
				date3.setText("2020-12-2");
				date4.setText("2020-11-30");
			}
			
		}
		
	}
	
	
	
	
	
	
}
