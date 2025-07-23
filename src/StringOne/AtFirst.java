/*
Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"*/

public class AtFirst {
    public static void main(String[] args) {
        AtFirst atFirst = new AtFirst();
        System.out.println(atFirst.atFirst("hello"));
        System.out.println(atFirst.atFirst("hi"));
        System.out.println(atFirst.atFirst("h"));
        System.out.println(atFirst.atFirst(""));



    }
    public String atFirst(String str) {
        if (str.length() < 2){
            String added = str;
            for(int i=str.length(); i <2; i++){
                added += "@";
            }
            return added;
        }else{
            return str.substring(0,2);
        }
    }
}
