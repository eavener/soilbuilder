package org.launchcode.soilbuilder.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Water extends AbstractEntity{

    @NotBlank
    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

    @OneToMany(mappedBy = "water")
    private final List<Seed> seeds = new ArrayList<>();

    @OneToMany(mappedBy = "water")
    private final List<SoilPlot> soilPlots = new ArrayList<>();

    public Water(String name) {
        this.name = name;
    }

    public Water() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seed> getSeeds() {
        return seeds;
    }

    public List<SoilPlot> getSoilPlots() {return soilPlots;}

    @Override
    public String toString() {
        return name;
    }
}
