# Proyecto de Animales (Prueba técnica)

Este proyecto está desarrollado en Java y utiliza Maven como herramienta de construcción. El objetivo del proyecto es procesar y mostrar información sobre diferentes tipos de animales y sus hábitats.

## Componentes de la Solución

### Modelos

- `Animal`: Clase base para todos los animales.
- `AquaticAnimal`: Clase que representa a los animales acuáticos.
- `LandAnimal`: Clase que representa a los animales terrestres.
- `FlyingAnimal`: Clase que representa a los animales voladores.

### Estrategias de Hábitat

- `AquaticHabitatStrategy`: Estrategia para animales acuáticos.
- `LandHabitatStrategy`: Estrategia para animales terrestres.
- `FlyingHabitatStrategy`: Estrategia para animales voladores.
- `AquaticHabitatStrategy.java`: Clase que representa a los animales terrestres.

### Uso del Patrón Strategy para Hábitat

El patrón Strategy se utiliza en este proyecto para definir diferentes comportamientos de hábitat para los animales sin cambiar las clases de los animales. Este patrón permite que el comportamiento de hábitat sea encapsulado en clases separadas y que pueda ser cambiado dinámicamente en tiempo de ejecución.



### Servicios

- `AnimalService`: Interfaz que define los métodos para procesar y mostrar animales.

### Utilidades

- `AnimalPrinter`: Clase que implementa la interfaz `Printer` para imprimir información de los animales.

### Definición de Beans en XML

El proyecto utiliza Spring para la gestión de dependencias y la configuración de beans. A continuación se muestra un ejemplo de cómo se definen los beans en un archivo XML que se encuentra en la carpeta resources (`beans.xml`):

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- Define the AnimalPrinter bean -->
    <bean id="animalPrinter" class="pe.com.dev.util.AnimalPrinter" />

    <!-- Define the AnimalService bean with a constructor argument -->
    <bean id="animalService" class="pe.com.dev.service.implement.AnimalServiceImpl">
        <constructor-arg ref="animalPrinter" />
    </bean>
</beans>
```

### Compilación y Ejecución

Para compilar y ejecutar el proyecto, sigue los siguientes pasos:

1. Asegúrate de tener Java 8 o superior y Maven 3.6.0 o superior instalados en tu sistema.
2. Clona el repositorio del proyecto:
    ```sh
    git clone <URL_DEL_REPOSITORIO>
    ```
3. Navega al directorio del proyecto:
    ```sh
    cd <NOMBRE_DEL_PROYECTO>
    ```
4. Compila y ejecuta el proyecto utilizando Maven con el siguiente comando:
    ```sh
    mvn exec:java -Dexec.mainClass="pe.com.dev.Main" -Dexec.args='"Perro|terrestre|Guau" "Pato|volador|Cuac" "Tiburón|acuatico|Glu Glu"'
    ```
5. Alternativamente, puedes compilar el proyecto y generar el archivo JAR utilizando Maven con el siguiente comando:
    ```sh
    mvn clean install
    ```
6. Luego, ejecuta el archivo JAR generado con el siguiente comando:
    ```sh
    java -jar target/prueba-tecnica-1.0.jar "Perro|terrestre|Guau" "Pato|volador|Cuac" "Tiburón|acuatico|Glu Glu"
    ```

Este comando ejecutará el archivo JAR `prueba-tecnica-1.0.jar` con los argumentos especificados para procesar y mostrar la información de los animales.