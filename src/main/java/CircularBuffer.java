public class CircularBuffer {
    private int bufferSize = 10;
    private int currentSize = 10;
    private String[] buffer;
    private int readPointer = 0; //let the reading pointer start at 0 position.
    private int writePointer = 0; //let the writing pointer start at 0 position.

    // Default constructor
    public CircularBuffer() {
        this.buffer = new String[bufferSize];
    }

    public boolean isEmpty() {
        return currentSize == bufferSize;
    }

    public void writeData(String input) {
        currentSize--;
        if(writePointer==bufferSize){
            writePointer = 0;
        }
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        return currentSize == 0;
    }

    public String readData() {
        if(readPointer==bufferSize){
            readPointer = 0;
        }
        return this.buffer[readPointer++];
    }

    public void setSize(int size) {
        this.buffer = new String[size];
        bufferSize = size;
        currentSize = bufferSize;
    }
}