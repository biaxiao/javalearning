package algorithm;

import java.util.Arrays;

/*
 * 排序算法
 */
public class Sort {

	
	public static void main(String[] args) {
		int[] arr= {3,2,44,47,5,38,19,48,4,50,26,15,46};
//		bubbleSort(arr);
		selectionSort(arr);
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
	
	
}
