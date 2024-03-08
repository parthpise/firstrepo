package Coding.StringOperations;

public class ExtractLast4characters {
    public static void main(String[] args) {
        String a = "ParthPise";
        getlastfour(a);

    }
    public static void getlastfour(String a) {
        int size = a.length();
        int counter = size-4;
        for(int i = counter; i < size; i++){
            System.out.print(a.charAt(i));
        }

    }


}
