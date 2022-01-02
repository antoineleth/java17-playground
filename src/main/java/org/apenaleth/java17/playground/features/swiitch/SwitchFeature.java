package org.apenaleth.java17.playground.features.swiitch;

import java.util.stream.Stream;

public class SwitchFeature {

    public static void main(String[] args) {
        Stream.of("Thrall", "Vol'jin", "Hogger").forEach(hero ->
                System.out.println(hero + " is a " + checkHeroRace(hero)));
    }

    private static String checkHeroRace(final String hero) {
        return switch (hero) {
            case "Thrall", "Hellscream" -> "orc";
            case "Vol'jin" ->  "troll";
            case "Magni Bronzebeard" -> "dwarf";
            default -> "murloc";
        };
    }
}
