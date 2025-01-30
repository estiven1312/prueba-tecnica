package pe.com.dev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.com.dev.service.AnimalService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        AnimalService service = applicationContext.getBean("animalService", AnimalService.class);
        service.printAnimals(service.processEncodingAnimalInput(List.of(args)));
    }
}