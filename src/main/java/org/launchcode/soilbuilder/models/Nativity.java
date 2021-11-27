package org.launchcode.soilbuilder.models;

public enum Nativity {
    NATIVE("wild native"),
    INVASIVE("invasive"),
    DOMESTIC("domesticated"),
    NATURALIZED("wild naturalized");

    private final String displayName;

    Nativity(String displayName) {this.displayName = displayName;}

    public String getDisplayName() {return displayName;}
}
