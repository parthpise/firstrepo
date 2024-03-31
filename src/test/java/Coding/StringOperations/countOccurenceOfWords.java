package Coding.StringOperations;

import java.util.HashMap;

public class countOccurenceOfWords {
    public static void main(String[] args) {
        String s = "Believe-in-yourself-please-believe-please-please-believe";
        s= s.toLowerCase();

        String [] eachword = s.split("-");

        HashMap<String,Integer> countwords = new HashMap<>();

        for(String q : eachword){
             if(countwords.containsKey(q)){
                 countwords.put(q,countwords.get(q)+1);
             }
             else{
                 countwords.put(q,1);
             }
        }
        System.out.println(countwords);

    }


}
