package mutithread;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

//定义一个Task，基础自RecursiveAction，实现其compute方法
class SortTask extends RecursiveAction {
  final long[] array;
  final int lo;
  final int hi;
  private int THRESHOLD = 0; //For demo only

  public SortTask(long[] array) {
      this.array = array;
      this.lo = 0;
      this.hi = array.length - 1;
  }

  public SortTask(long[] array, int lo, int hi) {
      this.array = array;
      this.lo = lo;
      this.hi = hi;
  }

  protected void compute() {
      if (hi - lo < THRESHOLD) {
          //sequentiallySort(array, lo, hi);
      }else {
          int pivot = partition(array, lo, hi);  //划分
          new SortTask(array, lo, pivot - 1).fork();
          new SortTask(array,
                  pivot + 1, hi).fork();  //递归调，左右2个子数组
          
      }
  }

  private int partition(long[] array, int lo, int hi) {
      long x = array[hi];
      int i = lo - 1;
      for (int j = lo; j < hi; j++) {
          if (array[j] <= x) {
              i++;
              swap(array, i, j);
          }
      }
      swap(array, i + 1, hi);
      return i + 1;
  }

  private void swap(long[] array, int i, int j) {
      if (i != j) {
          long temp = array[i];
          array[i] = array[j];
          array[j] = temp;
      }
  }

  private void sequentiallySort(long[] array, int lo, int hi) {
      Arrays.sort(array, lo, hi + 1);
  }



//测试函数
  public static void main(String[] args) throws Exception {
	  long[] array= {3,2,44,47,5,38,19,48,4,50,26,15,46,7};
      ForkJoinTask sort = new SortTask(array);   //1个任务
      ForkJoinPool fjpool = new ForkJoinPool();  //1个ForkJoinPool
      fjpool.submit(sort); //提交任务
      fjpool.shutdown(); //结束。ForkJoinPool内部会开多个线程，并行上面的子任务
      fjpool.awaitTermination(30, TimeUnit.SECONDS);
      System.out.println(Arrays.toString(array));
  }
}