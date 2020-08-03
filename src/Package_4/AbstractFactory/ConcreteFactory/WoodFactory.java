package Package_4.AbstractFactory.ConcreteFactory;

import Package_4.AbstractFactory.AbstractFactory.FurnitureAbstractFactory;
import Package_4.AbstractFactory.AbstractProduct.Chair;
import Package_4.AbstractFactory.AbstractProduct.Table;
import Package_4.AbstractFactory.Product.WoodChair;
import Package_4.AbstractFactory.Product.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {
    public Chair createChair(){
        return new WoodChair();
    }

    public Table createTable(){
        return new WoodTable();
    }
}
