package org.launchcode.soilbuilder.models;

public enum WaterNeeds {
    WET("wet"),
    AVERAGE("average"),
    MOIST("moist, well-drained"),
    DRY("dry"),
    DROUGHT("drought-tolerant");

    private final String displayName;

    WaterNeeds(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
