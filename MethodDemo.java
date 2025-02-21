public class MethodDemo {
    public static void main(String[] args) {
        greet();
        printMessage("This is my message!");
    }

    // Method to print greeting message
    public static void greet() {
        System.out.println("Hello from the greet method!"); 
    }

    // Method to print a given message
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
