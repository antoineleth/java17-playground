package org.apenaleth.java17.playground.features.sealed;

public non-sealed class Dog implements DomesticPet {

    @Override
    public String getPetName() {
        return "Hi! I'm Toby";
    }
}
