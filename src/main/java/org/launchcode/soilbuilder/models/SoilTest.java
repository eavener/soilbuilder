package org.launchcode.soilbuilder.models;

import java.util.Date;
import java.util.Objects;

public class SoilTest {

    private int id;
    private static int nextId = 1;

    private String plotName;
    private Date testDate;
    private Integer hardinessZone;
    private Date firstFrost;
    private Date lastFrost;
    private boolean walnut;
    private boolean deer;
    private Double nitrogen;
    private Double phosphorous;
    private Double potassium;
    private Double sulfur;
    private Double calcium;
    private Double magnesium;
    private Double copper;
    private Double iron;
    private Double manganese;
    private Double zinc;
    private Double boron;
    private Double chloride;
    private Double molybdenum;
    private Double organicMatter;
    private Double pH;
    private Double salinity;
    private Double cationExchangeCapacity;

    public SoilTest() {
        id = nextId;
        nextId++;
    }

    public SoilTest(String plotName, Date testDate, Integer hardinessZone, Date firstFrost, Date lastFrost, boolean walnut, boolean deer, Double nitrogen, Double phosphorous, Double potassium, Double sulfur, Double calcium, Double magnesium, Double copper, Double iron, Double manganese, Double zinc, Double boron, Double chloride, Double molybdenum, Double organicMatter, Double pH, Double salinity, Double cationExchangeCapacity) {
        this();
        this.plotName = plotName;
        this.testDate = testDate;
        this.hardinessZone = hardinessZone;
        this.firstFrost = firstFrost;
        this.lastFrost = lastFrost;
        this.walnut = walnut;
        this.deer = deer;
        this.nitrogen = nitrogen;
        this.phosphorous = phosphorous;
        this.potassium = potassium;
        this.sulfur = sulfur;
        this.calcium = calcium;
        this.magnesium = magnesium;
        this.copper = copper;
        this.iron = iron;
        this.manganese = manganese;
        this.zinc = zinc;
        this.boron = boron;
        this.chloride = chloride;
        this.molybdenum = molybdenum;
        this.organicMatter = organicMatter;
        this.pH = pH;
        this.salinity = salinity;
        this.cationExchangeCapacity = cationExchangeCapacity;
    }

    public int getId() {
        return id;
    }

    public String getPlotName() {
        return plotName;
    }

    public void setPlotName(String plotName) {
        this.plotName = plotName;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
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

    public boolean isWalnut() {
        return walnut;
    }

    public void setWalnut(boolean walnut) {
        this.walnut = walnut;
    }

    public boolean isDeer() {
        return deer;
    }

    public void setDeer(boolean deer) {
        this.deer = deer;
    }

    public Double getNitrogen() {
        return nitrogen;
    }

    public void setNitrogen(Double nitrogen) {
        this.nitrogen = nitrogen;
    }

    public Double getPhosphorous() {
        return phosphorous;
    }

    public void setPhosphorous(Double phosphorous) {
        this.phosphorous = phosphorous;
    }

    public Double getPotassium() {
        return potassium;
    }

    public void setPotassium(Double potassium) {
        this.potassium = potassium;
    }

    public Double getSulfur() {
        return sulfur;
    }

    public void setSulfur(Double sulfur) {
        this.sulfur = sulfur;
    }

    public Double getCalcium() {
        return calcium;
    }

    public void setCalcium(Double calcium) {
        this.calcium = calcium;
    }

    public Double getMagnesium() {
        return magnesium;
    }

    public void setMagnesium(Double magnesium) {
        this.magnesium = magnesium;
    }

    public Double getCopper() {
        return copper;
    }

    public void setCopper(Double copper) {
        this.copper = copper;
    }

    public Double getIron() {
        return iron;
    }

    public void setIron(Double iron) {
        this.iron = iron;
    }

    public Double getManganese() {
        return manganese;
    }

    public void setManganese(Double manganese) {
        this.manganese = manganese;
    }

    public Double getZinc() {
        return zinc;
    }

    public void setZinc(Double zinc) {
        this.zinc = zinc;
    }

    public Double getBoron() {
        return boron;
    }

    public void setBoron(Double boron) {
        this.boron = boron;
    }

    public Double getChloride() {
        return chloride;
    }

    public void setChloride(Double chloride) {
        this.chloride = chloride;
    }

    public Double getMolybdenum() {
        return molybdenum;
    }

    public void setMolybdenum(Double molybdenum) {
        this.molybdenum = molybdenum;
    }

    public Double getOrganicMatter() {
        return organicMatter;
    }

    public void setOrganicMatter(Double organicMatter) {
        this.organicMatter = organicMatter;
    }

    public Double getpH() {
        return pH;
    }

    public void setpH(Double pH) {
        this.pH = pH;
    }

    public Double getSalinity() {
        return salinity;
    }

    public void setSalinity(Double salinity) {
        this.salinity = salinity;
    }

    public Double getCationExchangeCapacity() {
        return cationExchangeCapacity;
    }

    public void setCationExchangeCapacity(Double cationExchangeCapacity) {
        this.cationExchangeCapacity = cationExchangeCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoilTest userSoil = (SoilTest) o;
        return getId() == userSoil.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
