package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CommandPromt {

	    public static void main(String[] args)
	    {
	        try
	        {
	            // Just one line and you are done ! 
	            // We have given a command to start cmd
	            // /K : Carries out command specified by string
	        	// Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && Time\"");
	        	 
//	        	 System.out.println("user.dir: "+System.getProperty("user.dir"));
//	        	 
//	             // Fetches the property set with 'home' key
//	             System.out.println("home: "+System.getProperty("home"));
//	             // Resulting in Null as no property is present
//	      
//	             // Printing 'name of Operating System'
//	             System.out.println("os.name: "+System.getProperty("os.name"));
//	      
//	             // Printing 'JAVA Runtime version'
//	             System.out.println("version: "+System.getProperty("java.runtime.version" ));
//	      
//	             // Printing 'name' property
//	             System.out.println("name: "+System.getProperty("name" ));
	        	
	        	InetAddress addr = InetAddress.getLocalHost();
	            //Getting IPAddress of localhost - getHostAddress return IP Address
	            // in textual format
	        	System.out.println(addr);
	            String ipAddress = addr.getHostAddress();
	            System.out.println("IP address of localhost from Java Program: " + ipAddress);	            
	            //Hostname
	            String hostname = addr.getHostName();
	            System.out.println("Name of hostname : " + hostname);
	            System.out.println(LocalDateTime.now());
	  
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	
}
