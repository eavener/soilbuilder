package org.launchcode.soilbuilder.models.dto;

import org.launchcode.soilbuilder.models.Seed;
import org.launchcode.soilbuilder.models.Tag;

import javax.validation.constraints.NotNull;

public class SeedTagDTO {

    @NotNull
    private Seed seed;

    @NotNull
    private Tag tag;

    public SeedTagDTO() {}

    public Seed getSeed() {
        return seed;
    }

    public void setSeed(Seed seed) {
        this.seed = seed;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
