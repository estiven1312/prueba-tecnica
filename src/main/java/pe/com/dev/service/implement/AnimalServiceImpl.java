package pe.com.dev.service.implement;

import pe.com.dev.model.Animal;
import pe.com.dev.model.AquaticAnimal;
import pe.com.dev.model.FlyingAnimal;
import pe.com.dev.model.LandAnimal;
import pe.com.dev.service.AnimalService;
import pe.com.dev.util.Printer;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalServiceImpl implements AnimalService {

    private final Printer<Animal> animalPrinter;

    public AnimalServiceImpl(Printer<Animal> animalPrinter) {
        this.animalPrinter = animalPrinter;
    }

    @Override
    public List<Animal> processEncodingAnimalInput(List<String> inputEncode) {
        return inputEncode.stream().map(AnimalServiceImpl::generateAnimalFromString).collect(Collectors.toList());
    }
    @Override
    public void printAnimals(List<Animal> animals) {
        animalPrinter.print(animals);
    }

    private static Animal generateAnimalFromString(String data) {
        String[] parts = data.split("\\|");
        String name = parts[0];
        String type = parts[1];
        String onomatopoeia = parts[2];

        switch (type.toLowerCase()) {
            case "terrestre":
                return new LandAnimal(name, onomatopoeia);
            case "acuatico":
                return new AquaticAnimal(name, onomatopoeia);
            case "volador":
                return new FlyingAnimal(name, onomatopoeia);
            default:
                throw new IllegalArgumentException("Tipo de animal no válido: " + type);
        }
    }

}
