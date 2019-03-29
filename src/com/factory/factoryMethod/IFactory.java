package com.factory.factoryMethod;
/**
 * @Description: 工厂接口
 * @ClassName IFactory
 * @Auther: administer
 * @Date: 2019/3/29 11:36
 * @Version 1.0
 */
public interface IFactory {
    ICarService createCar(Class clz);

    ICarService createCar();
}
