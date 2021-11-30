package org.launchcode.soilbuilder.models;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class Light extends AbstractCharacteristics {

    @OneToMany(mappedBy = "light")
    private final List<Seed> seeds = new ArrayList<>();

    public Light(@Size(min = 3, message = "Name must be at least 3 characters long") String name) {
        this.name = name;
    }

    public Light() {}

    public List<Seed> getSeeds() {
        return seeds;
    }
}
