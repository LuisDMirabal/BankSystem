import java.util.HashMap;

public class UsersandPasswords 
{
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	UsersandPasswords()
	{
		logininfo.put("test","password");
		logininfo.put("otherTest", "password2");
		
	}
	
	protected HashMap getLogin()
	{
		return logininfo;
	}
}
