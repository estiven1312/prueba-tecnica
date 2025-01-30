package pe.com.dev.model;

import pe.com.dev.model.strategy.FlyingHabitatStrategy;

public class FlyingAnimal extends Animal {
    public FlyingAnimal(String name, String onomatopeia) {
        super(name, onomatopeia, new FlyingHabitatStrategy());
    }
}
