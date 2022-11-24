package creational_patterns.builder.director;

import creational_patterns.builder.build.CarBuilder;
import creational_patterns.builder.build.impl.ElectricCarBuilder;
import creational_patterns.builder.build.impl.GasCarBuilder;
import creational_patterns.builder.product.ElectricCarProduct;
import creational_patterns.builder.product.GasCarProduct;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/24
 */
public class BuilderDirector {
    
    public GasCarProduct buildGasCar(CarBuilder gasBuilder) {
        gasBuilder.addEngine(1F).paint("gas").addWheel(1);
        GasCarProduct gasCarProduct = ((GasCarBuilder) gasBuilder).build();
        return gasCarProduct;
    }
    
    public ElectricCarProduct buildElectricCar(CarBuilder electricCarBuilder) {
        electricCarBuilder.addEngine(2F).paint("electric").addWheel(2);
        ElectricCarProduct electricCarProduct = ((ElectricCarBuilder) electricCarBuilder).build();
        return electricCarProduct;
    }


}
