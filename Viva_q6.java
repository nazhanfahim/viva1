/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva_q6;
import java.util.Scanner;

/**
 *
 * @author phuax
 */
public class Viva_q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        

        int score;
        int highest = Integer.MIN_VALUE;
        int sec_highest = Integer.MIN_VALUE;
        int sum = 0, count_highest = 1, count_sec_highest = 1;
        boolean negative = false;
        
        System.out.print("Enter numbers: ");
        
        while (true) {
            //ask for score until get 0
            score = s.nextInt();
            if (score == 0) {
                break;
            }
            else {
                sum += score;
            }
            
            //highest score & sec highest
            if (score > highest) {
                //assign the 'old highest' to sec_highest
                sec_highest = highest;
                count_sec_highest = count_highest;
                highest = score;
                count_highest = 1;
            }
            else if (score == highest) {
                count_highest++;
            }
            else if (score > sec_highest) {
                sec_highest = score;
                count_sec_highest = 1;
            }
            else if (score == sec_highest) {
                count_sec_highest++;
            }
            
            //check any negative score
            if (score < 0) {
                negative = true;
            }
        }
        
        //print summary
        System.out.println("The largest number is " + highest);
        System.out.println("The occurence count of the largest number is " + count_highest);
        System.out.println("The second-largest number is " + sec_highest);
        System.out.println("The occurence count of the second-largest number is " + count_sec_highest);
        System.out.println("The total sum of all numbers is " + sum);
        if (negative == true) {
            System.out.println("Negative number(s) were entered.");
        }
        else if (negative == false) {
            System.out.println("No negative number was entered.");
        }
        
    }
    
}
