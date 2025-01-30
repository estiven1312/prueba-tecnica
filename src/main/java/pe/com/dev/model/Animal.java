package pe.com.dev.model;

import pe.com.dev.model.strategy.HabitatStrategy;

public abstract class Animal {
    private String name;
    private String onomatopoeia;
    private HabitatStrategy habitatStrategy;
    public Animal(String name, String onomatopoeia, HabitatStrategy habitatStrategy) {
        this.name = name;
        this.onomatopoeia = onomatopoeia;
        this.habitatStrategy = habitatStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOnomatopoeia() {
        return onomatopoeia;
    }

    public void setOnomatopoeia(String onomatopoeia) {
        this.onomatopoeia = onomatopoeia;
    }

    public HabitatStrategy getHabitatStrategy() {
        return habitatStrategy;
    }

    public void setHabitatStrategy(HabitatStrategy habitatStrategy) {
        this.habitatStrategy = habitatStrategy;
    }
}
