package Coding;

public class EvenOdd {

    //This is using Bitwise operator
    /*
    Its as below
    0 & 0 = 0
    1 & 0 = 0
    0 & 1 = 0
    1 & 1 = 0
     */
    public static void main(String [] args){
           int y = 98;
           if((y & 1) == 0){
               System.out.println("Its Even number");
           }
           else{
               System.out.println("Its odd number");
           }
    }
}
