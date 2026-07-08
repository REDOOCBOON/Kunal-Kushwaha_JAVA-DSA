package arrays;



import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 43;
        arr[1] = 53;
        arr[2] = 63;
        arr[3] = 73;
        arr[4] = 83;
        //input using for loop
        System.out.println(arr[2]);
        System.out.println(Arrays.toString(arr));  //using Arrays class to print the elements in the format of an array

//        for(int i = 0; i < arr.length;i++){
//            arr[i]=in.nextInt();
//        }
//        for(int i = 0; i < arr.length;i++){
//            //arr[i]=in.nextInt();
//            System.out.print(arr[i]+" ");
//        }
//
//        for(int num:arr){ //for every element in the array print the element
//            System.out.println(num+" ");//here num represents element of the array
//        }
//
        // lets try to get input in the form of 1 2 3 4 5


        //when size of the array is unknown
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i<arr.length;i++) {
            // arr[i] = in.nextInt(); // this method we already know , what if of the array is unknown
            boolean add = list.add(in.nextInt());
        }
        System.out.println(list);


// same way to take the input either horizontally or vertically






        // array of objects

        String[] str = new String[4];
        for(int i = 0; i<str.length; i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "Ujjwal";
        System.out.println(Arrays.toString(str));

    }
}