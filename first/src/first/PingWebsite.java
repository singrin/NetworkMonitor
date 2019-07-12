package first;
//Java program for ping using sub-process 

import java.awt.Frame;
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.util.ArrayList; 
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PingWebsite 
{ 
	// method for finding the ping statics of website 
	public ArrayList<String> commands(ArrayList<String> commandList) 
										throws Exception 
	{ 
		// creating the sub process, execute system command 
		ProcessBuilder build = new ProcessBuilder(commandList); 
		Process process = build.start(); 
	    
		// to read the output 
		BufferedReader input = new BufferedReader(new InputStreamReader 
								(process.getInputStream()));
	
		BufferedReader Error = new BufferedReader(new InputStreamReader 
								(process.getErrorStream())); 
		String s = null; 
		
		System.out.println("Standard output: "); 

		ArrayList<String> results = new ArrayList<String>();
	while((s = input.readLine()) != null) 
		{ 
			System.out.println(s);
			results.add(s);
			
		} 
		System.out.println("error (if any): "); 
		while((s = Error.readLine()) != null) 
		{ 
			System.out.println(s); 
//			return null;
		} 
		return results;
	} 
	
//	// Driver method 
//	public static void main(String args[]) throws Exception 
//	{ 
//		// creating list for commands 
//		ArrayList<String> commandList = new ArrayList<String>(); 
//		Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//		commandList.add("ping"); 
//		// can be replaced by IP 
//		commandList.add(s); 
//		
//		PingWebsite.commands(commandList); 
//	} 
} 