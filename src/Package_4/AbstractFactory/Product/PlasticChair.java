package Package_4.AbstractFactory.Product;

import Package_4.AbstractFactory.AbstractProduct.Chair;

public class PlasticChair implements Chair {

    @Override
    public void create() {
        System.out.println("Create plastic chair...");
    }
}
