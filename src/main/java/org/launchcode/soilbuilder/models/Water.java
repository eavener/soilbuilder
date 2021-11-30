package org.launchcode.soilbuilder.models;

import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class Water extends AbstractCharacteristics{


    @ManyToMany(mappedBy = "waters")
    private final List<Seed> seeds = new ArrayList<>();

    public Water(@Size(min = 3, message = "Name must be at least 3 characters long") String name) {
        this.name = name;
    }

    public Water() {}

    public List<Seed> getSeeds() {
        return seeds;
    }
}
