import org.example.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    void testAdd() {
        MathUtils mu = new MathUtils();
        assertEquals(5, mu.add(2, 3));
    }

    @Test
    void testDivide(){
        MathUtils mathUtils = new MathUtils();
        assertThrows(ArithmeticException.class, () -> {
            mathUtils.divide(7, 0);
        });
    }
}