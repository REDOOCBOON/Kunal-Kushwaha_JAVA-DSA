package assignments.Arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
public class CreateTargetInGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]) ;// add me pehle index ayega fir target
        }
        //converting list to int[]
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }

}
