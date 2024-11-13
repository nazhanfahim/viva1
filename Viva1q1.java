/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.viva1q1;
import java.util.*;
/**
 *
 * @author Dell
 */
public class Viva1q1 {

    public static void main(String[] args) {
    Scanner keyboard=new Scanner(System.in);
    int num,sum;
        System.out.print("Enter a number: ");
        num=keyboard.nextInt();
        
        sum=(num/10)+(num%10);
        while(sum>9){
            sum=(sum/10)+(sum%10);
            if (sum<10){
            break;
            }
        }
         System.out.println("Sum of digits until single digit: "+sum);
        }
         
}
