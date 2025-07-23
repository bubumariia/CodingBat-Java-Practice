package StringOne;
/*
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""*/

public class WithoutEnd2 {
    public static void main(String[] args) {
        WithoutEnd2 withoutEnd2 = new WithoutEnd2();
        System.out.println(withoutEnd2.withoutEnd2("hello"));
    }
    public String withoutEnd2(String str) {
        if (str.length() < 2){
            return "";
        }else {
            return str.substring(1, str.length()-1);
        }

    }
}
