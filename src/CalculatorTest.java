import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 4; // Thay đổi giá trị từ 3 thành 4
        int b = 6; // Thay đổi giá trị từ 5 thành 6
        int sum = calculator.add(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

    @Test
    public void testAddPass() {
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 6); // Thay đổi giá trị từ 3 và 5 thành 4 và 6
        // Kết quả mong đợi là 10, nếu bằng nhau thì test pass
        assertEquals(10, result);
    }

    @Test
    public void testAddFail() {
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 6); // Thay đổi giá trị từ 3 và 5 thành 4 và 6
        // Kết quả mong đợi là 11 (sai), sẽ dẫn đến việc test fail
        assertEquals(11, result);
    }
}
