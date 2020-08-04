import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayHi_should_return_Hello_World(){
        HelloWorld n = new HelloWorld();
        String result = n.sayHi();
        assertEquals("Hello World",result);
    }

    @Test
    public void sayHi_with_kanawat_should_return_Hello_Kanawat(){
        HelloWorld n = new HelloWorld();
        String result = n.sayHi("kanawat");
        assertEquals("Hello Kanawat",result);
    }

    @Test
    public void sayHi_with_top_should_return_Hello_Top(){
        HelloWorld n = new HelloWorld();
        String result = n.sayHi("top");
        assertEquals("Hello Top",result);
    }

}
