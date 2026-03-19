public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            
            String result = nameBuilder.toString();
            // Removes the trailing ", " using substring
            if (result.length() > 0) {
                result = result.substring(0, result.length() - 2);
            }
            
            System.out.println("Hello, " + result + "!");
        }
    }
}
