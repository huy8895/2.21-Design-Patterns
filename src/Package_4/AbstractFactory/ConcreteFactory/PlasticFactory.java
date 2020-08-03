package Package_4.AbstractFactory.ConcreteFactory;

import Package_4.AbstractFactory.AbstractFactory.FurnitureAbstractFactory;
import Package_4.AbstractFactory.AbstractProduct.Chair;
import Package_4.AbstractFactory.AbstractProduct.Table;
import Package_4.AbstractFactory.Product.PlasticChair;
import Package_4.AbstractFactory.Product.PlasticTable;

public class PlasticFactory extends FurnitureAbstractFactory {
    public Chair createChair(){
        return new PlasticChair();
    }

    public Table createTable(){
        return new PlasticTable();
    }
}
