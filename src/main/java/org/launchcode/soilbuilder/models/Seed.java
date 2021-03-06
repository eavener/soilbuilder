package org.launchcode.soilbuilder.models;


import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Seed extends AbstractEntity{

    @NotBlank(message="this field is required")
    private String commonName;

    private String scientificName;

    @ManyToOne
    @NotNull(message="this field is required")
    private Height height;

    @ManyToOne
    @NotNull(message="this field is required")
    private Light light;

    @ManyToOne
    @NotNull(message="this field is required")
    private Water water;

    @ManyToOne
    @NotNull(message="this field is required")
    private Spread spread;

    @Nullable
    private Date sowBy;

    @ManyToOne
    @NotNull(message="Field required")
    private Family family;

    @ManyToMany
    private List<Tag> tags = new ArrayList<>();

    public Seed(String commonName, String scientificName, Height height, Light light, Water water, Spread spread, Date sowBy, Family family) {
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.height = height;
        this.light = light;
        this.water = water;
        this.spread = spread;
        this.sowBy = sowBy;
        this.family = family;
    }

    public Seed() {}

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Spread getSpread() {
        return spread;
    }

    public void setSpread(Spread spread) {
        this.spread = spread;
    }

    public Date getSowBy() {
        return sowBy;
    }

    public void setSowBy(Date sowBy) {
        this.sowBy = sowBy;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

    @Override
    public String toString() {
        return commonName;
    }
}
