package Package_4.AbstractFactory.Product;

import Package_4.AbstractFactory.AbstractProduct.Table;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Create wood table...");
    }
}
