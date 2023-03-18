package study;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Random;





public class Study1{
	
//	public static void main(String[] args)
//	{
//		Random random=new Random();
//        System.out.println(random.nextInt(10));
//	}
	// encryption
	public static void main(String[] args)
	{
//		Random random=new Random();
//		int key1=random.nextInt(100);
//		String num="admin";
//		String result="";
//		int key=1;
//		for(int i=0;i<num.length();i++)
//		{
//			int n=num.charAt(i);
//			n=n+1;
//			result+=(char)n;
//		}
//		System.out.println("orginal Num--->"+num);
//		System.out.println("Encrypt--->"+ result);
//		
//		String decrypt="";
//		for(int i=0;i<result.length();i++)
//		{
//			int n=result.charAt(i);
//			n=n-1;
//			decrypt+=(char)n;
//		}		
//		System.out.println("Decrypt-->"+decrypt);
//		String dob="20/07/2002";
//        System.out.println(dob.matches("[0-9/]+"));
//		long customerID = System.currentTimeMillis()/10;
//		System.out.println(customerID);
//		long accountNo=System.currentTimeMillis()/6000;
//		System.out.println(accountNo);
//		 try {
//			Date date = new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2015");
//			System.out.println(date);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//String s = "தமிழ்"; 
//		String s = "😀";
//		System.out.println(s);
		//System.out.println(s);
//		LocalTime time=LocalTime.now();
//		LocalTime time1 = LocalTime.of(10,43,12); 
//		LocalDate date=LocalDate.now();
//		System.out.println(date);
//		LocalDate date1=LocalDate.of(2023, 07, 30);
//		System.out.println(date1);
//		System.out.println(time1);
//		System.out.printf("------------------------------%n");
//		System.out.printf(" Java double printf chart%n");
//		System.out.printf(" (number: 12345.12345)%n");
//		System.out.printf("------------------------------%n");
//		System.out.printf("| %-10s | %s |%n", "PATTERN", "RESULT");
//		System.out.printf("------------------------------%n");
//		System.out.printf("| %-8s | %f |%n",      "%f",      12345.12345);
//		System.out.printf("| %-8s | %15f |%n",    "%15f",    12345.12345);
//		System.out.printf("| %-8s | %-15f |%n",   "%-15f",   12345.12345);
//		System.out.printf("| %-8s | %-15.3f |%n", "%-15.3f", 12345.12345);
//		System.out.printf("| %-8s | %015.3f |%n", "%015.3f", 12345.12345);
//		System.out.printf("------------------------------%n");
//		System.out.println();
//		System.out.printf("%15d %n %f %n %.2f",123456,123354.123,9827349.231);
//		String date="20/7/2002";
//		String[] array=date.split("/");
//		System.out.println(Arrays.toString(array));
//		String mail="naveen123@gmail.com";
//		System.out.println(mail.matches("^[a-z0-9]+[@?][gmail]+[.?][com]+"));
//		String dob="20/07/202";
//		System.out.println(dob.matches("^[0-9]{2}[/?][0-9]{2}[/?][0-9]{4}$"));
//		LocalTime time=LocalTime.now();
//		LocalTime time1 = LocalTime.of(10,43,12); 
//		
//		
//		LocalDate date1=LocalDate.of(2023, 01, 02);
//		LocalDate date=LocalDate.now();
//		String str="2022/10/10";
//		str=str.replace("/", "-");
//		LocalDate date2=LocalDate.parse(str);
//		System.out.println(date2);
//		Period age = Period.between(date1, date);
//		int years = age.getYears();
//		int months = age.getMonths();
//        long days = age.getDays();
//
//        
//        System.out.println(date1.isAfter(date));
//        System.out.println(date.getDayOfYear());
//        System.out.println(date1.getDayOfYear());
//		System.out.println(years);
//		System.out.println(days);
//		System.out.println(months);
		String startDate="2023/02/28";
		String date1="28/02/2023";
		
		//System.out.println(startDate.matches("[0-9]{2}[/?][0-9]{2}[/?][0-9]{4}"));
		String date=startDate.replace("/", "-");
		System.out.println(LocalDate.parse(date).isBefore(LocalDate.now()));
		
		System.out.printf("%15s","naveenkumar@gmail.com");
		System.gc();
	}
	
}



