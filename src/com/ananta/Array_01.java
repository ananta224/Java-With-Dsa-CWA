package com.ananta;

import java.util.*;
/* class Array_01 {
    public static boolean getOutput(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println("Array contains duplicate: "+getOutput(nums));
    }
} */

/* public class Array_01 {
    private int SearchElement(int[] arr, int target, int left, int right) {
        // not found
        if (left > right)
            return -1;
        // Avoid overflow Same as ((Left+right)/2)
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid; // found element
        } else {
            // if left half sorted
            if (arr[mid] >= arr[left]) {
                // if key is in left half
                if (arr[left] <= target && target <= arr[mid])
                    return SearchElement(arr, target, left, mid - 1);
                else
                    return SearchElement(arr, target, mid + 1, right);
            }

            else {
                // if the right half is sorted
                // if key is in the right half
                if (arr[mid] <= target && target <= arr[right]) {
                    return SearchElement(arr, target,mid+1,right);
                } else {
                    return SearchElement(arr, target, left, mid - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        Array_01 search = new Array_01(); // Create an instance of the class
        int result = search.SearchElement(arr, target, 0, arr.length - 1); // Call the search method
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
} */
//Question 3
/* public class Main {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0; // Not enough data to make a profit
        }

        int buy = prices[0]; // Initialize the buy price to the first day's price
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i]; // Update the buy price if we find a lower price
            } else {
                int potentialProfit = prices[i] - buy;
                if (potentialProfit > profit) {
                    profit = potentialProfit; // Update the maximum profit if a better selling price is found
                }
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println(prices.length);
    }
} */

//Question 4
/* public class ArrayCC {
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
} */

//Question 5

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_01 {

    public List<List<Integer>> Array_01(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate values for the first element
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate values for the second element
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate values for the third element
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Array_01 main = new Array_01();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = main.Array_01(nums);
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
