package org.launchcode.soilbuilder.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Family extends AbstractCharacteristics {

    @OneToMany(mappedBy = "family")
    private final List<Seed> seeds = new ArrayList<>();

    public Family(@Size(min = 3, message = "Name must be at least 3 characters long") String name) {
        this.name = name;
    }

    public Family() {}

    public List<Seed> getSeeds() {
        return seeds;
    }
}
