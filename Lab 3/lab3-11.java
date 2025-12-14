import java.util.Scanner;
class SystemConfigggi {
	private static SystemConfigggi instance;
	private String serverUrl;
	private int maxConnections;
	private SystemConfigggi() {
		this.serverUrl = "default.server.com";
		this.maxConnections = 10;
	}
	
	public static SystemConfigggi getInstance() {
		if (instance == null) {
			instance = new SystemConfigggi();
		}
		return instance;
	}
	
	public String getServerUrl() {
		return this.serverUrl;
	}
	
	public void setServerUrl(String url) {
		this.serverUrl = url;
	}
	
	public int getMaxConnections() {
		return this.maxConnections;
	}
	
	public void setMaxConnections(int count) {
		if (count > 0) {
			this.maxConnections = count;
			System.out.println("Max connections set.");
		} else if (count == 0 || count < 0) {
			System.out.println("Invalid count.");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scannerrbez = new Scanner(System.in);
		if (!scannerrbez.hasNextInt()) {
			scannerrbez.close();
			return;
		}
		int N = scannerrbez.nextInt();
		
		for (int i = 0; i < N; i++) {
			String command = scannerrbez.next();
			
			if (command.equalsIgnoreCase("SET_URL")) {
				String url = scannerrbez.next(); 
				SystemConfigggi.getInstance().setServerUrl(url);
				
			} else if (command.equalsIgnoreCase("SET_MAX")) {
				int count = scannerrbez.nextInt();
				SystemConfigggi.getInstance().setMaxConnections(count);
				
			} else if (command.equalsIgnoreCase("SHOW")) {
				SystemConfigggi config = SystemConfigggi.getInstance();
				System.out.println("URL"+ config.getServerUrl());
				System.out.println("MAX"+ config.getMaxConnections());
			}
		}
		scannerrbez.close();
	}
}
