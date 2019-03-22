package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 排序算法
 */
public class Sort {

	
	public static void main(String[] args) {
		int[] arr= {3,2,44,47,5,38,19,48,4,50,26,15,46,7};//{3,2};//
//		bubbleSort(arr);
//		selectionSort(arr);
//		insertionSort(arr);
//		shellSort(arr);
//		arr=mergeSort(arr);
//		arr=quickSort(arr, 0, arr.length-1);
//		heapSort(arr);
//		countingSort(arr, 50);
//		countingSort(arr);
//		bucketSort(arr, 5);
		radixSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	/*
	 * 冒泡排序
	 */
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	/*
	 * 选择排序
	 */
	public static void selectionSort(int[] arr ) {
		for(int i=0;i<arr.length-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			int temp =arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}
	/*
	 * 插入排序
	 * 
	 */
	public static void insertionSort(int[] arr) {
		int current;
		for(int i=0;i<arr.length-1;i++) {
			current=arr[i+1];
			int preIndex=i;
			while (preIndex>=0&&current<arr[preIndex]) {
				arr[preIndex+1]=arr[preIndex];
				preIndex--;
			}
			arr[preIndex+1]=current;
		}
	}
	/*
	 * 希尔排序
	 */
	public static void shellSort(int[] arr) {
		int len=arr.length;
		int temp,gap=len/2;
		while(gap>0) {
			for(int i=gap;i<len;i++) {
				temp=arr[i];
				int preIndex=i-gap;
				while(preIndex>=0&&arr[preIndex]>temp) {
					arr[preIndex+gap]=arr[preIndex];
					preIndex-=gap;
				}
				arr[preIndex+gap]=temp;
			}
			gap/=2;
		}
	}
	
	/*
	 * 归并排序-----------------------------------------------------------------------------
	 */
	
	public static int[] mergeSort(int[] arr) {
		if(arr.length<2) return arr;
		int mid=arr.length/2;
		int[] left=Arrays.copyOfRange(arr, 0, mid);
		int[] right=Arrays.copyOfRange(arr, mid, arr.length);
		return merge(mergeSort(left), mergeSort(right));
	}
	
	/*
	 * 归并排序-将两段排序好的数组结合成一个排序数组
	 */
	public static int[] merge(int[] left,int[] right) {
		int[] result =new int[left.length+right.length];
		for(int index=0,i=0,j=0;index<result.length;index++) {
			if(i>=left.length) {
				result[index]=right[j++];
			}else if(j>=right.length) {
				result[index]=left[i++];
			}else if(left[i]>right[j]) {
				result[index]=right[j++];
			}else {
				result[index]=left[i++];
			}
		}
		
		return result;
	}
	
	
	/*
	 * 快速排序-----------------------------------------------------------------------------------
	 * 
	 */
	
	public static int[] quickSort(int[] arr,int left,int right) {
		
	//	if(arr.length<1||left<0||right>=arr.length||left> right) { return null;} 
		
		/*if(partitionIndex>left) {
			quickSort(arr, left, partitionIndex-1);
		}
		if(partitionIndex<right) {
			quickSort(arr, partitionIndex+1, right);
		}*/
		if(left<right) {
			int partitionIndex=partition(arr, left, right);
			quickSort(arr, left, partitionIndex-1);
			quickSort(arr, partitionIndex+1, right);
		}
		return arr;
	}
	
	/*
	 * 快速排序
	 */
	public static int partition(int[] arr ,int left ,int right) {
		int pivot =left;
		int	index=pivot+1;
		for(int i=index;i<=right;i++) {
			if(arr[i]<arr[pivot]) {
				swap(arr, index, i);
				index++;
			}
		}
		swap(arr, pivot, index-1);
		return index-1;
	}

	/*
	 * 交换2个数组元素
	 */
	public static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	/*
	 * 堆排序--------------------------------------------------------------------------
	 */
	static int len;
	public static void heapSort(int[] arr) {
		buildMaxHeap(arr);
		for(int i=arr.length-1;i>0;i--) {
			swap(arr, 0, i);
			len--;
			heapify(arr, 0);
		}
		
	}
	/*
	 * 建立大顶堆
	 */
	public static void buildMaxHeap(int[] arr) {
		len=arr.length;
		for(int i=(len-1)/2;i>=0;i--) {
			heapify(arr, i);
		}
	}
	/*
	 * 堆调整(使以i为父节点的成为最大堆)
	 */
	public static void heapify(int[] arr,int i) {
		int left=2*i+1;
		int right=2*i+2;
		int largest=i;
		if(left<len&&arr[left]>arr[largest]) {
			largest=left;
		}
		
		if(right<len&&arr[right]>arr[largest]) {
			largest=right;
		}
		if (largest!=i) {
			swap(arr, i, largest);
			heapify(arr, largest);
		}
	}
	
	/*
	 *计数排序 ---------------------------------------------------------------------
	 *
	 */
	
	public static void countingSort(int[] arr, int maxValue) {
		int[] bucket= new int[maxValue+1];
		int sortedIndex=0;
		int arrLen=arr.length;
		int bucketLen=maxValue+1;
		for(int i=0;i<arrLen;i++) {
			bucket[arr[i]]++;
		}
		for(int j=0;j<bucketLen;j++) {
			while(bucket[j]>0) {
				arr[sortedIndex++]=j;
				bucket[j]--;
			}
		}
			
	}
	public static void countingSort(int[] arr) {
		int maxValue=arr[0],minValue=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
			if(arr[i]<minValue) {
				minValue=arr[i];
			}
		}
		int[] bucket= new int[maxValue-minValue+1];
		int sortedIndex=0;
		int arrLen=arr.length;
		int bucketLen=maxValue-minValue+1;
		for(int i=0;i<arrLen;i++) {
			bucket[arr[i]-minValue]++;
		}
		for(int j=0;j<bucketLen;j++) {
			while(bucket[j]>0) {
				arr[sortedIndex++]=j+minValue;
				bucket[j]--;
			}
		}
			
	}
	
	/*
	 * 桶排序
	 */
	
	public static void bucketSort(int[] arr, int bucketSize ) {
		if(arr.length==0) return;
		int minValue=arr[0];
		int maxValue=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
			if(arr[i]<minValue) {
				minValue=arr[i];
			}
		}
		
		int bucketCount=(maxValue-minValue)/bucketSize +1;
		ArrayList<ArrayList<Integer>> bucketArr=new ArrayList<>(bucketCount);
		ArrayList<Integer> resultArr= new ArrayList<>();
		for(int i=0;i<bucketCount;i++) {
			bucketArr.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < arr.length; i++) {
			bucketArr.get((arr[i]-minValue)/bucketSize).add(arr[i]);
		}
		
		for (int i = 0; i < bucketCount; i++) {
			Collections.sort(bucketArr.get(i));
			for(int j=0;j<bucketArr.get(i).size();j++) {
				resultArr.add(bucketArr.get(i).get(j));
			}
			
		}
		System.out.println(bucketArr.toString());
		System.out.println(resultArr);
	}
	
	/*
	 * 基数排序---------------------------------------------------------------------------------------
	 */
	public static void radixSort(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
		}
		int maxDigit=0;
		while(max!=0) {
			max/=10;
			maxDigit++;
		}
		int mod =10;
		int div=1;
		ArrayList<ArrayList<Integer>> bucketList= new ArrayList<>();
		for(int i=0;i<10;i++) {
			bucketList.add(new ArrayList<>());
		}
		for(int i=0;i<maxDigit;i++,mod*=10,div*=10) {
			for (int j = 0; j < arr.length; j++) {
				int num=((arr[j])%mod)/div;
				bucketList.get(num).add(arr[j]);
			}
			int index=0;
			for(int j=0;j<bucketList.size();j++) {
				for(int k=0;k<bucketList.get(j).size();k++) {
					arr[index++]=bucketList.get(j).get(k);
				}
				bucketList.get(j).clear();
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
}
