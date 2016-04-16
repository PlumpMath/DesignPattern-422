/*
 * 文件名：Singleton3.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Singleton3.java
 * 修改人：xiaofan
 * 修改时间：2016年4月16日
 * 修改内容：新增
 */
package singleton;

/**
 * 懒汉式单例模式--双重检查锁
 * 
 * 极大提升了并发度，进而提升了性能。在单例中new的情况非常少，绝大多数都是可以并行的读操作。
 * 
 * 因此在加锁前多进行一次null检查就可以减少绝大多数的加锁操作，执行效率提高的目的也就达到了。
 * 
 * @author xiaofan
 */
public class Singleton3 {
    private static volatile Singleton3 singleton = null;

    private Singleton3() {

    }

    /**
     * 双重检查锁.
     * 
     * @return Singleton3
     */
    public static Singleton3 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}
/*
 * 可见性指的是在一个线程中对该变量的修改会马上由工作内存（Work Memory）写回主内存（Main Memory），所以会马上反应在其它线程的读取操作中。
 * 
 * 顺便一提，工作内存和主内存可以近似理解为实际电脑中的高速缓存和主存，工作内存是线程独享的，主存是线程共享的。
 * 
 * volatile的第二层语义是禁止指令重排序优化。大家知道我们写的代码（尤其是多线程代码），由于编译器优化，在实际执行的时候可能与我们编写的顺序不同。编译器只保证程序执行结果与源代码相同，却不保证实际指令的顺序与源代码相同。
 * 
 * 这在单线程看起来没什么问题，然而一旦引入多线程，这种乱序就可能导致严重问题。volatile关键字就可以从语义上解决这个问题。
 * 
 * 禁止指令重排优化这条语义直到jdk1.5以后才能正确工作。此前的JDK中即使将变量声明为volatile也无法完全避免重排序所导致的问题。
 * 
 * 所以，在jdk1.5版本前，双重检查锁形式的单例模式是无法保证线程安全的。
 */

// 如何延时加载，且能保证线程安全呢？
/*
 * 把Singleton实例放到一个静态内部类中，这样就避免了静态实例在Singleton类加载的时候就创建对象，
 * 
 * 并且由于静态内部类只会被加载一次，所以这种写法也是线程安全的。详见Singleton4
 */
