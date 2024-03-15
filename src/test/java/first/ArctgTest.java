package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArctgTest {
    private Arctg arctg;
    private final double e = 0.01;
    @BeforeEach
    void before() {
        arctg = new Arctg();
    }
    @Test
    void calc() throws ArctgException {
        double result = arctg.calculate(1, 100);
        Assertions.assertEquals(Math.atan(1), result, e);
        result = arctg.calculate(0.5, 100);
        Assertions.assertEquals(Math.atan(0.5), result, e);
    }

    @Test
    void checkResult() throws ArctgException {
        double result = arctg.calculate(1, 100);
        boolean check = Math.abs(result) <= Math.PI;
        Assertions.assertTrue(check);
    }

    @Test
    void calcOutOfRange() {
        Assertions.assertThrows(ArctgException.class,() -> arctg.calculate(2, 100));
    }
}
