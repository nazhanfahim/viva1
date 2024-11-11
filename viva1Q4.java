/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bla;
import java.util.*;


/**
 *
 * @author User
 */
public class viva1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int optionmainmenu,optionpizza,optiondrinks, optiondessert, total; 
        double newtotal;
        total=0;
        newtotal=0;
        int counterpizza,counterdrinks,counterdessert;
        counterpizza=0;
        counterdrinks=0;
        counterdessert=0;
        
        Scanner k = new Scanner(System.in);
        while(true){
            
        System.out.println("Welcome to Maroni's Pizza!");
        System.out.println("1. Pizza");
        System.out.println("2. Drinks");
        System.out.println("3. Dessert");
        System.out.println("4. CHECKOUT");
        System.out.println("");
        System.out.print("Pick an option:");   
        
        optionmainmenu=k.nextInt();
        while(optionmainmenu==1){
            System.out.println("PIZZA");
                     System.out.println("1. Chicken Peperoni=RM15");
                     System.out.println("2. Chicken Supreme=RM18");
                     System.out.println("3. Vegan Indulgence=RM12");
                     System.out.println("4. Beef Delight=RM22");
                     System.out.println("5. Margherita=RM9");
                     System.out.println("6. BACK TO MAIN MENU");
                     System.out.println("");
                     System.out.print("Pls pick an option:");
                     optionpizza=k.nextInt();
                     
                     if(optionpizza==1){
                         System.out.println("You have chose Chicken Peperoni");
                         total+=15;
                         counterpizza+=1;
                         
                         
                     }
                     else if(optionpizza==2){
                         System.out.println("You have chose Chicken Supreme");
                         total+=18;
                         counterpizza+=1;
                         
                     }
                     else if (optionpizza==3){
                         System.out.println("You have chose Vegan Indulgence");
                         total+=12;
                         counterpizza+=1;
                         
                     }
                     else if (optionpizza==4){
                         System.out.println("You have chose Beef Delight");
                         total+=22;
                         counterpizza+=1;
                         
                     }
                     else if (optionpizza==5){
                         System.out.println("You have chose Margherita");
                         total+=9;
                         counterpizza+=1;
                         
                         
                     }
                     else if(optionpizza==6){
                         break;
                         
                     }
        }
        while(optionmainmenu==2){
            System.out.println("DRINKS");
            System.out.println("1. Strawberry Smoothie=RM8");
            System.out.println("2. Banana Smoothie=RM8");
            System.out.println("3. Mocktail=RM12");
            System.out.println("4. Soft Drink=RM5");
            System.out.println("5. Mineral Water=RM3");
            System.out.println("6. BACK TO MAIN MENU");
            System.out.println("");
            System.out.print("Pls pick an option:");
            
            optiondrinks=k.nextInt();
            
            if(optiondrinks==1){
                System.out.println("You have chose Strawberry Smoothie");
                total+=8;
                counterdrinks+=1;
                
            }
            else if(optiondrinks==2){
                System.out.println("You have chose Banana Smoothie");
                total+=8;
                counterdrinks+=1;
                
                
            }
            else if(optiondrinks==3){
                System.out.println("You have chose Mocktail");
                total+=12;
                counterdrinks+=1;
               
                
            }
            else if(optiondrinks==4){
                System.out.println("You have chose Soft Drink");
                total+=5;
                counterdrinks+=1;
                
                
            }
            else if(optiondrinks==5){
                System.out.println("You have chose Mineral Water");
                total+=3;
                counterdrinks+=1;
                
                
            }
            else if(optiondrinks==6){
                break;
                
            }
            
            

               
                
            }
        while(optionmainmenu==3){
               System.out.println("DESSERT");
               System.out.println("1. Tiramisu=RM7");
               System.out.println("2. Strawberry Shortcake=RM10");
               System.out.println("3. Green Jello=RM4");
               System.out.println("4. Creme Brulee=RM15");
               System.out.println("5. Raspberry Pie=RM20");
               System.out.println("6. BACK TO MAIN MENU");
               
               System.out.println("");
               System.out.print("Pls pick an option:");
               
               optiondessert=k.nextInt();
                
               if(optiondessert==1){
                   System.out.println("You have chose Tiramisu");
                   total+=7;
                   counterdessert+=1;
                    
                }
               else if(optiondessert==2){
                   System.out.println("You have chose Strawberry Shortcake");
                   total+=10;
                   counterdessert+=1;
               }
               else if(optiondessert==3){
                   System.out.println("You have chose Green Jello");
                   total+=4;
                   counterdessert+=1;
               }
               else if(optiondessert==4){
                   System.out.println("You have chose Creme Brulee");
                   total+=15;
                   counterdessert+=1;
               }
               else if(optiondessert==5){
                   System.out.println("You have chose Raspberry Pie");
                   total+=20;
                   counterdessert+=1;
               }
               else if(optiondessert==6){
                  break;
               }
               
        }
       
       if(optionmainmenu==4 ){
           
           if(counterpizza>=1 && counterdrinks>=1 && counterdessert>=1){
                   
            System.out.printf("Your total is:RM %.2f%n",(double)total);
            System.out.println("You've availed the One-of-each offer. You got a 20% discount!"); 
            newtotal=total*80/100.0;
            System.out.printf("Your new total is:RM %.2f%n",(double)newtotal);
            System.out.println("");
            System.out.println("Thank you for your order. Have a nice day!");
            
        }
           else{
               System.out.printf("Your total is: RM%.2f%n",(double)total);
               System.out.println("Thank you for your order. Have a nice day!");
           }
            
           break;
      
            
            
           
                   
                     
                     
                     
        }
        
       
         
        }
       
        
        
        
        }
   
        
    }
    

