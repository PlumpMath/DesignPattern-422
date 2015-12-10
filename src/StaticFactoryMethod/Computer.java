/*
 * 文件名：Computer.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Computer.java
 * 修改人：yunhai
 * 修改时间：2015年12月10日
 * 修改内容：新增
 */
package StaticFactoryMethod;

/**
 * @author yunhai
 */
public class Computer {
    private IOutput output;

    public Computer(IOutput output) {
        this.output = output;
    }

    public void print() { // 打印方法
        output.out();
    }
}
