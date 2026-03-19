public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();
            int count = 0;
            for (String name : args) {
                names.append(name);
                if (count < args.length - 1) {
                    names.append(", ");
                }
                count++;
            }
            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}
