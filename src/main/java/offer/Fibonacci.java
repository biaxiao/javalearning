package offer;

public class Fibonacci {
	public static void main(String[] args) {
		long t1 = System.nanoTime();
		int res=fibonacci(25);
		System.out.println((System.nanoTime()-t1)/1000+"*1000   ns");
		System.out.println(res);
		long t2 = System.nanoTime();
		int res2=fibo(25);
		System.out.println((System.nanoTime()-t2)/1000+"*1000   ns");
		System.out.println(res2);
	}
	
	public static int fibonacci(int n) {
		
		if(n<=0) {
			return 0;
		}
		
		if(n==1) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
		
	}
	public static int fibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int fiOne=0;
		int fiTwo=1;
		int result=0;
		while(n-->=2) {
			result=fiOne+fiTwo;
			fiOne=fiTwo;
			fiTwo=result;
		}
		return result;
	}
}
