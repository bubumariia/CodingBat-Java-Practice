package StringOne;
/*
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"*/

public class ComboString {
    public static void main(String[] args) {
        ComboString comboString = new ComboString();
        System.out.println(comboString.comboString("Hello", "Hi"));
    }
    public String comboString(String a, String b) {
        if(a.length() > b.length()){
            return b+a+b;
        }
        else{
            return a+b+a;
        }
    }
}
