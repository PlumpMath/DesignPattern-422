/*
 * 文件名：Singleton4.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Singleton4.java
 * 修改人：xiaofan
 * 修改时间：2016年4月16日
 * 修改内容：新增
 */
package singleton;

/**
 * 
 * 单例模式--静态内部类
 * 
 * 延时加载，并且能保证线程安全
 * 
 * 把Singleton实例放到一个静态内部类中，这样就避免了静态实例在Singleton类加载的时候就创建对象，
 * 
 * 并且由于静态内部类只会被加载一次，所以这种写法也是线程安全的。
 * 
 * @author xiaofan
 */
public class Singleton4 {
    private Singleton4() {
    }

    private static class Holder {
        private static Singleton4 singleton = new Singleton4();
    }

    public static Singleton4 getSingleton() {
        return Holder.singleton;
    }
}
