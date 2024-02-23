package Coding.StringOperations;

import java.util.Arrays;

public class Anagram {
    public static void main(String [] args){
        String f = "parth";
        String s = "ahptr";

        f = f.toLowerCase();
        s = s.toLowerCase();

        if(f.length() != s.length()){
            System.out.println("The given strings are not anagrams");
        }
        else{

            char[] fArray = f.toCharArray();
            char[] sArray = s.toCharArray();

            Arrays.sort(fArray);
            Arrays.sort(sArray);

            if(Arrays.equals(fArray,sArray) == true){
                System.out.println("Given strings are anagram");
            }
            else{
                System.out.println("Given strings are not anagram");
            }
        }
    }
}
