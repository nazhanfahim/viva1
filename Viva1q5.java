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
    boolean fax;
        System.out.print("Please enter remix: ");
        in=keyboard.nextLine();
        
            out=in.replaceAll("REMIX"," ");
            
            
        
        System.out.println("original: "+out);
    }
}
