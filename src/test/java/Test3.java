import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Test3 {
    @Test
    public  void testCircle(){
        TestApp testApp=new TestApp();
        double circleArea=testApp.circleArea(3);
        Assertions.assertEquals(circleArea,"True");
    }
}
