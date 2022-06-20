package main;

public class FileLogger extends Logger {
    @Override
    public void log() {
        System.out.println("File was logged.");
    }
}
