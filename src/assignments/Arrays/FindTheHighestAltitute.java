package assignments.Arrays;
//https://leetcode.com/problems/find-the-highest-altitude/
public class FindTheHighestAltitute {
    public int largestAltitude(int[] gain) {
        int net=0;
        int[] res = new int[gain.length+1];
        res[0] = 0;
        for(int i=0;i<gain.length;i++){
            net = net + gain[i];
            res[i+1] = net;
        }
        int max =0;
        for(int i=0;i<res.length;i++){
            if(max<res[i]){
                max = res[i];
            }
        }
        return max;

    }
}
