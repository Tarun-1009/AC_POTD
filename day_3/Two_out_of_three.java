import java.util.ArrayList;
import java.util.List;

public class Two_out_of_three {
    class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        int[][] count = new int[3][101];
        for(int i: nums1) count[0][i]=1; 
        for(int i: nums2) count[1][i]=1;
        for(int i: nums3) count[2][i]=1;
        for(int i=0;i<101;i++){
            if(count[0][i] + count[1][i] + count[2][i] > 1){
                list.add(i);
            }
        }
        return list;
    }
}
}
