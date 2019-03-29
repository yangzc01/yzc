package com.factory.factoryMethod;
/**
 * @Description: TODO
 * @ClassName BenzFactory
 * @Auther: administer
 * @Date: 2019/3/29 13:03
 * @Version 1.0
 */
public class BenzFactory implements IFactory {
    @Override
    public ICarService createCar(Class clz) {
        return null;
    }

    @Override
    public BenzServiceImpl createCar() {
        return null;
    }
}
