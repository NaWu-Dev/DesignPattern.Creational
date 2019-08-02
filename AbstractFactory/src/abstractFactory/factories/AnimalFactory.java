package abstractFactory.factories;

import abstractFactory.animalFamily.Animal;
import abstractFactory.animalFamily.Bear;
import abstractFactory.animalFamily.Dog;
import abstractFactory.animalFamily.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return  new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        } else if ("Bear".equalsIgnoreCase(animalType)){
            return new Bear();
        }

        return null;
    }
}
