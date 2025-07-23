
/*Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false*/

public class EndsLy {
    public static void main(String[] args) {
        EndsLy endsLy = new EndsLy();
        System.out.println(endsLy.endsLy("oddly"));
        System.out.println(endsLy.endsLy(""));
        System.out.println(endsLy.endsLy("y"));


    }
    public boolean endsLy(String str) {

        if (str.length() < 2){
            return false;
        } else if (str.substring(str.length()-2).equals("ly")) {
            return true;

        } else{
            return false;
        }
    }
}
