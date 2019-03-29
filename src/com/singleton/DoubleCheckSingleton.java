package com.singleton;

/**
 * @Description: 饱汉模式的双重锁模式
 * @ClassName DoubleLockSingleton
 * @Auther: administer
 * @Date: 2019/3/29 16:28
 * @Version 1.0
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton doubleLockSingleton = null;
    private DoubleCheckSingleton(){}
    public static DoubleCheckSingleton getInstance(){
        if(null == doubleLockSingleton){
            synchronized (DoubleCheckSingleton.class){
                if (null == doubleLockSingleton ) {

                    doubleLockSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleLockSingleton;
    }
}
