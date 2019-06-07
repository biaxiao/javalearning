package offer;
/*
 * 矩阵中的路径
 * 
 */
public class Demo12 {
	public static void main(String[] args) {
		char[] [] arr=new char[][]{{'a','b','t','g'},{'c','f','c','s'},{'j','d','e','h'}};
		String str="b";
		int rows=3;
		int cols=4;
		System.out.println(hasPath(arr, rows, cols, str));
	}
	public static boolean hasPath(char[][] arr,int rows,int cols, String str) {
		if(arr==null||rows<1||cols<1||str==null) {
			return false;
		}
		boolean[][] visited=new boolean[rows][cols];
		int pathLength=0;//路径字符串中下标
		for (int row = 0; row < rows; ++row) {
			for (int col = 0; col < cols; ++col) {
				if (hasPathCore(arr, rows, cols, row, col, str, pathLength, visited)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public static boolean hasPathCore(char[][] arr,int rows,int cols,int row ,int col,
			                            String str,int pathLength,boolean[][] visited) {
		if(pathLength==str.length()) {
			return true;
		}
		boolean hasPath=false;
		if(row>=0&&row<rows&&col>=0&&col<cols&&arr[row][col]==str.charAt(pathLength)&&!visited[row][col]) {
			++pathLength;
			visited[row][col]=true;
			hasPath=hasPathCore(arr, rows, cols, row, col-1, str, pathLength, visited)
			||hasPathCore(arr, rows, cols, row-1, col, str, pathLength, visited)
			||hasPathCore(arr, rows, cols, row, col+1, str, pathLength, visited)
			||hasPathCore(arr, rows, cols, row+1, col, str, pathLength, visited);
			if(!hasPath) {
				--pathLength;
				visited[row][col]=false;
			}
		}
		
		
		return hasPath;
	}
}
