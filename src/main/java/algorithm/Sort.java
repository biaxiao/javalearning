package algorithm;

import java.util.Arrays;

/*
 * 排序算法
 */
public class Sort {

	
	public static void main(String[] args) {
		int[] arr= {3,2};//{3,2,44,47,5,38,19,48,4,50,26,15,46,7};
//		bubbleSort(arr);
//		selectionSort(arr);
//		insertionSort(arr);
//		shellSort(arr);
//		arr=mergeSort(arr);
		arr=quickSort(arr, 0, arr.length-1);
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
	 * 归并排序
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
	 * 快速排序
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
	
	
	
}
