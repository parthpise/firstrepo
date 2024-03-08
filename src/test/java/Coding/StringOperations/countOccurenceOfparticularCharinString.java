package Coding.StringOperations;

import java.util.HashMap;

public class countOccurenceOfparticularCharinString {
    public static void main(String[] args) {
        String a = "aaaaasssssddddggga";

        char [] s = a.toCharArray();

        HashMap<Character,Integer>  countChar = new HashMap<>();

        for(char b : s){
            if(countChar.containsKey(b)){
                countChar.put(b,countChar.get(b)+1);
            }
            else{
                countChar.put(b,1);
            }
        }
        System.out.println(countChar);

    }
}
