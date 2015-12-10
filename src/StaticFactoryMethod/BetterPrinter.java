/*
 * 文件名：BetterPrinter.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： BetterPrinter.java
 * 修改人：yunhai
 * 修改时间：2015年12月10日
 * 修改内容：新增
 */
package StaticFactoryMethod;

/**
 * 新的打印方法
 * 
 * @author yunhai
 */
public class BetterPrinter implements IOutput {

    @Override
    public void out() {
        System.out.println("I'm BetterPrinter");
    }

}
