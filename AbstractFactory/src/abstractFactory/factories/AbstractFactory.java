package abstractFactory.factories;

public interface AbstractFactory<T> {

    T create(String animalType);

}
