package offer;

public class Demo4 {
	public static void main(String[] args) {
		int[][] arr= new int[][] {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(find(arr, 10));
	}
	
	public static boolean find(int[][] arr,int v) {
		boolean flag=false;
		int rows=arr.length;
		int cols=arr[0].length;
		int row=0;
		int col=cols-1;
		while(row<rows&&col>=0) {
			if(arr[row][col]>v) {
				col--;
			}else if(arr[row][col]<v) {
				row++;
			}else {
				flag=true;
				break;
			}
		}
		
		return flag;
	}
}


