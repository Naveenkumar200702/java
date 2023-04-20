package study;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

public class FilesLearn {
	public static void main(String[] args) throws IOException
	{
		// creating a file object---------------
		FileReader fr=new FileReader("new.txt");
		File f=new File("new.txt");
		
		File f1=new File("C:\\git\\java\\java program");
		FileWriter f2=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(f2);
		
		try {
			// creates a new physical file ------------------
//			f.createNewFile();
//			f1.createNewFile();
		//	System.out.println(f.mkdir());
			//f2.write("hello");
		
			bw.write("helo");
			bw.newLine();
			bw.write("Welcome");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(f.exists());
//		String[] str=f1.list();
//		for(String s:str)
//		{
//			System.out.println(s);
//		}
	}

}
