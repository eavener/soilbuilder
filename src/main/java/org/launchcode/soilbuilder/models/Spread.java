package org.launchcode.soilbuilder.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Spread extends AbstractCharacteristics{

    @OneToMany(mappedBy = "spread")
    private final List<Seed> seeds = new ArrayList<>();

    public Spread(@Size(min = 3, message = "Name must be at least 3 characters long") String name) {
        this.name = name;
    }

    public Spread() {}

    public List<Seed> getSeeds() {
        return seeds;
    }
}
