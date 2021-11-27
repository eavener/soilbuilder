package org.launchcode.soilbuilder.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity
public class Seed {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message="this field is required")
    private String commonName;

    private String scientificName;
    private LightNeeds sun;
    private WaterNeeds water;
    private Heights height;
    private Spreads width;
    private boolean deerResistant;
    private boolean deerFood;
    private boolean walnutResistant;
    private boolean beeFood;
    private boolean directSow;
    private Date sowBy;
    private boolean indoorStart;
    private Date indoorStartBy;
    private Date moveOutBy;
    private Family family;
    private boolean edible;
    private Nativity nativity;

    public Seed(String commonName, String scientificName, LightNeeds sun, WaterNeeds water, Heights height, Spreads width, boolean deerResistant, boolean deerFood, boolean walnutResistant, boolean beeFood, boolean directSow, Date sowBy, boolean indoorStart, Date indoorStartBy, Date moveOutBy, Family family, boolean edible, Nativity nativity) {
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.sun = sun;
        this.water = water;
        this.height = height;
        this.width = width;
        this.deerResistant = deerResistant;
        this.deerFood = deerFood;
        this.walnutResistant = walnutResistant;
        this.beeFood = beeFood;
        this.directSow = directSow;
        this.sowBy = sowBy;
        this.indoorStart = indoorStart;
        this.indoorStartBy = indoorStartBy;
        this.moveOutBy = moveOutBy;
        this.family = family;
        this.edible = edible;
        this.nativity = nativity;
    }

    public Seed(String commonName){
        this(commonName, null, null, null, null, null, false, false, false, false, false, null, false, null, null, null, false, null);
    }

    public Seed() {}

    public int getId() {
        return id;
    }

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

    public LightNeeds getSun() {
        return sun;
    }

    public void setSun(LightNeeds sun) {
        this.sun = sun;
    }

    public WaterNeeds getWater() {
        return water;
    }

    public void setWater(WaterNeeds water) {
        this.water = water;
    }

    public Heights getHeight() {
        return height;
    }

    public void setHeight(Heights height) {
        this.height = height;
    }

    public Spreads getWidth() {
        return width;
    }

    public void setWidth(Spreads width) {
        this.width = width;
    }

    public boolean isDeerResistant() {
        return deerResistant;
    }

    public void setDeerResistant(boolean deerResistant) {
        this.deerResistant = deerResistant;
    }

    public boolean isDeerFood() {
        return deerFood;
    }

    public void setDeerFood(boolean deerFood) {
        this.deerFood = deerFood;
    }

    public boolean isWalnutResistant() {
        return walnutResistant;
    }

    public void setWalnutResistant(boolean walnutResistant) {
        this.walnutResistant = walnutResistant;
    }

    public boolean isBeeFood() {
        return beeFood;
    }

    public void setBeeFood(boolean beeFood) {
        this.beeFood = beeFood;
    }

    public boolean isDirectSow() {
        return directSow;
    }

    public void setDirectSow(boolean directSow) {
        this.directSow = directSow;
    }

    public Date getSowBy() {
        return sowBy;
    }

    public void setSowBy(Date sowBy) {
        this.sowBy = sowBy;
    }

    public boolean isIndoorStart() {
        return indoorStart;
    }

    public void setIndoorStart(boolean indoorStart) {
        this.indoorStart = indoorStart;
    }

    public Date getIndoorStartBy() {
        return indoorStartBy;
    }

    public void setIndoorStartBy(Date indoorStartBy) {
        this.indoorStartBy = indoorStartBy;
    }

    public Date getMoveOutBy() {
        return moveOutBy;
    }

    public void setMoveOutBy(Date moveOutBy) {
        this.moveOutBy = moveOutBy;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public boolean isEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public Nativity getNativity() {
        return nativity;
    }

    public void setNativity(Nativity nativity) {
        this.nativity = nativity;
    }

    @Override
    public String toString() {
        return commonName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seed seed = (Seed) o;
        return getId() == seed.getId() && getCommonName().equals(seed.getCommonName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCommonName());
    }
}
