package mutithread;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierTest2 {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		int N=5;
		CyclicBarrier cBarrier =new CyclicBarrier(N);
		Runnable r=	()->{
			System.out.println(Thread.currentThread().getName()+"正在进行操作...");
			try {
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName()+"写入完成...");
				cBarrier.await(2000,TimeUnit.MILLISECONDS);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			System.out.println("所有线程执行完毕，继续执行其他任务");
		};
		for (int i = 0; i < N; i++) {
		
			if(i<N-1) {
				pool.execute(r);
			}else {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				pool.execute(r);
			}
			
			
		}
		pool.shutdown();
	}
}
