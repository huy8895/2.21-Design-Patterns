package Package_4.AbstractFactory.AbstractFactory;

import Package_4.AbstractFactory.AbstractProduct.Chair;
import Package_4.AbstractFactory.AbstractProduct.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();

    public abstract Table createTable();
}
