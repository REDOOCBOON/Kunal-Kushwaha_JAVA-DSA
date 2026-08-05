package assignments.Arrays;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.ArrayList;
import java.util.List;

public class KidWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int pmax=0;
        //boolean[] res = new boolean[candies.length];
        for(int i=0;i<candies.length;i++){
            if(pmax<candies[i]){
                pmax = candies[i];
            }
        }

        List<Boolean> res = new ArrayList<>();
        for(int i =0; i<candies.length;i++){
            candies[i] = candies[i] + extraCandies;
            if(candies[i] >= pmax){
                //res[i] = true;
                res.add(true);
            }else{
                //res[i] = false;
                res.add(false);
            }

        }
        return res;


    }

}
