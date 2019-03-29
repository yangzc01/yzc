package test.factory;

import com.factory.staticFactory.CarFactory;
import com.factory.staticFactory.ICarService;

/**
 * @Description: TODO
 * @ClassName FactoryTest
 * @Auther: administer
 * @Date: 2019/3/29 10:44
 * @Version 1.0
 */
public class FactoryMethodTest {
    public static void main(String[] args){
        ICarService carService;
        CarFactory carFactory = new CarFactory();
        carService = carFactory.getCar("Jeep");
        carService.getCar();
    }
}
