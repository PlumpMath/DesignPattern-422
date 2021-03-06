/*简单工厂模式是属于创建型模式，又叫做静态工厂方法（Static Factory Method）模式，但不属于23种GOF设计模式之一。简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族中最简单实用的模式，可以理解为是不同工厂模式的一个特殊实现。
        
简单工厂模式的实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类（这些产品类继承自一个父类或接口）的实例。

该模式中包含的角色及其职责

工厂（Creator）角色
        简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。
抽象产品（Product）角色
        简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。
具体产品（Concrete Product）角色
        是简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例。
 */
/**
 * @author yunhai
 *
 */
package StaticFactoryMethod;

/*
 * 假设有个Computer类需要实现输出，该怎么做呢？直接组合一个Printer，或者组合一个Output；
 * 
 * 如果重构代码，需要用BetterPrinter替代Printer，就需要修改Computer，只有1个还好，若有1000个Computer(⊙o⊙)…
 * 
 * 工厂模式提供的解决方案：让Computer组合Output，而与Printer分离。
 * 
 * 定义两个继承于Output的输出类Printer和BetterPrinter，由这两个类实现具体的操作。当要使用新的输出方法时，只需修改OutputFactory工厂类的getOutput方法即可。
 * 
 * Creator：Factory； Product：IOutput； Concrete Product：Printer、BetterPrinter。
 * 
 * 参考《疯狂Java讲义》；http://www.blogjava.net/jzgl-ever/archive/2008/07/26/217704.html
 * 
 * 有任何问题请联系我，3Q。
 */