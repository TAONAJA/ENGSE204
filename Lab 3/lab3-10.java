import java.util.Scanner;
class SystemLoggerrra {	
	private static int currentLogLevel = 1;
	private static String getLevelName(int level) {
		if (level == 1) {
            return "INFO";
        } else if (level == 2) {
            return "DEBUG";
        } else if (level == 3) {
            return "ERROR";
        } else {
		    return "UNKNOWN";
        }
	}
	
	public static void setLogLevel(int newLevel) {
		if (newLevel >= 1 && newLevel <= 3) {
			SystemLoggerrra.currentLogLevel = newLevel;
			System.out.println("Log level set to " + SystemLoggerrra.getLevelName(newLevel));
		} else {
			System.out.println("Invalid log level.");
		}
	}
	
	public static void log(int messageLevel, String message) {
		 if (messageLevel >= SystemLoggerrra.currentLogLevel) {
			 String levelName = SystemLoggerrra.getLevelName(messageLevel);
	         System.out.println("[" + levelName + "]: " + message);
		 }
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scannerrra = new Scanner(System.in);
		if (scannerrra.hasNextInt()) {
		int N = scannerrra.nextInt();
		
		for (int i = 0; i < N; i++) {
            String command = scannerrra.next();
            if (command.equalsIgnoreCase("SET")) {
                int newLeveone = scannerrra.nextInt();
                SystemLoggerrra.setLogLevel(newLeveone);
            } else if (command.equalsIgnoreCase("LOG")) {
                int messageLeveone = scannerrra.nextInt();
                String message = scannerrra.nextLine().trim();
                if (message.isEmpty()) {
                    message = scannerrra.nextLine().trim();
                }
                
                SystemLoggerrra.log(messageLeveone, message);
            	}
        	}
		}
		scannerrra.close();
	}
}
