package Package_4.AbstractFactory;

import Package_4.AbstractFactory.AbstractFactory.FurnitureAbstractFactory;
import Package_4.AbstractFactory.ConcreteFactory.FurnitureFactory;

public class Client {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.WOOD);
        factory.createChair().create();

        factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);
        factory.createTable().create();

    }
}
