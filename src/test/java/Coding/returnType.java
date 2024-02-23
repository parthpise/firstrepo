package Coding;

public class returnType {
    int bars(int s){
        System.out.println("Method with int as return type");
        return s;
    }
 public static void main(String[] args){
        returnType a = new returnType();
       // a.bars(4);
       int h=  a.bars(3);
        System.out.println(h);
 }
}
