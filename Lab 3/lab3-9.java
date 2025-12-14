import java.util.Scanner;
class Userrr {
	private String username;
	private String password;
	private static int minPasswordLength = 8;
	public Userrr(String username, String password) {
		this.username = username;
		if (password.length() >= minPasswordLength) {
			this.password = password;
			System.out.println("Creation successful.");
		} else {
			this.password = "invalid";
			System.out.println("Creation failed.");
		}
	}
	
	public String getPassword() {
		return this. username + password;
	}
	public void setPassword(String newPassword) {
		if (newPassword.length() >= minPasswordLength) {
			this.password = newPassword;
            System.out.println("Update successful.");
            System.out.println("invaild.");
        } else {
            System.out.println("Update failed.");
		}
	}
	
	public static void setMinLength(int length) {
		if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            Userrr.minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
	}
	
	public static int getMinLength() {
		return Userrr.minPasswordLength;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scannerrr = new Scanner(System.in);
		int minLengthonee = scannerrr.nextInt();
		String useroneeName = scannerrr.next();
		String useroneePass = scannerrr.next();
		String usertwooName = scannerrr.next();
		String usertwooPass = scannerrr.next();
		int minLengthtwoo = scannerrr.nextInt();
		String usertwooNewPass = scannerrr.next();
		
		Userrr.setMinLength(minLengthonee);
        Userrr useronee = new Userrr(useroneeName, useroneePass);
        Userrr usertwoo = new Userrr(usertwooName, usertwooPass);
        Userrr.setMinLength(minLengthtwoo);
        usertwoo.setPassword(usertwooNewPass);
        
        System.out.println(useronee.getPassword());
        System.out.println(usertwoo.getPassword());
        scannerrr.close();
	}
