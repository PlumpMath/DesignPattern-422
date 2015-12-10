/*
 * 文件名：OutputFactory.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Factory.java
 * 修改人：yunhai
 * 修改时间：2015年12月10日
 * 修改内容：新增
 */
package StaticFactoryMethod;

/**
 * @author yunhai
 */
public class Factory {
    public IOutput getOutput() {
        // return new Printer(); // output:I'm Printer
        return new BetterPrinter(); // output:I'm BetterPrinter
    }

    public IOutput getOutputType(String type) {
        IOutput output = null;
        try { // 利用反射得到输出类型
            output = (IOutput) Class.forName("StaticFactoryMethod." + type).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            // e.printStackTrace(); // 吃掉异常，IOutput判断是否为null
        }
        return output;
    }
}
