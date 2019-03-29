package com.factory.staticFactory;

/**
 * @Description: TODO
 * @ClassName BMWServiceImpl
 * @Auther: administer
 * @Date: 2019/3/29 10:30
 * @Version 1.0
 */
public class BMWServiceImpl implements ICarService {
    @Override
    public void getCar() {
        System.out.println("I am a BMW");
    }
}
