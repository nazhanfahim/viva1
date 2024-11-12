/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.viva1q5;
import java.util.*;
/**
 *
 * @author Dell
 */
public class Viva1q5 {

    public static void main(String[] args) {
    Scanner keyboard=new Scanner(System.in);
    String in,out;
    int count;
        while(true){
        System.out.print("Please enter remix: ");
        in=keyboard.nextLine();
        
            out=in.replaceAll("REMIX"," ");
            
            count=out.split("\\s").length;
            
            if(count!=0){
                System.out.println("original:"+out);
                break;
            }
            else{
                System.out.println("Please enter a remix with at least one word in it!");
                System.out.println();
            }
    }
}
}
