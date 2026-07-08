package searching;

import java.util.Scanner;

public class searchinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int target = sc.nextInt();
        System.out.println("Enter the range you want to search in");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int res = searchinrange(arr,target,start,end);
        if(res != -1){
            System.out.println("Number present at index :"+res);
        }else{
            System.out.println("Number not present");
        }
    }
    static int searchinrange(int[] arr,int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for(int index=start;index<end;index++){
            if (arr[index]==target){
                return index;
            }

        }
        return -1;
    }
}
