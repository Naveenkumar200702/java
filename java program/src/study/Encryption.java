package study;

import java.util.UUID;

public class Encryption {

	public static void main(String[] args)
	{
		String password="naveen";
		UUID uuid = UUID.randomUUID();
	    String value=uuid.toString().replace("-","");
	    String key = value.substring(value.length() -password.length());
	    String encrypt="";
	    System.out.println(password);
	    for(int i=0;i<password.length();i++)
	    {
	    	int n=password.charAt(i)+key.charAt(i);
	    	encrypt+=(char)n;
	    }
	    
	    System.out.println("decrypt-->"+encrypt);
	    String decrypt="";
	    
	    for(int i=0;i<encrypt.length();i++)
	    {
	    	int n=encrypt.charAt(i)-key.charAt(i);
	    	decrypt+=(char)n;
	    }
	    System.out.println("encrypt string "+ decrypt);
	}
}
