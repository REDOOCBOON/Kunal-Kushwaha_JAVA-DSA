package searching;

import java.util.Scanner;

public class findMaaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = searchMax(arr);
        System.out.println("The maximum number present in the array is "+max);
        int min = searchMin(arr);
        System.out.println("The minimum number present in the array is "+min);
    }
    static int searchMax(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int res = arr[0];
        for(int index = 1;index<arr.length;index++){
            if(res<arr[index]){
                res = arr[index];

            }
            return res;
        }
        return -1;

    }
    static int searchMin(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int res = arr[0];
        for(int index = 1;index<arr.length;index++){
            if(res>arr[index]){
                res = arr[index];

            }
            return res;
        }
        return -1;

    }
}
