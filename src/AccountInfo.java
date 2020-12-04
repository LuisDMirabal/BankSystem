
public class AccountInfo 
{
	String userName;
	public static double checking;
	public static double saving;
	
	public void setCheck(String user)
	{
		userName = user;
		if(userName.equals("test"))
		{
			this.checking = 500.00;
			
		}
		
		if(userName.equals("otherTest"))
		{
			this.checking = 0.00;
			
		}
	}
	
	public double getCheck() 
	{ 
		return checking; 
	} 
	
	
	public void setSave(String user)
	{
		userName = user;
		if(userName.equals("test"))
		{
			this.saving = 500.00;
			
		}
		
		if(userName.equals("otherTest"))
		{
			this.saving = 0.00;
			
		}
	}
	
	public double getSave() 
	{ 
		return saving; 
	} 
	
	public void updateCheck(double checkAmount) 
	{ 
		this.checking = checkAmount; 
	} 
	
	public void updateSave(double saveAmount) 
	{ 
		this.saving = saveAmount; 
	} 
	
	public void nothing()
	{
		
	}
}
