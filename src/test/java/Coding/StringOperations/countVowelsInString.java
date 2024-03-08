package Coding.StringOperations;

public class countVowelsInString {
    public static void main(String[] args) {
        String h = "Parthaeiouio";
        h.toLowerCase();

        int count = 0;
        for(int i=0; i < h.length(); i++){
            if (h.charAt(i) == 'a' || h.charAt(i) == 'e' || h.charAt(i) == 'i' || h.charAt(i) == 'o' || h.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("There are total "+count+ " vowels in string");
    }
}
