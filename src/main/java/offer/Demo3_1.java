package offer;

/**
 * 找出数组中重复的数字
 */
public class Demo3_1 {
    public static void main(String[] args) {
        int[] arr={5,6,3,4,1,2,3,7,8,10};
        System.out.println(getRepeat(arr));;
    }

    public static int getRepeat(int[] nums){
      for(int i=0;i<nums.length;i++){
          while(nums[i]!=i){
              if(nums[i]==nums[nums[i]]){
                  return nums[i];
              }

              int temp=nums[i];
              nums[i]=nums[temp];
              nums[temp]=temp;
          }
      }
      return -1;
    }

}
