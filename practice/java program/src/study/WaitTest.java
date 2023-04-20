package study;

public class WaitTest {
	public static void main(String[] args)
	{
		
		Market market=new Market();
		Manufacture manufacture=new Manufacture(market);
		Consumer consumer=new Consumer(market);
		Thread t1=new Thread(consumer);//thread-0
		t1.start();	
		Thread t2=new Thread(manufacture);//thread-1
		t2.start();
	}
}
class Market{
	private int item=0;
	public synchronized void put() {
		Manufacture manufacture=new Manufacture();
		synchronized(manufacture) {
			Consumer consumer=new Consumer();
			synchronized(consumer) {
				System.out.println("locks of lock");
			}
		}
//		if(item>=6)
//		{
//			try {
//				System.out.println("putting stock thread"+Thread.currentThread().getName());
//				System.out.println("-------------suplier adding ----------------");
//				this.wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}	
//		}
//		item++;
//		System.out.println("MANUFACTURE ADDED ONE ITEM"+" current stock is "+item);
//		this.notify();	
	}
	
	public synchronized void get() throws InterruptedException {
//		if(item>0)
//				Thread.sleep(100);
		if(item<=0)
		{
			try{
				System.out.println("getting stock thread"+Thread.currentThread().getName());
				System.out.println("-----------consumer waiting-------------");
				this.wait();
			}catch(Exception e) {
				System.out.println(e);
			}	
		}
		item--;
		System.out.println("consumer brought 1 product");
		System.out.println("current stock is===="+item);
		this.notify();
	}
}

class Consumer implements Runnable{
	Market object;
	public Consumer(Market market) {
		object=market;
	}
	public Consumer() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		for(int i=0;i<8;i++)
		{
			try {
				object.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Manufacture implements Runnable{
	Market market;
	public Manufacture(Market market) {
		this.market=market;
	}
	public Manufacture() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		for(int i=0;i<10;i++)
		{
			market.put();
		}
	}	
}
