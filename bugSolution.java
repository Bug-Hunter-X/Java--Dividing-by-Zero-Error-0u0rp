public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        try {
            y = 5 / x;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
            y = 0; // or handle the error in a more appropriate manner
        }
        System.out.println(y);
    }
}