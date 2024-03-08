package Coding;

import java.util.Arrays;

public class Practice {
    public static void main(String [] args){
        String a = "Parth";
        String b = "Saish";

        a.toLowerCase();
        b.toLowerCase();

        if(a.length() != b.length()){
            System.out.println("Given words are not anagrams");
        }
        else{
            char[] first = a.toCharArray();
            char[] second = b.toCharArray();

            Arrays.sort(first);
            Arrays.sort(second);

            if(Arrays.equals(first,second) == true){
                System.out.println("Given words are anagrams");
            }
            else{
                System.out.println("They are not anagrams");
            }
        }
    }
}
