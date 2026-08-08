 class Solution {
    public int[] twoSum(int[] nums, int target) {
      for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
            int d;
            d=target-nums[i];
            if(d==nums[j]){
                int[] r={i,j};
                return r;
            
          }
        }
      }
     return new int[]{};
      } 
     
 }

public class Main{
   public static void main(String[] args){
      Solution obj=new Solution();
      int []nums={1,2,3,4};
      int target=7;
      System.out.println(obj.twoSum(nums,target));
    }
}

 // if(nums[i] + nums[i+1]==target){
        //     int[] r={i,i+1};
        //     return r;
        //