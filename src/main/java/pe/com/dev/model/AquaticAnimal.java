package pe.com.dev.model;

import pe.com.dev.model.strategy.AquaticHabitatStrategy;
import pe.com.dev.model.strategy.FlyingHabitatStrategy;

public class AquaticAnimal extends Animal {
    public AquaticAnimal(String name, String onomatopeia) {
        super(name, onomatopeia, new AquaticHabitatStrategy());
    }
}
