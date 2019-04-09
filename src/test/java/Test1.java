import org.junit.jupiter.api.Assertions;

import org.junit.Test;

public class Test1 {

    @Test
    public void testArray(){
        TestApp testApp=new TestApp();
        boolean array =testApp.array(2, 5);
        Assertions.assertTrue(array, "pass");
    }
}