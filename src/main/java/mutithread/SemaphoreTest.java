package mutithread;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(5);
		int N=8;
		for (int i = 0; i < N; i++) {
			new Thread(()->{
				try {
					semaphore.acquire();
					System.out.println(Thread.currentThread().getName()+"获取机器");
					Thread.sleep(5000);
					System.out.println(Thread.currentThread().getName()+"完成任务，释放机器");
					semaphore.release();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}).start();
		}
	}
}
