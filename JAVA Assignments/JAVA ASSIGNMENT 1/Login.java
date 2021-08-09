import java.util.*;
public class Login {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String userName="Yojana";
		String password="Yojana2000";
		String uname,pswd;
		int i=1;
		while(i>0)
		{
			System.out.println("Enter the USERNAME:");
			uname=sc.next();
			System.out.println("Enter the Password");
			pswd=sc.next();
			if(userName.equals(uname)&&password.equals(pswd))
			{
				System.out.print("Welcome "+uname);
				break;
			}
			else
			{
				System.out.println("Username and Password are incorrect!,Re-enter the Details.");
				i++;
			}
			if(i>3) {
				System.out.println("Contact Admin.");
				break;
			}
		}
	}

}
