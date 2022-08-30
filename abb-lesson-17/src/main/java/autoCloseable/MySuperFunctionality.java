package autoCloseable;

import java.io.Closeable;
import java.io.IOException;

public class MySuperFunctionality implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing automatically...");
    }
}
