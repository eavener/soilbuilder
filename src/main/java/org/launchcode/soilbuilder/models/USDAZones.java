package org.launchcode.soilbuilder.models;

public enum USDAZones {
    ZEROA("0A"),
    ZEROB("OB"),
    ONEA("1A"),
    ONEB("1B"),
    TWOA("2A"),
    TWOB("2B"),
    THREEA("3A"),
    THREEB("3B"),
    FOURA("4A"),
    FOURB("4B"),
    FIVEA("5A"),
    FIVEB("5B"),
    SIXA("6A"),
    SIXB("6B"),
    SEVENA("7A"),
    SEVENB("7B"),
    EIGHTA("8A"),
    EIGHTB("8B"),
    NINEA("9A"),
    NINEB("9B"),
    TENA("10A"),
    TENB("10B"),
    ELEVENA("11A"),
    ELEVENB("11B"),
    TWELVEA("12A"),
    TWELVEB("12B"),
    THRIRTEENA("13A"),
    THIRTEENB("13B");

    private final String displayName;

    USDAZones(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
