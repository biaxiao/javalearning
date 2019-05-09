package offer;

/**
 * 找出数组中重复的数字
 */
public class Demo3_1 {
    public static void main(String[] args) {
        int[] arr={3,0,2,5,2,5,3};
        getRepeat(arr);
    }

    public static void getRepeat(int[] arr){
      for(int i=0;i<arr.length;i++){
          while(arr[i]!=i){
              if(arr[i]==arr[arr[i]]){
                  System.out.println(arr[i]);
                  return;
              }

              int temp=arr[i];
              arr[i]=arr[temp];
              arr[temp]=temp;
          }
      }
    }

}
