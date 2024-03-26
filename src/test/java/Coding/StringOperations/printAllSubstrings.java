package Coding.StringOperations;

public class printAllSubstrings {
    public static void main(String [] args){
        String r = "You";

        for(int i=0; i<r.length();i++){
            for(int j= i+1; j < r.length(); j++){
                System.out.println(r.substring(i,j));
            }
        }
    }
}
