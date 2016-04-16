/*
 * 文件名：Singleton_Common.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Singleton_Common.java
 * 修改人：xiaofan
 * 修改时间：2016年4月4日
 * 修改内容：新增
 */
package singleton;

/**
 * 单例模式通用代码
 * 
 * 亦称：饿汉式单例
 * 
 * 饿汉式：编写简单，但是无法做到延迟创建对象，从而减小负载。
 * 
 * @author xiaofan
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    // 限制产生多个对象
    private Singleton() {

    }

    // 通过方法获得实例对象，JDK源码有很多例子，如size。
    // 此模式不会产生多个实例
    public static Singleton getSinglton() {
        return singleton;
    }

    // 类中其他方法，尽量static
    public static void doSomething() {

    }
}
