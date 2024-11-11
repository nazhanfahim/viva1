package com.mycompany.v1q2;
import java.util.Scanner; //load Scanner Class into java program
public class V1q2 {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int nnn,aaa,bbb; //initialize three integers that will be used for the operations
        int step=0; //start the count for steps needed
        
        nnn=kb.nextInt(); // input the number nnn
        
        while(nnn<1||nnn>Math.pow(10,9)){ //use while for looping until we get the integer that follows the constraint
            System.out.println("error"); 
            nnn=kb.nextInt();
        }
        
        aaa=kb.nextInt();
        
        while(aaa<1||aaa>nnn){ //use while for looping until we get the integer that follows the constraint
            System.out.println("error");
            aaa=kb.nextInt();
        }
        
        bbb=kb.nextInt();
        
        while(bbb<1||bbb>Math.pow(10,5)){ //use while for looping until we get the integer that follows the constraint
            System.out.println("error");
            bbb=kb.nextInt();
        }
        
        while(nnn%bbb==0){ //check if n is divisible by b
            nnn/=bbb; //divide n with b
            step++; //+1 step if there is a division occurs
        }
        
        while(nnn>1){ //as long as n is larger than 1 the subtraction continues
            nnn-=aaa;
            step++; //+1 step if there is a subtraction occurs
        }
        
        /**while(true){   alternative
            nnn-=aaa;
            step++;
            if(nnn<=1){ immediately end the loop if its smaller than one
                break;
            }
        }*/
        
        if(nnn==1){ //if its possible to have 1 in the end, print the number of steps
            System.out.println(step);
        }
        else{
            System.out.println("-1");
        }
        }
        }