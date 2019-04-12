package mutithread;

class Thread2 implements Runnable{
    private int count=15;
	@Override
	public void run() {
		  for (int i = 0; i < 5; i++) {
			  System.out.println(Thread.currentThread().getName() + "运行  count= " + count--);
	            try {
	            	Thread.sleep((int) Math.random() * 10);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	}
	
}
public class Demo {
	public static void main(String[] args) {
		Thread2 mTh = new Thread2();
	        new Thread(mTh, "C").start();//同一个mTh，但是在Thread中就不可以，如果用同一个实例化对象mt，就会出现异常   
	        new Thread(mTh, "D").start();
	        new Thread(mTh, "E").start();
	}
}
