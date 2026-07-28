package strings;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str="kayaks";
        System.out.println(isPalindrome(str));

        String str1 = "UjjwjjU";
        System.out.println(ispalindromeeasy(str1));
    }
    static boolean isPalindrome(String str){
        if(str ==null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end){
                return false;
            }

        }
        return true;
    }
    static boolean ispalindromeeasy(String str){
        String og = str;
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reverse = sb.toString();
        if(og.equalsIgnoreCase(reverse)){
            return true;
        }
        return false;
    }

}
