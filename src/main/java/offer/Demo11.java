package offer;
/**
 * 旋转数组的最小数字
 * 
 * 2019年5月28日
 */
public class Demo11 {
	public static void main(String[] args) throws Exception {
		int arr[] = {3,4,5,1,2};
		System.out.println(min(arr));
	}
	static int min(int[] arr) throws Exception {
		if(arr ==null) throw new Exception("非法参数");
		
		int index1=0;
		int index2=arr.length-1;
		int indexMid=index1;
		
		while(arr[index1]>=arr[index2]) {
			if(index2-index1==1) {
				indexMid=index2;
				break;
			}
			
			indexMid=(index1+index2)/2;
			
			//如果三个地方数字相等，顺序查找
			if(arr[index1]==arr[index2]&&arr[indexMid]==arr[index1]) {
				return minInOrder(arr, index1, index2);
			}
			
			if(arr[indexMid]>=arr[index1]) {
				index1=indexMid;
			}else if(arr[indexMid]<=arr[index2]) {
				index2=indexMid;
			}
		}
		return arr[indexMid];
	}
	
	static int minInOrder(int[] arr, int index1, int index2) {
		int result=arr[index1];
		for (int i = index1+1; i <= index2; i++) {
			if(result>arr[i]) {
				result=arr[i];
			}
		}
		return result;
	}
}
