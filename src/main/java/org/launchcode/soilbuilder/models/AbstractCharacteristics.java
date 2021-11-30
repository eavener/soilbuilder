package org.launchcode.soilbuilder.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AbstractCharacteristics extends AbstractEntity{

    @NotBlank
    @Size(min=3, message="Name must be at least 3 characters long") String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
