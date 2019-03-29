package com.factory.AbstractFactory;

/**
 * @Description: TODO
 * @ClassName EngineBenzServiceImpl
 * @Auther: administer
 * @Date: 2019/3/29 15:31
 * @Version 1.0
 */
public class BMWEngineServiceImpl implements IEngineService {
    @Override
    public void createEngine() {
        System.out.println("I am a BMW-ENGINE");
    }
}
