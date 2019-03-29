package test.factory;

import com.factory.AbstractFactory.*;

/**
 * @Description: TODO
 * @ClassName AbstractFactoryTest
 * @Auther: administer
 * @Date: 2019/3/29 15:41
 * @Version 1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args){
        AbstractFactory factory = new ConcreteFactory();
        ICarService carService = factory.createCar(BenzServiceImpl.class);
        carService.getCar();
        IEngineService engineService = factory.createEngine(BenzEngineServiceImpl.class);
        engineService.createEngine();
    }
}
