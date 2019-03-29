package com.factory.factoryMethod;
/**
 * @Description: TODO
 * @ClassName JeepServiceImpl
 * @Auther: administer
 * @Date: 2019/3/29 10:33
 * @Version 1.0
 */
public class JeepServiceImpl implements ICarService {
    @Override
    public void getCar() {
        System.out.println("I am a jeep");
    }
}
