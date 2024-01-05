import com.yourcompany.logic.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach(){
        sumCalculator=new SumCalculator();

    }

    @Test
    public void testSumCalculatorN1(){
        //When
        int actual = sumCalculator.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSumCalculatorN3(){
        //When
        int actual = sumCalculator.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSumCalculatorN0(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int actual = sumCalculator.sum(0);
        });
    }

}
