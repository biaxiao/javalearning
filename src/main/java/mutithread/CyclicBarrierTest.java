package mutithread;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		int N=5;
		CyclicBarrier cBarrier =new CyclicBarrier(N);
		for (int i = 0; i < N; i++) {
			pool.execute(()->{
				System.out.println(Thread.currentThread().getName()+"正在进行操作...");
				try {
					Thread.sleep((long)(Math.random()*10000));
					System.out.println(Thread.currentThread().getName()+"写入完成...");
					cBarrier.await();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				System.out.println("所有线程执行完毕，继续执行其他任务");
				
				
			});
			
		}
		pool.shutdown();
	}
}
