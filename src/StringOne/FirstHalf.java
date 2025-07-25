package StringOne;

/*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"*/

public class FirstHalf {
    public static void main(String[] args) {
        FirstHalf firstHalf = new FirstHalf();
        System.out.println(firstHalf.firstHalf("HelloThere"));
    }
    public String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }
}
