package com.factory.factoryMethod;

/**
 * @Description: TODO
 * @ClassName BMWFactory
 * @Auther: administer
 * @Date: 2019/3/29 13:04
 * @Version 1.0
 */
public class BMWFactory implements IFactory {
    @Override
    public ICarService createCar(Class clz) {
        return null;
    }

    @Override
    public BenzServiceImpl createCar() {
        return null;
    }
}
