package org.launchcode.soilbuilder.models;

public enum Spreads {
    SIXTWELVE("6-12 inches"),
    ONETWO("1-2 feet"),
    TWOTHREE("2-3 feet"),
    THREEFOUR("3-4 feet"),
    FOURFIVE("4-5 feet");

    private final String displayName;

    Spreads(String displayName) {this.displayName = displayName;}

    public String getDisplayName() {return displayName;}
}
