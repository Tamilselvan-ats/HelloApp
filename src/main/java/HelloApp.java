public class HelloApp {

public static void main(String[] args) {

    // Assign name from argument if present, otherwise default to "World"
    String name = (args.length > 0) ? args[0] : "World";

    // Display greeting
    System.out.println("Hello, " + name + "!");
}


}
