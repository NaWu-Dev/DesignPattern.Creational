package abstractFactory.animalFamily;

public class Dog implements Animal {

    public Dog() {
        System.out.println("DOG....");
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "WangWang";
    }
}
