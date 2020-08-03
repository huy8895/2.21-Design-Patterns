package Package_4.AbstractFactory.Product;

import Package_4.AbstractFactory.AbstractProduct.Table;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Create plastic table...");
    }
}
