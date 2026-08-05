package assignments.Arrays;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String s) {
        boolean[] seen = new boolean[26]; // track of the alphabets
        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                seen[c-'a'] = true;
            }
        }
        for(boolean b : seen){
            if(!b) return false;
        }
        return true;

    }
}
