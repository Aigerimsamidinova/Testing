import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test2 {
    @Test
    public void testIsPrimeNum(){
        TestApp testApp=new TestApp();
        boolean isPrimeNum =testApp.isPrimeNum(4);
        Assertions.assertTrue(isPrimeNum, "True");
    }
}
