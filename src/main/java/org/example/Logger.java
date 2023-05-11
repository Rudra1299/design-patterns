package org.example;

import java.time.LocalDate;

public class Logger {
    public static volatile Logger loggerInstance;
    private String loggerName;

    public String getLoggerName() {
        return loggerName;
    }

    private Logger(String name) {
        this.loggerName = name;
    }

    public static Logger getLoggerInstance(String loggerName) {
        Logger result = loggerInstance;
        if(result != null) {
            return result;
        }

        //synchronized block for the thread safety
        synchronized (Logger.class) {
            if(loggerInstance == null) {
                loggerInstance = new Logger(loggerName);
            }

            return loggerInstance;
        }

    }

    public void log(String message) {
        String logString = String.valueOf(LocalDate.now()) + ":" + message;
        System.out.println(logString);
    }


}
