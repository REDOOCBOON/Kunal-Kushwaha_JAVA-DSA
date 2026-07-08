package searching;

import java.util.Arrays;
import java.util.Scanner;

public class searchinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Madharchod";
        char target = 'd';
        System.out.println(searchinthestring(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println();
        System.out.println(stringtochararraycheck(name,target));
    }
    static boolean searchinthestring(String str, char target){
        if(str.length()==0){
            return false;

        }
        for (int i = 0; i < str.length(); i++) {
            if(target== str.charAt(i)){
                return true;
            }

        }
        return false;
    }
    static boolean stringtochararraycheck(String str,char target){
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

}
