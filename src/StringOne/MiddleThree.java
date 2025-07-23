/*Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
*/


public class MiddleThree {
    public static void main(String[] args) {
        MiddleThree middleThree =  new MiddleThree();
        System.out.println(middleThree.middleThree("Solving"));
        System.out.println(middleThree.middleThree("and"));
        System.out.println(middleThree.middleThree("candy"));

    }
    public String middleThree(String str) {
        if (str.length() == 3){
            return str;
        }
        else {
            return str.substring((str.length()-1)/2-1, ((str.length()-1)/2)+2);
        }
    }
}
