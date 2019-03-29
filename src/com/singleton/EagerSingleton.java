package com.singleton;

/**
 * @Description: 饿汉式
 * @ClassName EagerSingleton
 * @Auther: administer
 * @Date: 2019/3/29 16:21
 * @Version 1.0
 */
public class EagerSingleton {
    private static EagerSingleton INSTANCE = new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}
