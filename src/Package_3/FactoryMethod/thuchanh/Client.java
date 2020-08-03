package Package_3.FactoryMethod.thuchanh;

public class Client {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.CANINE);
        System.out.println(animal.makeSound());
    }
}
