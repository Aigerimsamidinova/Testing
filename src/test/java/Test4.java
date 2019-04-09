import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Test4 {
    @Test
    public  void testCircle(){
        TestApp testApp=new TestApp();
        double triangleArea=testApp.triangleArea(3, 5);
        Assertions.assertEquals(triangleArea,"pass");
    }
}
