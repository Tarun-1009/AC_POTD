package day_16;

public class Product_of_array {
    public int[] productExceptSelf(int[] nums) {
      int prod=1;
      int zeroIndex=-1;
      int[] answer =new int[nums.length];
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=0)
        prod=prod*nums[i];
        else{
        if(zeroIndex==-1)
        zeroIndex=i;
        else
        return answer;
        }
      }  
      if(zeroIndex!=-1){
      answer[zeroIndex]=prod;
      return answer;
      }
      for(int i=0;i<nums.length;i++){
        answer[i]=prod/nums[i];
      }
      return answer;

    }
    
}
