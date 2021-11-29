package org.launchcode.soilbuilder.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class SoilPlot extends AbstractEntity{

    @NotBlank(message = "Each plot must have a nickname")
    @Size(min=3, message="Name must be at least 3 characters long")
    private String plotName;

    private LightNeeds sun;
    private WaterNeeds water;
    private Integer length;
    private Integer width;
    private boolean walnutResistant;

    public SoilPlot(@Size(min=3, message="Name must be at least 3 characters long") String plotName, LightNeeds sun, WaterNeeds water, Integer length, Integer width, boolean walnutResistant) {
        this.plotName = plotName;
        this.sun = sun;
        this.water = water;
        this.length = length;
        this.width = width;
        this.walnutResistant = walnutResistant;
    }

    public SoilPlot() {}

    public String getPlotName() {
        return plotName;
    }

    public void setPlotName(String plotName) {
        this.plotName = plotName;
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

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public boolean isWalnutResistant() {
        return walnutResistant;
    }

    public void setWalnutResistant(boolean walnutResistant) {
        this.walnutResistant = walnutResistant;
    }

    @Override
    public String toString() {
        return plotName;
    }
}
