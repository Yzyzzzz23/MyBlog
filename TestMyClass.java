import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
    @Test
    public void testMethod() {
        MyClass myClass = new MyClass();
        int result = myClass.add(2, 3);
        assertEquals(5, result);
    }
}
