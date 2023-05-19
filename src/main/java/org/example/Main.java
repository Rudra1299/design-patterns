package org.example;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLoggerInstance("log1");
        Logger logger2 = Logger.getLoggerInstance("log2");

        if(logger1 == logger2) {
            System.out.println("The belong to same instance");
        }
        //passing logger1 to person and database instance
        Person person = new Person("some name", "example.com");
        Database db = new Database("postgresql", "2TB");

        person.LogPerson(logger1);
        db.logDatabase(logger2);
    }
}