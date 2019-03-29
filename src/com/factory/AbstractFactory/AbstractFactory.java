package com.factory.AbstractFactory;

/**
 * @Description: TODO
 * @ClassName AbstractFactory
 * @Auther: administer
 * @Date: 2019/3/29 15:11
 * @Version 1.0
 */
public abstract class AbstractFactory {
    public abstract ICarService createCar(Class clz);
    public abstract IEngineService createEngine(Class clz);
}
