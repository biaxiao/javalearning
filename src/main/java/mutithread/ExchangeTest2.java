package mutithread;

import java.util.concurrent.Exchanger;

public class ExchangeTest2 {
	
	public static void main(String[] args) {
		Exchanger<String> exchange = new Exchanger<>();
		new Thread(()->{
			String v=null;
			for (int i = 5; i < 20; i++) {
				
				try {
//					Thread.currentThread().sleep(5000);
					v=exchange.exchange(i+"");
					System.out.println(v==null?0:v);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}).start();
		
		new Thread(()->{
			String v=null;
			for (int i = 0; i < 5; i++) {
				
				try {
					v=exchange.exchange(v);
					System.out.println(v+"----------");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}).start();


	}
	
	
}
