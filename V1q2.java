package com.mycompany.v1q2;
import java.util.Scanner; //load Scanner Class into java program
public class V1q2 {

   public static void main(String[] args) {
       
         
        Scanner s= new Scanner(System.in);
        int flag=0, count=0, i,list=0,sum =0,m;
        int product=1;
        boolean productOverflow = false, comma=true;
        
        System.out.print("enter a digit: ");
        int digit = s.nextInt();
       
        if(digit<=1)
            System.out.println("Please enter integer greater than 1");
    else{
              
        for ( m=2;m<=digit/2;m++){
            if(digit%m==0) {  
                flag=1;
                break;
            }
        }
            if(flag==0){
                System.out.println(digit+" is a prime number");
                return;
            }else{
                System.out.println(digit+" is a not prime number");
            }
            
        for (  i=1;i<=digit; i++){
            if ( digit%i ==0)
                count++;}
                 System.out.print("It has "+count+" factors");
         
            System.out.println("\nThe factors is : ");  
        for (  i=1;i<=digit; i++){
            if ( digit%i ==0){
             System.out.print(i);
                if(i<digit)
                    System.out.print(", ");
                sum+=i;
            }
        }    
             for (  i=1;i<=digit; i++){
               if ( digit%i ==0)  
             if(product>=Integer.MAX_VALUE/i){
                    productOverflow=false;
                    break;}
                      else
                          product*=i;
            }
        
                System.out.print("\nThe sum of factors is : " + sum);
           if (productOverflow)
                System.out.println("\nThe product is too large to display");
               else
                    System.out.println("\nThe product is: "+ product);
          
            if(sum-digit==digit){
                System.out.println(digit+" is a perfect number");
            }   else{
                    System.out.println(digit+" is not a perfect number");
            }
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
