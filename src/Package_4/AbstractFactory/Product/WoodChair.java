package Package_4.AbstractFactory.Product;

import Package_4.AbstractFactory.AbstractProduct.Chair;

public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create wood chair...");
    }
}
