package com.singleton;

/**
 * @Description: 静态内部类
 * @ClassName Singleton
 * @Auther: administer
 * @Date: 2019/3/29 16:36
 * @Version 1.0
 */
public class Singleton {
    private Singleton() {}

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
