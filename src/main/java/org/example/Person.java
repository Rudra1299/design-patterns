package org.example;

public class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void LogPerson(Logger logger) {
        String details = name  + " " + email;
        System.out.println(logger.getLoggerName());
        logger.log(details);
    }

}
