package org.example;

public class Database {
    private String name;
    private String size;

    public Database(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void logDatabase(Logger logger) {
        String  details = name + ": " + size;
        System.out.println(logger.getLoggerName());
        logger.log(details);
    }
}
