/*
 * 文件名：Test.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Test.java
 * 修改人：yunhai
 * 修改时间：2015年12月10日
 * 修改内容：新增
 */
package StaticFactoryMethod;

import org.junit.Test;

/**
 * 测试方法
 * 
 * @author yunhai
 */
public class TestMethod {
    @Test
    public void testCommon() {
        Factory factory = new Factory();
        // System.out.println(factory.getOutput()); // 输出类型
        Computer computer = new Computer(factory.getOutput());
        computer.print();
    }

    /**
     * 利用反射获得类型，当增加output方法时无需修工厂，从而达到工厂分离的效果.
     * 
     */
    @Test
    public void testReflect() {
        Factory factory = new Factory();
        IOutput out1 = factory.getOutputType("Printer");
        IOutput out2 = factory.getOutputType("BetterPrinter111");
        out1.out();
        if (out2 == null) {
            System.out.println("暂不提供该打印方式");
        } else {
            out2.out();
        }
    }
}
