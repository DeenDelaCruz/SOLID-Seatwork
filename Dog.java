public class Dog extends Pet implements PetBehavior {
    public Dog(String petName, String ownerName) {
        super(petName, ownerName);
    }

    @Override
    public String makeSound() {
        return "Bark!";
    }

    @Override
    public String eat() {
        return "Dog is eating food.";
    }
}
