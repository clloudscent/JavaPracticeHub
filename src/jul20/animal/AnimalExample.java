package jul20.animal;


public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.sound();
        Cat cat = new Cat();
//        cat.sound();

        AnimalHandler animalHandler = new AnimalHandler();
        animalHandler.makeSound(dog);
        animalHandler.makeSound(cat);
    }
}
