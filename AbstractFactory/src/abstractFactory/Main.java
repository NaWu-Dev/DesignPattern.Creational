package abstractFactory;

import abstractFactory.animalFamily.Animal;
import abstractFactory.factories.AbstractFactory;
import abstractFactory.factories.AnimalFactory;
import abstractFactory.factories.FactoryProvider;

public class Main {
    
    public static void main (String[] args) {

        FactoryProvider factoryProvider = new FactoryProvider();
        AnimalFactory animalFactory = (AnimalFactory) factoryProvider.getFactory("Animal");
        animalFactory.create("Dog");


    }
    
}
