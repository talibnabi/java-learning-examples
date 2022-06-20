package main;

public class LogManager {
    //1.database
    //2.file
    //3.mail
    public void log(int logType) {
        if (logType == 1) {
            System.out.println("database");
        } else if (logType == 2) {
            System.out.println("file");
        } else {
            System.out.println("mail");
        }
    }
}
