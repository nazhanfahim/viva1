/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package viva.viva1_qs3;

import java.util.Scanner;

/**
 *
 * @author tenzo
 */
public class VIVA1_QS3 {

    
    public static void main(String[] args) {
       
         
        Scanner s= new Scanner(System.in);
        int flag=0, count=0, i,list=0;
        long sum =0,m, product=1;
        boolean productOverflow = false, comma=true;
        
        System.out.print("enter a digit: ");
        long digit = s.nextLong();
       
        if(digit<=1)
            System.out.println(digit+" is not a prime number");
    else{
              
        for ( m=2;m<=digit/2;m++){
            if(digit%m==0) {
                System.out.println(digit+" is a not prime number");
                flag=1;
                break;
            }
        }
            if(flag==0)
                System.out.println(digit+" is a prime number");
            
        for (  i=1;i<=digit; i++){
            if ( digit%i ==0)
                count++;}
                    System.out.print("It has "+count+" factors");
         
              System.out.println("\nThe factors is : ");  
        for (  i=1;i<=digit; i++){
            if ( digit%i ==0){
                System.out.print(i);
                if(i<digit){
                    System.out.print(", ");} 
            sum+=i; 
                if(product>=Long.MAX_VALUE/i){
                    productOverflow = true;
                        break;}
                        else
                          product*=i;
            }
        }
           
              System.out.print("\nThe sum of factors is : " + sum);
            if (productOverflow)
                System.out.println("\nThe prouct is too large to display");
                else
                    System.out.println("\nThe product is: "+ product);
          
            if(sum-digit==digit){
                System.out.println(digit+" is a perfect number");
            }   else{
                    System.out.println(digit+" is not a perfect number");
            }
            
          if( digit%m==0 || digit<=1 ){ 
            System.out.println("Prime numbers between 2 and " + digit+" is :");
        while(list<digit){
            flag=0;
            for ( m=2;m<=list/2;m++){
                if(list%m==0) {
                    flag=1;
                        break;}}
            if(flag==0 && list>1){
                if(!comma){
                System.out.print(", ");
            }
                System.out.print(list);
                comma=false;
            }
                list++;} 
          } 
        }
    }
}
        
          
        
    
         
        
        
  

