package core.concretes;

import core.abstracts.LoggerService;
import jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
    private JLoggerManager jLoggerManager;

    public JLoggerManagerAdapter(JLoggerManager jLoggerManager) {
        this.jLoggerManager = jLoggerManager;
    }


    @Override
    public void logToSystem(String message) {
        jLoggerManager.log(message);
    }
}
