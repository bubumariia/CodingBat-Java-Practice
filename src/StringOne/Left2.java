package StringOne;
/*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"*/
public class Left2 {
    public static void main(String[] args) {
        Left2 left2 = new Left2();
        System.out.println(left2.left2("Hello"));
    }
    public String left2(String str) {
        return str.substring(2)+str.substring(0,2);
    }
}
