import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    @Test
    public void create_new_buffer_should_empty() {
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer is not empty.", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0;i<10;i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer is not full.", result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B_from_buffer() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

    @Test
    public void create_new_buffer_with_set_size_20_and_write_10string_should_not_full() {
        CircularBuffer cb = new CircularBuffer();
        cb.setSize(20);
        for(int i=0;i<10;i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertFalse("Buffer is full.", result);
    }

    @Test
    public void write_AZ1_to_AZ10_then_read_AZ1_to_AZ10_then_write_AZ11_should_read_AZ11() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0;i<10;i++) {
            cb.writeData("AZ" + (i+1));
        }
        for(int i=0;i<10;i++){
            assertEquals("AZ" + (i+1), cb.readData());
        }
        cb.writeData("AZ11");
        assertEquals("AZ11", cb.readData());
    }

}
