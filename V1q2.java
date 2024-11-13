package com.mycompany.v1q2;
import java.util.Scanner; //load Scanner Class into java program
public class V1q2 {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int nnn,aaa,bbb; //initialize three integers that will be used for the operations
        int step=0; //start the count for steps needed
        
        System.out.println("Enter a number, n (1-1000000000)");
        nnn=kb.nextInt(); // input the number nnn
        
        while(nnn<1||nnn>Math.pow(10,9)){ //use while for looping until we get the integer that follows the constraint
            System.out.println("Error. Please enter another number."); 
            nnn=kb.nextInt();
        }
        System.out.println("Enter a number, a (1-n)");
        aaa=kb.nextInt();
        
        while(aaa<1||aaa>nnn){ //use while for looping until we get the integer that follows the constraint
            System.out.println("Error. Please enter another number.");
            aaa=kb.nextInt();
        }
        System.out.println("Enter a number, b (2-100000)");
        bbb=kb.nextInt();
        
        while(bbb<1||bbb>Math.pow(10,5)){ //use while for looping until we get the integer that follows the constraint
            System.out.println("Error. Please enter another number.");
            bbb=kb.nextInt();
        }
        
        while (true){ //while loop for operations
            if(nnn%bbb==0){ //check if n is divisible by b
                nnn/=bbb; //divide n with b
                step++; //+1 step if there is a division occurs
                if(nnn<=1){ 
                    break; //stops the while loop if its already 1 or less
                }
            }
            else{
                nnn-=aaa; //n minus a
                step++; //+1 step if there is a subtraction occurs
                if(nnn<=1){
                    break; //stops the while loop if its already 1 or less
                }
            }
            
        }
        
        if(nnn==1){ //if its possible to have 1 in the end, print the number of steps
            System.out.println("Step(s): "+step);
        }
        else{
            System.out.println("-1");
        }
        }
        }
