package Coding;

public class string2 {
  void Palindrome(String S){
      StringBuffer sbf = new StringBuffer(S);
      sbf.reverse();

      String rev = sbf.toString();
      System.out.println(rev);
  }

    public static void main(String[] args) {
        int a;
        a=7;
        {
            int b = 9;
            System.out.println(a+""+b);
        }

    }
// here the output will be 79 because the string has ability to convert int into string when they are in addition operations.
}