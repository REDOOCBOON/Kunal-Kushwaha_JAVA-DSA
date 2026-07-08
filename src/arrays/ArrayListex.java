package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //syntax
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(67);
        list.add(674);
        list.add(637);
        list.add(672);
        list.add(6257);
        list.add(657);
        list.add(2367);
        list.add(667);

        System.out.println(list.contains(6257));
        System.out.println(list.contains(43523445));

        list.set(0,99);
        list.remove(2);

        System.out.println(list);

        for(int i=0; i<5;i++){
            list.add(sc.nextInt());
        }

        //prints entire list
        for(int i=0; i<5;i++){
            System.out.println(list);
        }

        //prints the list index wise
        for(int i=0; i<5;i++){
            System.out.println(list.get(i));
        }

}}
