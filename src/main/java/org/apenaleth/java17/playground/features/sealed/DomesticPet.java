package org.apenaleth.java17.playground.features.sealed;

public sealed interface DomesticPet permits Dog, Cat, Fish {

    String getPetName();
}
