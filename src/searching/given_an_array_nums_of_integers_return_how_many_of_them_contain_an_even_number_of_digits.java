package searching;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/2057663252/

public class given_an_array_nums_of_integers_return_how_many_of_them_contain_an_even_number_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //enter the size of the array
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        //enter the array itself
        System.out.println("Enter the array :");
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("The number of even elements are:");
        System.out.println(findNumbers(nums));

        System.out.println(digits2(123321));


    }

//    static int evenornot(int[] arr){
//        int count = 0;
//        for(int index = 0; index < arr.length; index++){
//            int num = Math.abs(arr[index]); // handle negatives
//            int digits = 0;
//
//            if(num == 0){
//                digits = 1; // special case for 0
//            } else {
//                while(num != 0){
//                    num /= 10;
//                    digits++;
//                }
//            }
//
//            if(digits % 2 == 0){
//                count++; // increment only if this element has even digits
//            }
//        }
//        return count;
//    }

    // this was my trial which failed

    static int findNumbers(int[] nums){  // this method is to iterate over the array and check if even or not
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check whether the number contains even number of digits or not
    static boolean even(int num) {
        int NnumberOfdigits = digits(num);
//        if(NnumberOfdigits%2==0){
//            return true;
//        }
//        return false;
        return NnumberOfdigits%2==0;

    }

    //count the number of digits in the number
    static int digits(int num){
        if(num==0){
            return 1;

        }
        if(num<0){
            num = num* -1;
        }
        int count =0;
        while(num>0){
            count++;
            num = num /10;
        }
        return count;
    }

    static int digits2(int num) {
        if(num==0){
            return 1;

        }
        if(num<0){
            num = num* -1;
        }
        return (int)(Math.log10(num))+1;

    }

}
