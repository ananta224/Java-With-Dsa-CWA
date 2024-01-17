package com.ananta;

import java.util.Arrays;

public class String_Questions {
    //Question 1 :-> Count how many times lowercase vowels occurred in a String entered by the user.
    public static Integer CountVowel(String str){
        Integer count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    //Question 4 :-> Determine if 2 Strings are anagrams of each other.
    //What are anagrams?
    //If two strings contain the same characters but in a different order, they can be said to be anagrams.
    // Consider race and care. In this case, race's characters can be formed into a study, or care's characters
    // can be formed into race. Below is a java program to check if two strings are anagrams or not.
 public  static void anagramed(){
     String str1= "earth";
     String str2 = "heart";
     //Convert Strings to lowercase. Why? so that we don't have to check separately for lower & uppercase.
    str1.toLowerCase();
    str2.toLowerCase();
    if (str1.length()==str2.length()){
        //String to convert character Array
        char[] str1chararray=str1.toCharArray();
        char[] str2chararray=str2.toCharArray();
        //Sort the Character Array
        Arrays.sort(str1chararray);
        Arrays.sort(str2chararray);
        boolean result = Arrays.equals(str1chararray,str2chararray);
        if (result){
            System.out.print(str1+" and "+str2+" both are anagram.");
        }
        else {
            System.out.print(str1+" and "+str2+" both are not anagram.");
        }
    }else {
        System.out.print(str1+" and "+str2+" both are not anagram.");
    }
 }
    public static void main(String[] args) {
//        String str = "AEIOU";
//        System.out.println(CountVowel(str));
//        String newstr= "ShradhaDidi";
//        String newstr1="ApnaCollege";
//        String newstr2="ShradhaDidi";
//        System.out.println(newstr.equals(newstr1)+" "+newstr.equals(newstr2));
//        String str = "ApnaCollege";
//        System.out.println(str.replace("1",""));
        anagramed();
    }
}
