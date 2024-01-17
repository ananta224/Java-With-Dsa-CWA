package com.ananta;

import java.util.*;
/* public class ArrayCC {
    public static void update(int marks[],int nonChange){
        for(int i=0;i< marks.length;i++){
            nonChange =10;
            marks[i]=marks[i]+1;
        }

    }
    public static void main(String[] args) {

       int marks[]={97,98,99};
       int nonChange=5;
       update(marks, nonChange);
       //print the marks
       for(int i=0;i< marks.length;i++){
        System.out.print(marks[i]+" ");
       }
       System.out.println();
    }
} */

//Liner Search
/* import java.util.*;
public class ArrayCC{
   public static int LinearSearch(int number[],int key){
       for(int i=0;i<number.length;i++){
           if(number[i]==key){
               return i;
           }
       }
       return -1;
   }
   public static void main(String args[]){
       int number[]={1,5,4,8,79,2,4,5};
       int key=79;
      int index = LinearSearch(number, key);
       if(index==-1){
           System.out.println("NOT FOund!");
       }
       else{
           System.out.println("Number found in Index :"+index);
       }
   }
} */

//Find the largest and smallest number
/* public class ArrayCC {
    public static int GetLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
    System.out.println("\nThe Largest Number is: " + smallest);   
     return largest;
    }

    public static void main(String[] args) {
        int number[] = { 10, 5, 9, 74, 2 };
        System.out.println("\nThe Largest Number is: " + GetLargest(number));
    }
} */

//Binary Search
/* public class ArrayCC {
    public static int GetLargest(int number[],int key) {
        int start=0; int end=number.length-1;
        while((start<=end)){
            int mid=(start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=start+1;
            }
            else{
                end=end-1;}
            }
            return-1;
        }

    

    public static void main(String[] args) {
        int number[] = { 2,4,6,8,10,78};
        int key =78;
        System.out.println("The the key index is :"+GetLargest(number,key));
    }
} */

//Reverse an Array
/* public class ArrayCC {
    public static void reverse(int number[]) {
        int first=0,last=number.length-1;
        while(first<=last){
            //swap
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
        }
    public static void main(String[] args) {
        int number[] = { 2,4,6,8,10,78};
        reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println("");
    }
} */

//Print Pair of array.
/* public class ArrayCC {
    public static void pairArray(int number[]) {
        int tp=0;
       for(int i=0;i<number.length;i++){
        int curr=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pair is :"+tp);
    }
    public static void main(String[] args) {
        int number[] = { 2,4,6,8,10,78};
        pairArray(number);
    }
} */

//Print the sub array

/* public class ArrayCC {
    public static void SubArray(int number[]) {
        int ts = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {// printing statement
                    System.out.print(number[k]); // Subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total Subarray is : " + ts);
    }

    public static void main(String[] args) {
        int number[] = { 2,4,6,8,10,12};
        SubArray(number);
    }

} */

/* public class ArrayCC {
    public static void MaxSubArray(int number[]) {
       int CurrSum=0;
       int MaxSum=Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                CurrSum=0;
                for (int k = start; k <= end; k++) {// printing statement
                //Subarray Sum
                    CurrSum +=number[k]; 
                }
                System.out.println(CurrSum);
                if(MaxSum<CurrSum){
                    MaxSum=CurrSum;
                }
            }
        }
        System.out.println("The MAxSum Is  : " + MaxSum);
    }

    public static void main(String[] args) {
        int number[] = { 2,4,6,8,10};
        MaxSubArray(number);
    }

} */
/* //Trapped Rainwater
public class ArrayCC {
public static int trappingRainWater(int height[]){
    int n= height.length;
    //Colculate the left max boundry -> Array
    int leftMax[]= new int[n];//array create
    leftMax[0]=height[0];
    for (int i = 1; i < n; i++) {
        leftMax[i]=Math.max(height[i], leftMax[i-1]);
    }
    //Colculate the right max boundry -> Array
    int rightMax[]=new int [n];//array create
    rightMax[n-1]=height[n-1];
    for (int i = n -2 ; i >= 0; --i){
        rightMax[i] = Math.max(height[i],rightMax[i+1]);
    }
    int trappedWater = 0;
    for (int i = 0; i < n; ++i) {
        //waterLevel=min(leftMax bound ,rightMax bound)
        int waterLevel = Math.min(leftMax[i], rightMax[i]);
        //Calculate TrappedWater
        trappedWater=trappedWater+(waterLevel-height[i]);
    }
    return trappedWater;

}

    public static void main(String[] args) {
        int height[]= {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater(height));
    }
}
 */

//Buy and Sell The Stock

/* public class ArrayCC {
    public static int BuyandSellStock(int SellPrice[]) {
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for (int i = 0; i < SellPrice.length; i++) {
            if (BuyPrice < SellPrice[i]) {
                int profit = SellPrice[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit, profit);
            } else {
                BuyPrice = SellPrice[i];
            }
        }
        return MaxProfit;
    }

    public static void main(String[] args) {

            int SellPrice[]={7,1,5,3,6,4};
            System.out.println(BuyandSellStock(SellPrice));
    }

} */

// public class ArrayCC{
//     public static void main(String[] args) {
//        /*  int arr[] = new int[5];
//        for(int i=0;i<5;i++){
//            arr[i]=sc.nextInt();
//         } */
//         /* for(int num:arr)
//         System.out.print(num +" "); */
//         Scanner sc = new Scanner(System.in);
//         String str[] = new String[4];
//         for(int i=0;i<str.length;i++){
//             str[i]=sc.next();
//         }
//         // System.out.println(Arrays.toString(arr));
//         str[1]="Ananta";
//         System.out.println(Arrays.toString(str));

//     }
// }

/**
 * ArrayCC
 */
public class ArrayCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        //Input of the 2D Array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //Output of the 2D Array
/*         for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        } */
       /*  for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        } */
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }

}