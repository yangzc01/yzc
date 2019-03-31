#工厂模式中介
　　简单工厂 ：用来生产同一等级结构中的任意产品。（对于增加新的产品，无能为力）
　　工厂方法 ：用来生产同一等级结构中的固定产品。（支持增加任意产品）　　
　　抽象工厂 ：用来生产不同产品族的全部产品。（对于增加新的产品，无能为力；支持增加产品族）
#单例模式
1、每种单例写法的优、缺点。
饿汉式
优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
懒汉式
优点：线程安全
缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同
双重检查
Double-Check概念对于多线程开发者来说不会陌生，如代码中所示，我们进行了两次if (singleton == null)检查，这样就可以保证线程安全了。这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
优点：线程安全；延迟加载；效率较高。
优点：线程安全；延迟加载；效率较高。
静态内部类
这种方式跟饿汉式方式采用的机制类似，但又有不同。两者都是采用了类装载的机制来保证初始化实例时只有一个线程。不同的地方在饿汉式方式是只要Singleton类被装载就会实例化，
没有Lazy-Loading的作用，而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。
类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
优点：避免了线程不安全，延迟加载，效率高。
3、破坏单例模式的方式有哪些？并且归纳总结。
1）、反射
通过反射获得单例类的构造函数，由于该构造函数是private的，通过setAccessible(true)指示反射的对象在使用时应该取消 Java 语言访问检查,使得私有的构造函数能够被访问，这样使得单例模式失效。
示例：
public class Test {
    public static void main(String[] args) throws Exception{
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();

        Constructor<EagerSingleton> constructor = EagerSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        EagerSingleton eagerSingleton1 = constructor.newInstance();
        System.out.println(eagerSingleton.hashCode());
        System.out.println(eagerSingleton1.hashCode());

    }
}
防止通过反射破坏单例模式，构造函数被成功调用两次。需要在构造函数中对实例化次数进行统计，大于一次就抛出异常。
2）、序列化
通过对Singleton的序列化与反序列化得到的对象是一个新的对象，这就破坏了Singleton的单例性
