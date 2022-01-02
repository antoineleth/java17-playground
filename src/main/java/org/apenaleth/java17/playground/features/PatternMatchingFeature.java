package org.apenaleth.java17.playground.features;

import java.util.stream.Stream;

public class PatternMatchingFeature {

    public static void main(String[] args) {

        Stream.of(new Male(30),
                        new Female(40))
                .forEach(PatternMatchingFeature::checkGender);

    }

    private static void checkGender(Human human) {
        if (human instanceof Male male && male.age > 0) {
            System.out.println("Hi! I'm a male and I'm " + male.age);
        } else if (human instanceof Female female && female.age > 0) {
            System.out.println("Hi! I'm a female and I'm " + female.age);
        }
    }
}

abstract class Human {

    int age;

    protected Human(int age) {
        this.age = age;
    }
}

class Male extends Human {
    public Male(int age) {
        super(age);
    }
}

class Female extends Human {
    public Female(int age) {
        super(age);
    }
}
