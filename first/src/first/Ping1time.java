package first;
import java.net.*;
import java.util.ArrayList;
public class Ping1time {
	public String commands(String commandList) 
			throws Exception 
			{
		String ipAddress = "192.168.56.1";
		InetAddress inet = InetAddress.getByName(commandList);
		System.out.println("Sending Ping Request to " + commandList);
		if (inet.isReachable(5000)) {
			System.out.println(commandList + " is reachable.");
		} else {
			System.out.println(commandList + " NOT reachable.");
		}
		return commandList;
	}
 }
