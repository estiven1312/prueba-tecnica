import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pe.com.dev.model.Animal;
import pe.com.dev.service.AnimalService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class) // Integra Spring con JUnit 5
@ContextConfiguration(locations = "classpath:beans.xml")
public class AnimalServiceTest {
    @Autowired
    private AnimalService service;

    @Test
    public void testToDecodeInput() {
        List<String> animalData = Arrays.asList(
                "Perro|terrestre|Guau",
                "Pato|volador|Cuac",
                "Tiburón|acuatico|Glu Glu"
        );
        List<Animal> animals = service.processEncodingAnimalInput(animalData);
        assertEquals(3, animals.size());
        assertEquals("Perro", animals.get(0).getName());
        assertEquals("Pato", animals.get(1).getName());
        assertEquals("Tiburón", animals.get(2).getName());

        assertEquals("Tierra", animals.get(0).getHabitatStrategy().geHabitat());
        assertEquals("Aire", animals.get(1).getHabitatStrategy().geHabitat());
        assertEquals("Agua", animals.get(2).getHabitatStrategy().geHabitat());

        assertEquals("Guau", animals.get(0).getOnomatopoeia());
        assertEquals("Cuac", animals.get(1).getOnomatopoeia());
        assertEquals("Glu Glu", animals.get(2).getOnomatopoeia());
    }


    @Test
    public void testWhenHabitatIsNotValid() {
        List<String> animalData = Arrays.asList(
                "Perro|terrestre|Guau",
                "Pato|volador|Cuac",
                "Tiburón|marciano|Glu Glu"
        );
        assertThrows(IllegalArgumentException.class, () -> {
            service.processEncodingAnimalInput(animalData);
        });
    }


}
