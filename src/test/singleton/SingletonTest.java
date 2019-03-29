package test.singleton;

import java.lang.reflect.Constructor;

/**
 * @Description: TODO
 * @ClassName Test
 * @Auther: administer
 * @Date: 2019/3/29 16:51
 * @Version 1.0
 */
public class SingletonTest {
    private static int count = 0;

    private static SingletonTest instance = null;

    private SingletonTest(){
        synchronized (SingletonTest.class) {
            if(count > 0){
                throw new RuntimeException("创建了两个实例");
            }
            count++;
        }

    }
    public static SingletonTest getInstance() {
        if(instance == null) {
            instance = new SingletonTest();
        }
        return instance;
    }
    public static void main(String[] args) throws Exception{
        SingletonTest singletonTest = SingletonTest.getInstance();
        Constructor<SingletonTest> constructor = SingletonTest.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonTest singletonTest1 = constructor.newInstance();
        System.out.println(singletonTest.hashCode());
        System.out.println(singletonTest1.hashCode());

    }
}
