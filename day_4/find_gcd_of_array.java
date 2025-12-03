package day_4;

public class find_gcd_of_array {
 class Solution {
    public int findGCD(int[] nums) {
        int min,max;
        max=min=nums[0];
        for(int i : nums){
            if(min>i) min=i;
            if(max<i) max =i;
        }
        int GCD=1;
        for(int i=1;i<=max;i++){
            if(max%i==0 && min%i==0)
            GCD=i;
        }
        return  GCD;
    }
}
}
