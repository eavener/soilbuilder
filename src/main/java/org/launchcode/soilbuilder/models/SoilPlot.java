package org.launchcode.soilbuilder.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class SoilPlot extends AbstractEntity{

    @NotBlank(message = "Each plot must have a nickname")
    @Size(min=3, message="Name must be at least 3 characters long")
    private String plotName;

    @ManyToOne
    private Light light;

    @ManyToOne
    private Water water;

    private Integer length;
    private Integer width;
    private Integer hardinessZone;
    private Date firstFrost;
    private Date lastFrost;
    private boolean walnutResistant;

    @OneToMany (mappedBy = "soilPlot")
    private final List<SoilTest> soilTests = new ArrayList<>();

    public SoilPlot(String plotName, Light light, Water water, Integer length, Integer width, boolean walnutResistant) {
        this.plotName = plotName;
        this.light = light;
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

    public Integer getHardinessZone() {
        return hardinessZone;
    }

    public void setHardinessZone(Integer hardinessZone) {
        this.hardinessZone = hardinessZone;
    }

    public Date getFirstFrost() {
        return firstFrost;
    }

    public void setFirstFrost(Date firstFrost) {
        this.firstFrost = firstFrost;
    }

    public Date getLastFrost() {
        return lastFrost;
    }

    public void setLastFrost(Date lastFrost) {
        this.lastFrost = lastFrost;
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
