package study;

public class WaitTest {
	public static void main(String[] args)
	{
		
		Market market=new Market();
		Manufacture manufacture=new Manufacture(market);
		Consumer consumer=new Consumer(market);
		new Thread(consumer).start();
		new Thread(manufacture).start();
	}
}
class Market{
	private int item=0;
	public synchronized void put() {
		while(item>=6)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		item++;
		System.out.println("MANUFACTURE ADDED ONE ITEM"+" current stock is "+item);
		notify();	
	}
	
	public synchronized void get() {
		while(item<=0)
		{
			try{
				wait();
			}catch(Exception e) {}	
		}
		item--;
		System.out.println("consumer brought 1 product");
		System.out.println("current stock is===="+item);
		notify();
	}
}

class Consumer implements Runnable{
	Market object;
	public Consumer(Market market) {
		object=market;
	}
	public void run() {
		for(int i=0;i<8;i++)
		{
			object.get();
		}
	}
}

class Manufacture implements Runnable{
	Market market;
	public Manufacture(Market market) {
		this.market=market;
	}
	public void run() {
		for(int i=0;i<8;i++)
		{
			market.put();
		}
	}	
}
