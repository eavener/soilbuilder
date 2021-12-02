package org.launchcode.soilbuilder.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Height extends AbstractEntity {

    @NotBlank
    private String name;

    @OneToMany(mappedBy = "height")
    private final List<Seed> seeds = new ArrayList<>();

    public Height(String name) {this.name = name;}

    public Height() {}

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
