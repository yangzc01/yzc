package com.factory.factoryMethod;

/**
 * @Description: TODO
 * @ClassName JeepFactory
 * @Auther: administer
 * @Date: 2019/3/29 13:05
 * @Version 1.0
 */
public class JeepFactory implements IFactory {
    @Override
    public ICarService createCar(Class clz) {
        return new JeepServiceImpl();
    }

    @Override
    public BenzServiceImpl createCar() {
        return null;
    }
}
