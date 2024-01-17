package com.ananta;

import java.util.Scanner;

public class TCS_Vita_Mock {

    public static int leastno(int[] arr){
        int n=arr.length;
        int mini=2147483647;
        int i=0;
        while (i<n) {
            mini=Math.min(mini,arr[i]);
            i++;
        }
        return mini;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n <= 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void checkPrime(int[] arr) {
        int smallest = leastno(arr);
        int product = 1;

        for (int k : arr) {
            if (k != smallest) {
                product *= k;
            }
        }

        for (int candidate = smallest + 1; candidate < product; candidate++) {
            boolean valid = true;

            for (int k : arr) {
                if (k != smallest && candidate % k != smallest) {
                    valid = false;
                    break;
                }
            }

            if (valid && isPrime(candidate)) {
                System.out.println(candidate);
                return;
            }
        }

        System.out.println("None");
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]= sc.nextInt();
        }
        checkPrime(arr);

    }
}