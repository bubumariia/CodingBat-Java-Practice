package StringOne;

public class HelloName {
    public static void main(String[] args){
        HelloName helloName = new HelloName();
        System.out.println(helloName.helloName("Bob"));
    }
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
}
