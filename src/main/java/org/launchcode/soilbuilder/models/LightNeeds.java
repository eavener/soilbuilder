package org.launchcode.soilbuilder.models;

public enum LightNeeds {

    FULLSUN("full sun"),
    PARTIALSUN("partial sun"),
    PARTIALSHADE("partial shade"),
    FULLSHADE("full shade");

    private final String displayName;

    LightNeeds(String displayName) {this.displayName = displayName;}

    public String getDisplayName() {return displayName;}
}
