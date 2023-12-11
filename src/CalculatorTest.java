import org.junit.Test;
import static org.junit.Assert.assertEquals;

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

    @Test
    public void testAddPass() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        // Kết quả mong đợi là 8, nếu bằng nhau thì test pass
        assertEquals(8, result);
    }

    @Test
    public void testAddFail() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        // Kết quả mong đợi là 9 (sai), sẽ dẫn đến việc test fail
        assertEquals(9, result);
    }
}
