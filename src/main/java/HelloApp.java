public class HelloApp {



public static void main(String[] args) {

    if (args.length > 0) {
        String name = args[0];
        System.out.println("Hello, " + name + "!");
    } else { 
        System.out.println("Hello, World!");
    }


public static void main(String[] args) {

    // Assign name from argument if present, otherwise default to "World"
    String name = (args.length > 0) ? args[0] : "World";

    // Display greeting
    System.out.println("Hello, " + name + "!");
 feature/UC3-display-name-default
}


}
