package com.factory.staticFactory;

/**
 * @Description: TODO
 * @ClassName CarFactory
 * @Auther: administer
 * @Date: 2019/3/29 10:35
 * @Version 1.0
 */
public class CarFactory {
    /**
     * 获取对象实例
     * @param carType
     * @return
     */
    public ICarService getCar(String carType){
        if (carType.equals("BMW")){
            return new BMWServiceImpl();
        }else if (carType.equals("Jeep")){
            return new JeepServiceImpl();
        }else if (carType.equals("Benz")){
            return new BenzServiceImpl();
        }
        return null;
    }
}
