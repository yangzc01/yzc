package com.factory.staticFactory;
/**
 * @Description: TODO
 * @ClassName BenzServiceImpl
 * @Auther: administer
 * @Date: 2019/3/29 10:34
 * @Version 1.0
 */
public class BenzServiceImpl implements ICarService {
    @Override
    public void getCar() {
        System.out.println("I am a Benz");
    }
}
