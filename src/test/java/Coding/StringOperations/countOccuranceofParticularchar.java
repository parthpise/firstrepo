package Coding.StringOperations;

public class countOccuranceofParticularchar {
    public static void main(String [] args){
        String s = "Partha";
        s = s.toLowerCase();

        char [] sArray = s.toCharArray();
        int occurance = 0;
        char toFind = 'a';

        for(int i=0; i< s.length();i++){
         if(toFind == sArray[i]){
             occurance++;
         }
        }
        System.out.println("Character "+toFind+" present "+occurance+" times");

    }
}
