package bean;

import java.util.function.Consumer;

public class MyAnonymConsumer implements Consumer<String> {
    //Consumer is functional interface
    @Override
    public void accept(String text) {
        System.out.println(text);
    }
}
