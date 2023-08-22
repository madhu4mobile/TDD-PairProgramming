import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }
    @Test
    public void testAddWithOutParameters() {
        Calculator calculator = new Calculator();
        int  result = calculator.requirement1_withoutparameter(0);
        assertEquals(0,result );
    }
    
/*    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 3);
        assertEquals(7, result);
    }*/
    /* 
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 6);
        assertEquals(24, result);
    }
    
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(15, 3);
        assertEquals(5, result);
    }
    
    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    } */
}
