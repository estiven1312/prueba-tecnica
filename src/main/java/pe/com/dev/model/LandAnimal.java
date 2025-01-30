package pe.com.dev.model;

import pe.com.dev.model.strategy.LandHabitatStrategy;

public class LandAnimal extends Animal{
    public LandAnimal(String name, String onomatopeia) {
        super(name, onomatopeia, new LandHabitatStrategy());
    }
}
