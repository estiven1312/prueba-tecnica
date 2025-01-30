package pe.com.dev.service;

import pe.com.dev.model.Animal;

import java.util.List;

public interface AnimalService {
    List<Animal> processEncodingAnimalInput(List<String> inputEncode);

    void printAnimals(List<Animal> animals);
}
