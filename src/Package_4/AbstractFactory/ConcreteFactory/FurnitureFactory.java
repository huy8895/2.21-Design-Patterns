package Package_4.AbstractFactory.ConcreteFactory;

import Package_4.AbstractFactory.AbstractFactory.FurnitureAbstractFactory;
import Package_4.AbstractFactory.MaterialType;

public class FurnitureFactory {

    private FurnitureFactory(){
    }

    public static FurnitureAbstractFactory getFactory(MaterialType type){
        switch (type){
            case PLASTIC:
               return new PlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported ");


        }
    }


}
