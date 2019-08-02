package abstractFactory.animalFamily;

public class Bear implements Animal {
    @Override
    public String getType() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "Hoho";
    }
}
