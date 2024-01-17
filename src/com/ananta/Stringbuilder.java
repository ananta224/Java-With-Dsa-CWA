package com.ananta;

public class Stringbuilder {
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    //Question 5
    public static StringBuilder strCompression(String str){
        StringBuilder newStr = new StringBuilder();
        for (int i=0;i<str.length();i++){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count>1){
                newStr.append(count.toString());
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("");
//        for (char ch='a'; ch<='z';ch++){
//            sb.append(ch);
//        }
//        System.out.println(sb);
        String str = "abcd";
        System.out.println(strCompression(str));
    }
}
