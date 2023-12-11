public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 5;
        int sum = calculator.add(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
}
