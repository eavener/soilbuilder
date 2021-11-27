package org.launchcode.soilbuilder.models;

public enum Family {
    BRASSICA("brassica"),
    LEGUME("legume"),
    GRASS("grass"),
    VEGETABLE("vegetable"),
    FRUIT("fruit"),
    OTHER("other");

    private final String displayName;

    Family(String displayName) {this.displayName = displayName;}

    public String getDisplayName() {return displayName;}
}
