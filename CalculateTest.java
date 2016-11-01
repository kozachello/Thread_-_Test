import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Козак on 28.10.2016.
 */
public class CalculateTest {
    @Test(timeout = 50)
    public void calc() throws Exception {
        Calculate calculate = new Calculate();
        int x = calculate.calc(1,1);
        assertEquals("testing of expected result and actual",2,x);
    }
}