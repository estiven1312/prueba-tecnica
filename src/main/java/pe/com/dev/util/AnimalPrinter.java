package pe.com.dev.util;

import pe.com.dev.model.Animal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class AnimalPrinter implements Printer<Animal>{
    private static final Logger logger = LogManager.getLogger(AnimalPrinter.class);

    public void print(Animal animal) {
        logger.info(
                "El animal es un {} y su habitat es {} y hace {}",
                animal.getName(),
                animal.getHabitatStrategy().geHabitat(),
                animal.getOnomatopoeia()
        );
    }

    @Override
    public void print(List<Animal> t) {
        t.forEach(this::print);
    }
}
