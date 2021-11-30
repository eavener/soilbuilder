package org.launchcode.soilbuilder.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SoilPlot extends AbstractEntity{

    @NotBlank(message = "Each plot must have a nickname")
    @Size(min=3, message="Name must be at least 3 characters long")
    private String plotName;

    private Light sun;
    private Water water;
    private Integer length;
    private Integer width;
    private boolean walnutResistant;

    @OneToMany
    private final List<SoilTest> soilTests = new ArrayList<>();

    public SoilPlot(@Size(min=3, message="Name must be at least 3 characters long") String plotName, Light sun, Water water, Integer length, Integer width, boolean walnutResistant) {
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

    public Light getSun() {
        return sun;
    }

    public void setSun(Light sun) {
        this.sun = sun;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
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
