package com.ananta;

import java.util.Scanner;
public class Partten {
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
             
            for(int j=1; j<=2 * (n-i); j++){
                System.out.print(" ");
            }
            //Ananta Sahoo ata karichi
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();//ata bi mu lekhichi
        }
            //Aeita totally lekhinathilu
            for(int i=n; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                
                for(int j=1; j<=2 * (n-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
