package com.singleton;

/**
 * @Description: 懒汉式
 * @ClassName FullSingletons
 * @Auther: administer
 * @Date: 2019/3/29 16:24
 * @Version 1.0
 */
public class LazySingleton {
    private static LazySingleton fullSingleton = null;
    private LazySingleton(){}
    public static synchronized LazySingleton getInstance(){
        if(null == fullSingleton){
            fullSingleton = new LazySingleton();
        }
        return  fullSingleton;
    }
}
