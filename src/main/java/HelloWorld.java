public class HelloWorld {

    public String sayHi() {
        return ("Hello World");
    }

    public String sayHi(String input_text) {
        String firstChar = input_text.substring(0, 1).toUpperCase();
        String remainText = input_text.substring(1);
        return ("Hello " + firstChar + remainText);
    }

}
