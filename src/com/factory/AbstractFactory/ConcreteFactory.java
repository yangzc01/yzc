package com.factory.AbstractFactory;

/**
 * @Description: TODO
 * @ClassName CarFactory
 * @Auther: administer
 * @Date: 2019/3/29 15:27
 * @Version 1.0
 */
public class ConcreteFactory extends AbstractFactory {
    @Override
    public ICarService createCar(Class clz) {
        ICarService  carService = null;
        try {
            carService = (ICarService)Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return carService;
    }

    @Override
    public IEngineService createEngine(Class clz) {
        IEngineService  engineService = null;
        try {
            engineService = (IEngineService)Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return engineService;
    }
}
