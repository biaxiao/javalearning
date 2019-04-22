package offer;
/*
 * 机器人运动范围
 */
public class Demo13 {

	public static void main(String[] args) {
	
		System.out.println(movingCount(2, 3, 3));
	}
	
	public static int movingCount(int threshold,int rows,int cols) {
		if(threshold<0||rows<=0||cols<=0) {
			return 0;
		}
		
		boolean[][] visited= new boolean[rows][cols];
		int count =movingCountCode(threshold, rows, cols, 0, 0, visited);
		return count;
	}
	
	

	
	public static int movingCountCode(int threshold,int rows,int cols,int row,int col ,boolean[][] visited) {
		int count =0;
		if(check(threshold, rows, cols, row, col, visited)) {
			visited[row][col]=true;
			count=1+movingCountCode(threshold, rows, cols, row-1, col, visited)
			+movingCountCode(threshold, rows, cols, row, col-1, visited)
			+movingCountCode(threshold, rows, cols, row+1, col, visited)
			+movingCountCode(threshold, rows, cols, row, col+1, visited);
		}
		return count;
	}
	
	
	
	
	
	
	public static boolean check(int threshold,int rows,int cols,int row,int col,boolean[][] visited) {
		if(row>=0&&row<rows&&col>=0&&col<cols&&getDigitSum(row)+getDigitSum(col)<=threshold&&!visited[row][col]) {
			return true;
		}
		
		return false;
	}
	
	public static int getDigitSum(int number) {
		int sum =0;
		while (number>0) {
			sum+=number%10;
			number/=10;
		}
		return sum;
	}
}
