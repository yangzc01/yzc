package test.factory;

import com.factory.factoryMethod.*;
/**
 * @Description: TODO
 * @ClassName factoryMethod
 * @Auther: administer
 * @Date: 2019/3/29 13:06
 * @Version 1.0
 */
public class StaticFactoryTest {
    public static void main(String[] args) {
        IFactory factory = new ConcreteFactory();
        ICarService carService = factory.createCar(JeepServiceImpl.class);
        carService.getCar();

        ICarService carService1 = factory.createCar(BenzServiceImpl.class);
        carService1.getCar();
    }
}
