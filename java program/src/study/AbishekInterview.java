package study;
interface hello{
	 default void abishek() {
		 System.out.println("kama");
	 }
}
interface hello1{
	 default void abishek() {
		System.out.println("ML");
	}
	
	
}
public class AbishekInterview implements hello,hello1{

	
	public static void main(String[] args) {
		
	}

	@Override
	public void abishek() {
		// TODO Auto-generated method stub
		hello.super.abishek();
	}


	
	

}
