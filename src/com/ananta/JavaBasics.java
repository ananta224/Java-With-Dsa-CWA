package com.ananta;

import java.util.*;

/* import java.util.Scanner;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income <= 500000) {
            tax = 0;
        } else if (income >= 500000 && income <= 1000000) {
            tax = (int)(income * 0.2);
        } else {
            tax = (int)(income * 0.3);
        }
        System.out.print("Your tax is :" + tax);
    }

} */

// Ternary Operator

/* public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String Num = (num % 2 == 0) ? "even" : "odd";
        System.out.println(Num);
    }
} */

/* public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count <= 100) {
            count++;
            System.out.println(count);
           
        }
    }

} */

/* public class JavaBasics {
    public static void main(String[] args) {
        int num = 251103;
        while (num>0) {
          int  last_digit = num%10;
          num = num/10;
          System.out.print(last_digit+" ");
        }
    }

} */

/* public class JavaBasics {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("Break Loop");
                break;
            }
            System.out.println(i);
        }
    }

} */

/* public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Entered number is : ");
            int n = sc.nextInt();
            if (n % 10 == 0){
                break;
            }
                System.out.println(n);
        } while (true);

    }

} */

/* public class JavaBasics {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3 || i == 2 || i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
} */

/**
 * Check wheather it is prime or not.
 */
/*
 * public class JavaBasics {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * 
 * if (n == 2) {
 * System.out.println("n is prime");
 * }
 * else {
 * 
 * boolean isPrime = true;
 * for (int i = 2; i <=Math.sqrt(n); i++) {
 * if (n % i == 0) {
 * isPrime = false;
 * }
 * }
 * 
 * if (isPrime == true) {
 * System.out.println("n is prime");
 * } else {
 * System.out.println("n is not prime");
 * }
 * }
 * 
 * }
 * 
 * }
 */

// Partten Question Solve

/*
 * public class JavaBasics {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int i, j;
 * int n = sc.nextInt();
 * for (i = 1; i <= n; i++) {
 * for (j = 1; j <= (n-i+1); j++) {
 * System.out.print(" * ");
 * }
 * System.out.println();
 * }
 * }
 * }
 */

// Half number Pyramid
/*
 * public class JavaBasics {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int i,num;
 * int n = sc.nextInt();
 * for (i = 1; i <= n; i++) {
 * for (num = 1; num <= i; num++) {
 * System.out.print(num);
 * }
 * System.out.println();
 * }
 * }
 * }
 */

// Print charecter partten
/*
 * public class JavaBasics {
 * public static void main(String[] args) {
 * Scanner sc= new Scanner(System.in);
 * int n=sc.nextInt();
 * char ch='A';
 * for(int i =1; i<=n;i++){
 * for(int j=1;j<=i;j++){
 * System.out.print(ch);
 * ch++;
 * }
 * System.out.println();
 * }
 * }
 * }
 */

// Functions and Methods

/*
 * public class JavaBasics {
 * public static void printHello() {
 * System.out.println("Hello i'm Ananta");
 * System.out.println("Hello i'm Ananta");
 * System.out.println("Hello i'm Ananta");
 * }
 * 
 * public static void main(String[] args) {
 * printHello();
 * }
 * }
 */

// Parameter Function
/* public class JavaBasics {
    public static int CalculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);
        System.out.println("The sum is : " + sum);
    }
} */

//Call by Value
/**
 * JavaBasics
 */
/* public class JavaBasics {
    public static int changeA(int a){
        a =10; //a =10;
        //int b=a;
        return a;//return a;
    }

    public static void main(String[] args) {
        int a=5;//int a=5;
        changeA(a);//int b=changeA(a);
        System.out.println(a);//System.out.println(b);
    }
} */

//Factoril of N number.
/**
 * JavaBasics
 * public class JavaBasics {
 * public static int fectorial(int n){
 * int f=1;
 * for(int i=1;i<=n;i++){
 * f=f*i;
 * }
 * return f;
 * }
 * public static void main(String[] args) {
 * System.out.println(fectorial(7));
 * }
 * }
 */

// Binomialcofficent using fuction

/*
 * public class JavaBasics {
 * public static int fectorial(int n){
 * int f=1;
 * for(int i=1;i<=n;i++){
 * f=f*i;
 * }
 * return f;
 * }
 * public static int BiCoff(int n , int r){
 * int fact_n=fectorial(n);
 * int fact_r=fectorial(r);
 * int fact_nmr=fectorial(n-r);
 * int BinomialCoff=fact_n/(fact_r*fact_nmr);
 * return BinomialCoff;
 * }
 * public static void main(String[] args) {
 * System.out.println(BiCoff(7,2));
 * }
 * }
 */

// Check prime or not
/* public class JavaBasics {

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void primeInRange(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        primeInRange(100);
    }
} */

//Binary to Decimal Convert
/**
 * JavaBasics
 */
public class JavaBasics {
    public static void binTodec(int binNum) {
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow ++;
            binNum = binNum / 10;
        }
        System.out.println("The decimal number of " + binNum + " is: " + decNum);
    }

    public static void main(String[] args) {
        binTodec(101);
    }
}