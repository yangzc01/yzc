package com.factory.factoryMethod;

/**
 * @Description: TODO
 * @ClassName ConcreteFactory
 * @Auther: administer
 * @Date: 2019/3/29 13:23
 * @Version 1.0
 */
public class ConcreteFactory implements IFactory {
    @Override
    public ICarService createCar(Class clz) {
        ICarService  carService = null;
        try {
            carService= (ICarService) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  carService;
    }

    @Override
    public BenzServiceImpl createCar() {
        return null;
    }
}
