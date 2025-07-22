package StringOne;
/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"*/

public class ExtraEnd {
    public static void main(String[] args) {
        ExtraEnd extraEnd = new ExtraEnd();
        System.out.println(extraEnd.extraEnd("lololo"));
    }
    public String extraEnd(String str) {
        String result = "";
        for(int i=0; i<3; i++){
            String lastTwoCharacters = str.substring(str.length()-2, str.length());
            result+=lastTwoCharacters;
        }
        return result;

    }
}
