package com.ananta;

import java.util.Scanner;

public class Strings {
    public static void printChar(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println(" ");
    }
    public static void Strings(){
        char ch[] = {'a', 'b', 'c'};
        String str=new String("Hello");
        System.out.println(ch);
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println(name);
//        Strings();
        String firstName="Ananta";
        String lastName="Sahoo";
        String fullName = firstName+" "+lastName;
        printChar(fullName);
    }
}
