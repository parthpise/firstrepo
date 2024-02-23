package Coding;

public class EvenOddcharacter {
    // In this example, the characters at odd index should be in capital letters
    public static void main(String [] args){
        String s = "selenium";
        String d ="";
        for(int i=0; i<=s.length()-1;i++){
           s.toLowerCase();
            if(i%2 !=0){
                d = d + Character.toUpperCase(s.charAt(i));
            }
            else{
                d = d + s.charAt(i);
            }
        }
        System.out.println(d);


    }
}
