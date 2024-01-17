package com.ananta;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Sysntax
        // ArrayList<Integer> list = new ArrayList<Integer>(10);
        Scanner sc = new Scanner(System.in);
        // /* list.add(100);
        // list.add(101);
        // list.add(103);
        // list.add(104);
        // list.add(105); */
        // /* System.out.println(list.contains(405));
        // System.out.println(list);
        // list.set(0, 99);
        // list.remove(2);
        // System.out.println(list); */
        // for(int i=0;i<5;i++){
        // list.add(sc.nextInt());
        // }
        // for(int i=0;i<5;i++){
        // System.out.println(list.get(i));//pass index here list[index] syntax not work
        // here
        // }
        // MultiDimentional Array
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
