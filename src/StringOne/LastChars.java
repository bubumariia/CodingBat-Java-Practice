/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"*/

public class LastChars {
    public static void main(String[] args) {

    }
    public String lastChars(String a, String b) {
        String output = "";
        if (a.isEmpty()){
            output += "@";
        } else if (b.isEmpty()) {
            output += "@";

        }else {

        }
    }
}
