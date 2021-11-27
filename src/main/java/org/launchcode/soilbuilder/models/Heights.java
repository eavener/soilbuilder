package org.launchcode.soilbuilder.models;

public enum Heights {
    THREESIX("3-6 inches"),
    SIXTWELVE("6-12 inches"),
    TWELVEEIGHTEEN("12-18 inches"),
    ONETWO("1-2 feet"),
    EIGHTEENTWENTYFOUR("18-24 inches"),
    EIGHTEENTHIRTY("18-30 inches"),
    TWOTHREE("2-3 feet"),
    TWOFOUR("2-4 feet"),
    THREEFOUR("3-4 feet"),
    THREEFIVE("3-5 feet");

    private final String displayName;

    Heights(String displayName) {this.displayName = displayName;}

    public String getDisplayName() {return displayName;}

}
