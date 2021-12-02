package org.launchcode.soilbuilder.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Family extends AbstractEntity {

    @NotBlank
    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

    @OneToMany(mappedBy = "family")
    private final List<Seed> seeds = new ArrayList<>();

    public Family(String name) {this.name = name;}

    public Family() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seed> getSeeds() {
        return seeds;
    }

    @Override
    public String toString() {
        return name;
    }
}
