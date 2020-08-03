package Package_3.FactoryMethod.thuchanh;

public class AnimalFactory {
    public static Animal getAnimal(AnimalType type){
        switch (type){
            case CANINE:
                return new Dog();
            case FELINE:
                return new Cat();
            default:
                throw new IllegalArgumentException("This Animal type is unknown!");
        }

    }
}
