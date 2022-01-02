package org.apenaleth.java17.playground.features;

public class RecordFeature {

    public static void main(String[] args) {

        createJhonDoe();

        createJaneDoe();
    }

    /**
     * Basic record creation
     *
     */
    public static void createJhonDoe() {

        var jhonDoe = new PersonRecord("Jhon Doe", 30, true);
        System.out.println(String.format("Hi, my name is %s and I'm %s years old.", jhonDoe.name(), jhonDoe.age()));

    }

    /**
     * Validation in the record class.
     * Custom constructor.
     *
     */
    public static void createJaneDoe() {

        var jhonDoe = new PersonRecord("Jane Doe");
        System.out.println(String.format("Hi, my name is %s and I'm %s years old.", jhonDoe.name(), jhonDoe.age()));

    }
}

record PersonRecord(String name, int age, boolean isAlive){

    public PersonRecord(String name) {
        this(name, 35, true);
    }

    public PersonRecord {
        if (name == null) {
            throw new NullPointerException("Name can not be null");
        }

        if (age < 0) {
            throw new IllegalArgumentException("Age must be greater than one");
        }
    }
}
