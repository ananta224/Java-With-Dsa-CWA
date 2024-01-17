package com.ananta;

public class String_Practice {
    public static boolean palindomCheck(String string){
        for (int i=0;i< string.length()/2;i++){
            int n= string.length();
            if (string.charAt(i)!=string.charAt(n-1-i)){
                //not palindrom
                return false;
            }
        }
        return true;
    }
    public static float getShortestPath(String path){
        int x=0,y=0;
        for (int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //North
            if (dir=='N'){
                y++;
            //South
            } else if (dir=='S') {
                y--;
            }
            //West
            else if (dir=='W'){
                x--;
            //East
            } else {
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
//        String path="WNEENESENNN";
//        System.out.println(getShortestPath(path));
        String s1="Ananta";
        String s2="Ananta";
        String s3=new String("Ananta");
        if (s1==s2){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
        if (s1.equals(s3)){
            System.out.println("This is equal");
        }else {
            System.out.println("This is not equal");
        }
    }
}
