package searching;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Please enter the array:");
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the element you want to search :");
        int k = sc.nextInt();
        int res = linearSearch(arr,k);
        if(res != -1){
            System.out.println("Value present at index :"+res);
        }else{
            System.out.println("Element not present");
        }

    }

    static int linearSearch(int[] arr,int k){
        for(int i=0; i< arr.length; i++){
            if(arr[i]==k){
                return i;
            }

        }
        return -1;


    }
}
