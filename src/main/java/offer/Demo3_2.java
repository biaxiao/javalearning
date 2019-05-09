package offer;

/**
 * 不修改数组找出重复的数字
 */
public class Demo3_2 {

    public static void main(String[] args) {
        int[] arr={2,3,5,4,1,2,6,7};
        System.out.println(getRepeat(arr));
    }

    public static int getRepeat(int[] arr){
        int length=arr.length;
        int left=1;
        int right=length-1;
        while(left<=right){//直接写true也行
            int middle=( (right-left) >> 1)+left;
            int count=count(arr,left,middle);
            if (right==left){
                if(count>1){
                    return left;
                }else {
                    break;
                }
            }
            if(count>(middle-left+1)){
                right=middle;
            }else {
                left=middle+1;
            }

        }
        return -1;
    }





    public static int count(int[] arr,int left,int right){
       int count=0;
       for (int i=0;i<arr.length;++i){
           if(arr[i]>=left&&arr[i]<=right){
               ++count;
           }
       }
       return  count;
    }
}
